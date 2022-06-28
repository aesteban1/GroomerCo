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
public class Staff {
    private int gId;
    private String gName;
    private String gPhone;
    private String gEmail;
    private int bId;
    private int Salary;

    public Staff(int gId, String gName, String gPhone, String gEmail, int bId, int Salary) {
        this.gId = gId;
        this.gName = gName;
        this.gPhone = gPhone;
        this.gEmail = gEmail;
        this.bId = bId;
        this.Salary = Salary;
    }
    
    public Vector getRow(){
    Vector vec = new Vector();
    vec.add(this.gId);
    vec.add(this.gName);
    vec.add(this.gPhone);
    vec.add(this.gEmail);
    vec.add(this.bId);
    vec.add(this.Salary);
    return vec;
    }
    
    public int gId() {
        return gId;
    }

    public void setEId(int gId) {
        this.gId = gId;
    }

    public String getName() {
        return gName;
    }

    public void setName(String Name) {
        this.gName = Name;
    }

    public String getPhone() {
        return gPhone;
    }

    public void setPhone(String Phone) {
        this.gPhone = Phone;
    }

    public String getEmail() {
        return gEmail;
    }

    public void setEmail(String Email) {
        this.gEmail = Email;
    }

    public int getBId() {
        return bId;
    }

    public void setBId(int BId) {
        this.bId = BId;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    
    
}
