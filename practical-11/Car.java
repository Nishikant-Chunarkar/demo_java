/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class Car extends Vehicle{
    
    protected int seats;
    
    public Car(String brand,String model,String fuel,int seats){
    
       super(brand,model,fuel);
       this.seats=seats;
    }
    
}

