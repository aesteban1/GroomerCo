/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class Service {
    private int serviceID;
    private String serviceName;
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Service(int serviceId, String serviceName) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
    }
    
    public Service(int serviceId, String serviceName, int cost) {
        this.serviceID = serviceId;
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public Service(int serviceID) {
        this.serviceID = serviceID;
    }


    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return getServiceName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
