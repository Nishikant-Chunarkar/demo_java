/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class SportBike extends Bike{
    
     protected String speed;
    public SportBike(String brand, String model, String fuel,float weight,String speed) {
        
        super(brand, model, fuel,weight);
        this.speed=speed;
    
    }
    
}

