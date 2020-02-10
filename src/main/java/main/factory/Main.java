
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
        
        System.out.println("Pocetak");
        
        String message = "Ovo je poruka";
        
        Car fiat = new Car();
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color = "black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model: " + fiat.model);
        System.out.println("Godina proizvodnje: " + fiat.buildYear);
        System.out.println("Boja: " + fiat.color);
        System.out.println("Potrošnja: " + fiat.consumption);
        System.out.println("Maksimalna brzina: " + fiat.maxSpeed);
        System.out.println("Trenutno gorivo: " + fiat.currentFuel);
        System.out.println("Kapacitet rezervoara: " + fiat.maxFuel);
        
        System.out.println();
       
        
        
        
        Car ford = new Car();
        ford.model = "Ford Fiesta";
        ford.buildYear = 2015;
        ford.color = "green";
        ford.consumption = 7;
        ford.maxSpeed = 190;
        ford.currentFuel = 25;
        ford.maxFuel = 50;
        
        System.out.println("Model: " + ford.model);
        System.out.println("Godina proizvodnje: " + ford.buildYear);
        System.out.println("Boja: " + ford.color);
        System.out.println("Potrošnja: " + ford.consumption);
        System.out.println("Maksimalna brzina: " + ford.maxSpeed);
        System.out.println("Trenutno gorivo: " + ford.currentFuel);
        System.out.println("Kapacitet rezervoara: " + ford.maxFuel);
        
        System.out.println();
        
        Car chevrolet = new Car();
        chevrolet.model = "Chevrolet Impala";
        chevrolet.buildYear = 1967;
        chevrolet.color = "black";
        chevrolet.consumption = 9;
        chevrolet.maxSpeed = 210;
        chevrolet.currentFuel = 45;
        chevrolet.maxFuel = 55;
        
        System.out.println("Model: " + chevrolet.model);
        System.out.println("Godina proizvodnje: " + chevrolet.buildYear);
        System.out.println("Boja: " + chevrolet.color);
        System.out.println("Potrošnja: " + chevrolet.consumption);
        System.out.println("Maksimalna brzina: " + chevrolet.maxSpeed);
        System.out.println("Trenutno gorivo: " + chevrolet.currentFuel);
        System.out.println("Kapacitet rezervoara: " + chevrolet.maxFuel);
       
       
        
        
        

        
        
        
        
    }
    
}
