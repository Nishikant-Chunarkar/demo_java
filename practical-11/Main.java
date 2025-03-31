/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_11;

/**
 *
 * @author nishi
 */
public class Main {
    
    public static void main(String[] args) {
        RegularCar c1 = new RegularCar("Tata","Tiago","Petrol",5,"19");
        System.out.println(c1.brand);
        ElecCar c2 = new ElecCar("Kia","EV6","Electric",5,"77");
        
        
        ElecBike b1 = new ElecBike("Pure EV","EcoDryft","Electric",101,171);
        SportBike b2 = new SportBike("Kawasaki","Ninja H2 SX","Petrol",260,330);
        
        Truck t1 = new Truck("John deer","Pro 1095","Diesel",7220,6);

    }
}

