/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class Truck extends Vehicle{
    
    protected int wheels;
    protected int capacity;
    
    public Truck(String brand, String model, String fuel,int wheels,int capacity) {
        super(brand, model, fuel);
        this.wheels=wheels;
        this.capacity=capacity;
    }
    
}

