/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Utils.SQLUtil;
import bo.Sale;
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
public class SaleHandler {
    SQLUtil sqlUtil;

    public SaleHandler() {
        sqlUtil = new SQLUtil();
    }
    public List<Sale> loadSale(){
        List<Sale> sales = new ArrayList<>();
        String cmd = "select * from Sale;";
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int sId = rs.getInt("sId");
                String sName = rs.getString("sName");
                int sSold = rs.getInt("sSold");
                int cId = rs.getInt("cId");
                int petId = rs.getInt("pId");
                
                Sale sale = new Sale( sId, sName, sSold, cId, petId);
                sales.add(sale);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }
    
    public int addSale(String Name, int cost, int custId, int petId){
    String cmdTemplate = "insert into Sale(sName, sSold, cId, pId) values('%s',%d,%d,%d);";
    String cmd = String.format(cmdTemplate, Name, cost, custId, petId);
    return sqlUtil.executeUpdate(cmd);
    }
    
    public int getSaleId(String SaleName, int petId) throws SQLException{
        List<Sale> s = new ArrayList<>();
        String cmd = String.format("select * from Sale where sName ='%s' and pId = '%s';" , SaleName, petId);
        ResultSet rs = sqlUtil.executeQuery(cmd);
        while(rs.next()){
            int sId = rs.getInt("sId");
            Sale sale = new Sale(sId);
            s.add(sale);
        }
        return s.get(0).getsId();
    }
    
    public int deleteSale(int saleId){
        String cmd = String.format("Delete from Sale where sId = %d", saleId);
        return sqlUtil.executeUpdate(cmd);
    }
}
