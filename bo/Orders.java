/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.Vector;

/**
 *
 * @author caniz
 */
public class Orders {
    private int sId;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
    private String cName;
    private String cPhone;
    private String cEmail;
    private String pName;
    private String animal;
    private String aBreed;
    private String ServiceType;
    private int ServiceCost;

    public Orders(int sId, String cName, String cPhone, String cEmail, String pName, String animal, String aBreed, String ServiceType, int ServiceCost) {
        this.sId = sId;
        this.cName = cName;
        this.cPhone = cPhone;
        this.cEmail = cEmail;
        this.pName = pName;
        this.animal = animal;
        this.aBreed = aBreed;
        this.ServiceType = ServiceType;
        this.ServiceCost = ServiceCost;
    }
    

    
    
    public Vector getRow(){
    Vector vec = new Vector();
    vec.add(this.sId);
    vec.add(this.cName);
    vec.add(this.cPhone);
    vec.add(this.cEmail);
    vec.add(this.pName);
    vec.add(this.animal);
    vec.add(this.aBreed);
    vec.add(this.ServiceType);
    vec.add(this.ServiceCost);
    return vec;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getaBreed() {
        return aBreed;
    }

    public void setaBreed(String breed) {
        this.aBreed = aBreed;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getServiceCost() {
        return ServiceCost;
    }

    public void setServiceCost(int ServiceCost) {
        this.ServiceCost = ServiceCost;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }
    
    
    
}
