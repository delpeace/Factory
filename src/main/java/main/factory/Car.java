
package main.factory;

/**
 *
 * @author qa
 */
public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
    
    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.maxSpeed = 0;
        this.currentFuel = 0;
        this.consumption = 0;
    }
    
    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxFuel = customMaxSpeed;
        this.color = customColor;
        
    }
    
    public Car(int customMaxFuel, int customCurrentFuel, int customConsumption) {
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
                
    }
    
    
    public String getModel () {
        return this.model;
    }
    
    public void setModel(String customModel) {
        this.model = customModel;
    }
    
    
    public int getBuildYear () {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear) {
        this.buildYear = customBuildYear;
    }
    
    public String getColor () {
        return this.color;
    }
    
    public void setColor(String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel () {
        return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getMaxSpeed () {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
    public int getCurrentFuel () {
        return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption () {
        return this.consumption;
    }
    
    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
    
    public String getVehicleType () {
        return this.vehicleType;
    }
    
    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());        
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara: " + this.getMaxFuel());  
        System.out.println("");
    }  
    
    public void travel(int distanceTraveled) {
        // devinisati novi atribut 'milleage'
        //napraviti get i set metode
        //prosiriti jedan od konstruktora da moze da se settuje  i milleage
        
        
        //kolicina goriva da se smanji za onoliko koliko je potroseno
        // kilometraza treba da se uveca
        
    }
            
            
}
