/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class Bike extends Vehicle{
    
    protected float weight;
    
    public Bike(String brand,String model,String fuel,float weight){
    
        super(brand,model,fuel);
        this.weight=weight;
    }
    
}

