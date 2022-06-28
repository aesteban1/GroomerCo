/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Utils.SQLUtil;
import bo.Company;
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
public class CompanyHandler {
    SQLUtil sqlUtil = new SQLUtil();
    
    public List<Company> loadBusiness(){
        List<Company> company = new ArrayList<>();
        String cmd = "select * from Business;";
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int bId = rs.getInt("bId");
                String bName = rs.getString("bName");
                String bAddress = rs.getString("bAddress");
                int year = rs.getInt("year");
                String bPhone = rs.getString("bPhone");
                String bEmail = rs.getString("bEmail");
                Company c = new Company(bId, bName, bAddress, bEmail, bPhone, year);
                company.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return company;        
    }
    
    public int getBusinessId(String bName){
        List<Company> com = new ArrayList<>();
        String cmd = String.format("select bId from Business where bName = '%s';", bName);
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int bId = rs.getInt("bId");
                Company c = new Company(bId);
                com.add(c);
                return c.getBid();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
