/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Utils.SQLUtil;
import java.sql.ResultSet;
import bo.Pet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author caniz
 */
public class PetHandler {
    SQLUtil sqlUtil;

    public PetHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public int getPetId(String Name){
        try {
            List<Pet> p = new ArrayList<>();
            String cmd = String.format("select * from Pet where pName = '%s'",Name);
            ResultSet rs = sqlUtil.executeQuery(cmd);
            while(rs.next()){
                int pId = rs.getInt("pId");
                Pet pet = new Pet(pId);
                p.add(pet);
            }
            return p.get(0).getPetId();
        } catch (SQLException ex) {
            Logger.getLogger(PetHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public List<Pet> getPets(){
        List<Pet> pets = new ArrayList<>();
        String cmd = "select * from Pet";
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int pId = rs.getInt("PId");
                String pName = rs.getString("pName");
                String Animal = rs.getString("pAnimal");
                String breed = rs.getString("breed");
                int cId = rs.getInt("cId");
                Pet p = new Pet(pId, pName, Animal, breed, cId);
                pets.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PetHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    return pets;
    }
 
    public int addPet(String pName, String Animal, String breed, int cId){
        String cmdTemplate = "Insert into Pet(pName, pAnimal, breed, custId) values('%s','%s','%s', %d);";
        String cmd = String.format(cmdTemplate, pName, Animal, breed, cId);
    return sqlUtil.executeUpdate(cmd);
}

    public int deletePet(int pId){
        String cmd = String.format("Delete from Pet where pId = %d", pId);
        return sqlUtil.executeUpdate(cmd);
    }
}
