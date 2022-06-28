/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Utils.SQLUtil;
import bo.Service;
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
public class ServiceHandler {
    private final SQLUtil sqlUtil;

    public ServiceHandler(){
        sqlUtil = new SQLUtil();
    }
    
    public List<Service> loadService(){
        List<Service> results = new ArrayList<>();
        String cmd = "select serviceId, serviceName from Service;";
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int sId = rs.getInt("serviceId");
                String sName = rs.getString("serviceName");
                Service s = new Service(sId,sName);
                results.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return results;
    }
    
    public int addService(String serviceName, int cost){
        String cmdTemplate= "insert into Service(serviceName, cost) values('%s', %d)";
        String cmd = String.format(cmdTemplate, serviceName, cost);
        return sqlUtil.executeUpdate(cmd);
    }
    
    public int serviceCost(String serviceName){
        List<Service> s = new ArrayList<>();
        String cmd =String.format("select cost from Service where serviceName = '%s';", serviceName);
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int cost = rs.getInt("cost");
                Service svc = new Service(cost);
                s.add(svc);
                return svc.getCost();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s.get(0).getCost();
    }
    
    public int getServiceId(String ServiceName) throws SQLException{
        String cmd =String.format("select * from Service where serviceName = '%s';", ServiceName);
        ResultSet rs = sqlUtil.executeQuery(cmd);
        int sId = rs.getInt("serviceId");
        return sId;
    }
    
}
