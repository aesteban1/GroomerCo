/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bo.*;
import Utils.SQLUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caniz
 */
public class OrderHandler {
    private SQLUtil sqlUtil;
    public OrderHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public List<Orders> loadOrders(String keyword){ //loads appointments from database into table
        List<Orders> Appointments = new ArrayList<>();
        String cmd = String.format("""
                     select sId, cName, cPhone, cEmail, pName, pAnimal, breed, sSold, sName from sale s1
                     join customer c1 on c1.cId = s1.cId
                     join pet p1 on p1.pId = s1.pId
                     where cName like '%s';""","%"+keyword+"%");
        ResultSet rs = sqlUtil.executeQuery(cmd);       
        try {
            while(rs.next()){
                int sId = rs.getInt("sId");
                String cName = rs.getString("cName");
                String cPhone = rs.getString("cPhone");
                String cEmail = rs.getString("cEmail");
                String pName = rs.getString("pName");
                String animal = rs.getString("pAnimal");
                String aBreed = rs.getString("breed");
                int serviceCost = rs.getInt("sSold");
                String ServiceName = rs.getString("sName");
                
                Orders Order = new Orders(sId, cName, cPhone, cEmail,pName, animal,aBreed, ServiceName, serviceCost);
                Appointments.add(Order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Appointments;
    }

    public Orders addOrder(int sId, String cName, String cPhone, String cEmail, String pName, String animal,String aBreed, String ServiceName, int serviceCost){
        Orders newOrder = new Orders(sId, cName, cPhone, cEmail,pName, animal,aBreed, ServiceName, serviceCost);
        return newOrder;
    }
}