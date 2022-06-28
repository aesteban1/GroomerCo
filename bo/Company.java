/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class Company {
    private int Bid;
    private String bName;
    private String bAddress;
    private String bPhone;
    private String bEmail;
    private int year;

    public Company(int Bid, String bName, String bAddress, String bPhone,String bEmail,  int year) {
        this.Bid = Bid;
        this.bName = bName;
        this.bAddress = bAddress;
        this.bEmail = bEmail;
        this.bPhone = bPhone;
        this.year = year;
    }

    public Company(int Bid) {
        this.Bid = Bid;
    }
    
    

    public int getBid() {
        return Bid;
    }

    public void setBid(int Bid) {
        this.Bid = Bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getbPhone() {
        return bPhone;
    }

    public void setbPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public String getbEmail() {
        return bEmail;
    }

    public void setbEmail(String bEmail) {
        this.bEmail = bEmail;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getbName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
