/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class Animal {
    private int aID;
    private String aType;

    public Animal(int aID, String aBreed) {
        this.aID = aID;
        this.aType = aBreed;
    }

    
    
    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    public String getaBreed() {
        return aType;
    }

    public void setaBreed(String aBreed) {
        this.aType = aBreed;
    }

    @Override
    public String toString() {
        return getaBreed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
