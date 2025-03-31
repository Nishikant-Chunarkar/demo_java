/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class ElecCar extends Car{
    
    protected String batt_pow;
    
    public ElecCar(String brand,String model,String fuel,int seats,String batt_pow){
        super(brand,model,fuel,seats);
        this.batt_pow=batt_pow;
    
    }
    
}

