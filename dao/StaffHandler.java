/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Utils.SQLUtil;
import bo.Staff;
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
public class StaffHandler {
    private SQLUtil sqlUtil;

    public StaffHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public Staff login(String username, String password){
        Staff stf = null;
        try {
        String cmd = String.format("select * from Groomer where gEmail = '%s' and gPhone = '%s';", username, password);
        ResultSet rs = sqlUtil.executeQuery(cmd);
              if(rs != null && rs.next()){
              int gId = rs.getInt("gId");
              String gEmail = rs.getString("gEmail");
              String gName = rs.getString("gName");
              String gPhone = rs.getString("gPhone");
              int salary = rs.getInt("salary");
              int bId = rs.getInt("bId");
              stf = new Staff(gId, gName, gPhone, gEmail, salary, bId);
              return stf;
              }
        } catch (SQLException ex) {
                Logger.getLogger(StaffHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            return stf;
        }
    
    public List<Staff> LoadStaff(String keyword){
    String cmd = String.format("select * from Groomer where gName like '%s'", "%"+keyword+"%");//obtain data from database
    List<Staff> staff = new ArrayList<>();
    ResultSet rs = sqlUtil.executeQuery(cmd);                                   //populate coded table with data from databse
        try {
            while(rs.next()){                                                   //loading obtianed data to variables
                int gId = rs.getInt("gId");
                String gName = rs.getString("gName");
                String gPhone = rs.getString("gPhone");
                String gEmail = rs.getString("gEmail");
                int salary = rs.getInt("salary");
                int BId = rs.getInt("BId");
                Staff stf = new Staff(gId, gName, gPhone, //loading var to new staff entity
                                        gEmail, salary, BId);
                staff.add(stf);                                               //loading new staff member into coded table
            }   
        } catch (SQLException ex) {
                Logger.getLogger(StaffHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    return staff;
    }
    
    public int deleteStaff(int EId){
        String stm = String.format("delete from Groomer where gId = '%d'", EId);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int addStaff(String Name, String Address, String Phone, String Email, int salary, int bId){
        String cmdTemplate= "insert into Groomer(gName, gPhone, gEmail, salary, bId) values('%s', '%s', '%s', '%d', %d)";
        String cmd = String.format(cmdTemplate, Name, Phone, Email, salary, bId);
        return sqlUtil.executeUpdate(cmd);
    }
    
    public int getStaffId(String Name) throws SQLException{
    String cmd = String.format("select * from groomer where gName = '%s'", Name);
    ResultSet rs = sqlUtil.executeQuery(cmd);
    int gId = rs.getInt("gId");
    return gId;
    }
}
