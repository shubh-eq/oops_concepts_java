
//Implementation contains 1 interface called VehicleFactory which provides blueprint for creating different Vehicles.
//Contains one Car class and one Bike class which implements VehicleFactor.

//TeslaS1 class inherits Car class and adds more company specific features.
//Encapsulation is achieved in Car class by making its data members as private and implementing getters and setters for them.
//Compile Time Polymorphism (Method Overloading) is achieved in Car class using applyBrakes function
//Run Time Polymorphism (Method Overriding) is achieved between Car class and TeslaS1 class with overriding applyBrakes function.

interface VehicleFactory{
    void setEngineType(String engineType);
}

class Car implements VehicleFactory{
    private String engineType;
    private int currentGear;

    protected void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    int getCurrentGear(){
        return currentGear;
    }

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    void applyBrakes(){
        System.out.println("Applying Normal Brakes!\n");
    }

    void applyBrakes(int type){
        if(type == 0){
            System.out.println("Applying HandBrake\n");
        }
        else{
            System.out.println("Applying Normal Brakes!\n");
        }
    }

    public void openSunroof(){
        System.out.println("Opening Sun-Roof\n");
    }

    public Car(){
        this.currentGear = 0;
    }

}

class TeslaS1 extends Car{
    String color;
    private int serialNumber;

    @Override
    public void applyBrakes(){
        System.out.println("Applying Brakes in TeslaS1\n");
    }

    public TeslaS1(String color,int serialNumber){
        this.color = color;
        this.serialNumber = serialNumber;
    }
}

class Bike implements VehicleFactory{
    String engineType;
    int currentGear;

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    void applyBrakes(){
        System.out.println("Applying Brakes!\n");
    }

    public void putOnStand(){
        System.out.println("On Stand now!\n");
    }

    public Bike(){
        this.currentGear = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        TeslaS1 car1 = new TeslaS1("Red",123);
        car1.applyBrakes();
        System.out.println(car1.getCurrentGear());
    }
}