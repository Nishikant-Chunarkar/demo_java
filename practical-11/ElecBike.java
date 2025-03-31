/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class ElecBike extends Bike{
    
    protected String battery;
    public ElecBike(String brand, String model, String fuel,float weight,String battery) {
        
        super(brand, model, fuel,weight);
        this.battery=battery;
    
    }
    
}

