/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Utils.SQLUtil;
import bo.Customer;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author caniz
 */
public class CustomerHandler {
    private  SQLUtil sqlUtil;

    public CustomerHandler() {
        sqlUtil = new SQLUtil();
    }
    private int cId = 0;
    public List<Customer> loadCustomer(){
    List<Customer> result = new ArrayList<>();
    String cmd = "Select *  from Customer;";
    ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                cId = rs.getInt("cId");
                String cName = rs.getString("cName");
                String cPhone = rs.getString("cPhone");
                String cEmail = rs.getString("cEmail");                
                Customer c = new Customer(cId, cName, cPhone, cEmail);
                result.add(c);//adds customer details from database to code table for manipulation
            }
        } catch (SQLException ex) {
                ex.printStackTrace();        
        }
        return result;
}
    public int addCustomer(String cName, String cPhone, String cEmail){
        String cmdTemplate = "insert into Customer(cName, cPhone, cEmail) values('%s','%s','%s');";
        String cmd = String.format(cmdTemplate, cName, cPhone, cEmail);
        return sqlUtil.executeUpdate(cmd);
    }
    
    public int getcustomerId(String Name){
            List<Customer> c = new ArrayList<>();
            String cmd = String.format("select cId from Customer where cName = '%s';", Name);
            ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int id = rs.getInt("cId");
                Customer cust = new Customer(id);
                c.add(cust);
                return cust.getcId();
            }
        } catch (SQLException ex) {
                ex.printStackTrace();        
        }
            
        return -1;
    }
    public int deleteCustomer(int cId){
        String cmd = String.format("delete from Customer where cId = %d;",cId);
        return sqlUtil.executeUpdate(cmd);
    }
}


