/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class Sale {
    private int sId;
    private String sName;//service
    private int sSold;//cost
    private int cId;
    private int petId;

    public Sale(int sId, String sName, int sSold, int cId, int petId) {
        this.sId = sId;
        this.sName = sName;
        this.sSold = sSold;
        //this.sDiscount = sDiscount;
        this.cId = cId;
        this.petId = petId;
    }

    public Sale(String sName, int sSold, int cId, int petId) {
        this.sName = sName;
        this.sSold = sSold;
        this.cId = cId;
        this.petId = petId;
    }

    public Sale(int sId) {
        this.sId = sId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsSold() {
        return sSold;
    }

    public void setsSold(int sSold) {
        this.sSold = sSold;
    }

    //public float getsDiscount() {
        //return sDiscount;
    //}

    //public void setsDiscount(float sDiscount) {
        //this.sDiscount = sDiscount;
    //}

    public int getGmrId() {
        return cId;
    }

    public void setGmrId(int cId) {
        this.cId = cId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
    
    
}
