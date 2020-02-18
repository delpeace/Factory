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
    private double mileage;
    private int passengers;
    private int seats;

    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.maxSpeed = 0;
        this.currentFuel = 0;
        this.consumption = 0;
        this.mileage = 0;
        this.passengers = 1;
        this.seats=5;
    }

    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxFuel = customMaxSpeed;
        this.color = customColor;

    }

    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption, double customMileage, int customPassengers, int customSeats) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxFuel = customMaxSpeed;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
        this.mileage = customMileage;
        this.passengers = customPassengers;
        this.seats = customSeats;

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String customModel) {
        this.model = customModel;
    }

    public int getBuildYear() {
        return this.buildYear;
    }

    public void setBuildYear(int customBuildYear) {
        this.buildYear = customBuildYear;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String customColor) {
        this.color = customColor;
    }

    public int getMaxFuel() {
        return this.maxFuel;
    }

    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }

    public int getCurrentFuel() {
        return this.currentFuel;
    }

    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }

    public int getConsumption() {
        return this.consumption;
    }

    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double customMileage) {
        this.mileage = customMileage;
    }
    
    public int getPassengers() {
        return this.passengers;
    }
    
    public void setPassengers(int customPassengers) {
        this.passengers = customPassengers;
    }

    public int getSeats() {
        return this.seats;
    }
    
    public void setSeats(int customSeats) {
        this.seats = customSeats;
    }
    
    
    public String getVehicleType() {
        return this.vehicleType;
    }

    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara: " + this.getMaxFuel());
        System.out.println("Predjena kilometraza: " + this.getMileage());
        System.out.println("");
    }

    public void travel(int distance) {
        if (this.getCurrentFuel() > (distance * this.getConsumption()) / 100) {
            this.mileage = this.getMileage() + distance;
            this.currentFuel = this.getCurrentFuel() - (distance * this.getConsumption()) / 100;
            System.out.println("Uspesno ste putovali: " + distance + " kilometara");
        } else {
            System.out.println("Nema dovoljno goriva za put od " + distance);
        }
    }

    public void fuelUp(int refill) {
        int emptySpace = this.getMaxFuel() - this.getCurrentFuel();
        
        if (refill < emptySpace) {
            this.currentFuel = this.getCurrentFuel() + refill;
            System.out.println("Uspesno ste sipali " + refill + " . + Novo stanje je: " + this.getCurrentFuel());
        } else {
            this.currentFuel = this.getMaxFuel();
            System.out.println("Rezervoar je pun. Sipali ste: " + emptySpace);
        }
       
    }
    
    public void getIn() {
    //1 osoba je usla u vozilo
       if (this.getPassengers() + 1 <= this.getSeats()) {
           this.setPassengers(this.getPassengers() + 1);
           System.out.println("Jedna osoba je usla u auto. Novo stanje je: " + this.getPassengers());
       } else {
           System.out.println("Automobil je pun. Nema mesta za jos jednog putnika");
       }
    }    

    public void getIn(int numberOfPeople) {
        //numberOfPeople osoba je uslo u vozilo
        if (this.getPassengers() + numberOfPeople <= this.getSeats()) {
           this.setPassengers(this.getPassengers() + numberOfPeople);
           System.out.println(numberOfPeople + " osoba je usla u auto. Novo stanje je: " + this.getPassengers());
       } else {
           System.out.println("U automobilu je trenutno " + this.getPassengers() + " putnika. Ne mogu uci jos " + numberOfPeople + " osoba.");
       }
    }

    public void getOut() {
        //1 osoba je izasla iz vozila
        if (this.getPassengers() - 1 >= 0) {
           this.setPassengers(this.getPassengers() - 1);
           System.out.println("Jedna osoba je izasla iz auta. Novo stanje je: " + this.getPassengers());
       } else {
           System.out.println("U automobilu je trenutno 0 putnika. Ne moze izaci 1 putnik.");
       }
    }  
    
    public void getOut(int numberOfPeople) {
        //numberOfPeople osoba je izaslo iz vozila
        if (this.getPassengers() - numberOfPeople >= 0) {
           this.setPassengers(this.getPassengers() - numberOfPeople);
           System.out.println(numberOfPeople + " osoba je izaslo iz auta. Novo stanje je: " + this.getPassengers());
       } else {
           System.out.println("U automobilu je trenutno " + this.getPassengers() + " putnika. Ne mogu izaci " + numberOfPeople + " putnika.");
       }
    }
}
    
    
    

    //trenutni broj putnika
    //maksimalni broj putnika



