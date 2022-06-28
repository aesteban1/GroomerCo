/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class ServiceSale {
    private int saleId=0;
    private int svcId=0;

    public ServiceSale(int saleId, int svcId) {
        this.svcId = svcId;
        this.saleId = saleId;
    }

    public int getServiceId() {
        return saleId;
    }

    public void setServiceId(int serviceId) {
        this.saleId = serviceId;
    }

    public int getPetId() {
        return svcId;
    }

    public void setPetId(int petId) {
        this.svcId = petId;
    }
    
    
}
