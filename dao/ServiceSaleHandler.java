/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Utils.SQLUtil;
/**
 *
 * @author caniz
 */
public class ServiceSaleHandler {
    SQLUtil sqlUtil;

    public ServiceSaleHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public int AddServiceSale(int svcId, int saleId){
        String cmd = String.format("insert into ServiceSale(svcId, saleId) values(%d,%d);", svcId, saleId);
        return sqlUtil.executeUpdate(cmd);
    }
    
    
    
}
