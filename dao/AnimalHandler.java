/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Utils.SQLUtil;
import bo.Animal;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author caniz
 */
public class AnimalHandler {
    SQLUtil sqlUtil;

    public AnimalHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public List<Animal> loadAnimals(){
        List<Animal> animals = new ArrayList<>();
        String cmd = "select * from Animal";
        ResultSet rs = sqlUtil.executeQuery(cmd);
        try {
            while(rs.next()){
                int aID = rs.getInt("aID");
                String aBreed = rs.getString("aBreed");
                Animal s = new Animal(aID, aBreed);
                animals.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();;
        }
        return animals;
    }
    
    
}
