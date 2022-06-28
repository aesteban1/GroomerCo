/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class Customer {
    private int cId;
    private String Name;
    private String Phone;
    private String Email;

    public Customer(int cId, String Name, String Phone, String Email) {
        this.cId = cId;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public Customer(String Name, String Phone, String Email) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }
    public Customer(int cId){
        this.cId = cId;
    }
    
    

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
