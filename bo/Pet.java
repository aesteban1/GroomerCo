/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author caniz
 */
public class Pet {
        
    private int petId;
    public String pName;
    public String pAnimal;
    private String breed;
    private int cId;


    public Pet(int petId, String pName, String pAnimal, String breed, int cId) {
        this.petId = petId;
        this.pName = pName;
        this.pAnimal = pAnimal;
        this.breed = breed;
        this.cId = cId;
    }

    public Pet(String pName, String pAnimal, String breed, int cId) {
        this.pName = pName;
        this.pAnimal = pAnimal;
        this.breed = breed;
        this.cId = cId;
    }

    public Pet(int petId) {
        this.petId = petId;
    }
    


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getAnimal() {
        return pAnimal;
    }

    public void setAnimal(String animal) {
        this.pAnimal = animal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

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

    @Override
    public String toString() {
        return getBreed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
