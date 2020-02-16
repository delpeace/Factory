
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

//        
//        Car fiat = new Car();
        
        Car fiat = new Car("Fiat Punto", 2010, 180, "black");
        fiat.showData();
        
        Car ford = new Car("Ford Fiesta", 2015, 190, "red");
        ford.showData();
        
        Car chevrolet = new Car("Chevrolet Impala", 1967, 210, "black", 50, 40, 10, 500, 2, 5);
        chevrolet.showData();
        
//        chevrolet.travel(20);
//        chevrolet.showData();
//        
//        chevrolet.fuelUp(50);
//        chevrolet.travel(400);
//        chevrolet.showData();

        chevrolet.setPassengers(0);
        chevrolet.showData();
//        
//        chevrolet.getIn();
//        chevrolet.getIn();
//        chevrolet.getOut();
//        chevrolet.getIn(3);
//        chevrolet.getIn(8);
//        chevrolet.getOut(10);
//        chevrolet.getOut(2);
//        chevrolet.getOut(1);
//        chevrolet.getOut(1);
        chevrolet.getIn(6);
        chevrolet.getOut();
        chevrolet.getIn(4);
        chevrolet.getOut(2);
        chevrolet.getOut(3);
        
        
        
        
////        fiat.model = "Fiat Punto";
//        fiat.setModel("Fiat Punto");
////        fiat.buildYear = 2010;
//        fiat.setBuildYear(2010);
////        fiat.color = "black";
//        fiat.setColor("black");
////        fiat.consumption = 6;
//        fiat.setConsumption(6);
////        fiat.maxSpeed = 180;
//        fiat.setMaxSpeed(180);
////        fiat.currentFuel = 20;
//        fiat.setCurrentFuel(20);
////        fiat.maxFuel = 45;
//        fiat.setMaxFuel(45);
//        
//        
//        fiat.showData();
//        
        
        
//        System.out.println("Potrošnja: " + fiat.consumption);
//        System.out.println("Maksimalna brzina: " + fiat.maxSpeed);
//        System.out.println("Trenutno gorivo: " + fiat.currentFuel);
//        System.out.println("Kapacitet rezervoara: " + fiat.maxFuel);
//        
//        
//        
//        System.out.println();
//       
//        
//        
//        
//        Car ford = new Car();
//        ford.setModel("Ford Fiesta");
////        ford.model = "Ford Fiesta";
//        ford.buildYear = 2015;
//        ford.color = "green";
//        ford.consumption = 7;
//        ford.maxSpeed = 190;
//        ford.currentFuel = 25;
//        ford.maxFuel = 50;
//        
//        ford.showData();
//        System.out.println("Potrošnja: " + ford.consumption);
//        System.out.println("Maksimalna brzina: " + ford.maxSpeed);
//        System.out.println("Trenutno gorivo: " + ford.currentFuel);
//        System.out.println("Kapacitet rezervoara: " + ford.maxFuel);
//        
//        System.out.println();
//        
//        Car chevrolet = new Car();
//        chevrolet.model = "Chevrolet Impala";
//        chevrolet.buildYear = 1967;
//        chevrolet.color = "black";
//        chevrolet.consumption = 9;
//        chevrolet.maxSpeed = 210;
//        chevrolet.currentFuel = 45;
//        chevrolet.maxFuel = 55;
//        
//        chevrolet.showData();
//        System.out.println("Potrošnja: " + chevrolet.consumption);
//        System.out.println("Maksimalna brzina: " + chevrolet.maxSpeed);
//        System.out.println("Trenutno gorivo: " + chevrolet.currentFuel);
//        System.out.println("Kapacitet rezervoara: " + chevrolet.maxFuel);
       
       
        
        
        

        
        
        
        
    }
    
}
