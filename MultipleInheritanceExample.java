// Interface 1
interface Drivable {
    void startEngine();

    void stopEngine();
}

// Interface 2
interface Flyable {
    void takeOff();

    void land();
}

// Base class (Single Inheritance)
class Vehicle {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Vehicle: " + name);
    }
}

// Derived class (Implements multiple interfaces)
class FlyingCar extends Vehicle implements Drivable, Flyable {

    @Override
    public void startEngine() {
        System.out.println(name + " engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(name + " engine stopped.");
    }

    @Override
    public void takeOff() {
        System.out.println(name + " is taking off.");
    }

    @Override
    public void land() {
        System.out.println(name + " has landed.");
    }

    void switchToDrivingMode() {
        System.out.println(name + " is now in driving mode.");
    }

    void switchToFlyingMode() {
        System.out.println(name + " is now in flying mode.");
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of FlyingCar
        FlyingCar flyingCar = new FlyingCar();
        flyingCar.setName("SkyRider");
        
        flyingCar.displayInfo();          // Output: Vehicle: SkyRider
        flyingCar.startEngine();          // Output: SkyRider engine started.
        
        flyingCar.switchToFlyingMode();   // Output: SkyRider is now in flying mode.
        flyingCar.takeOff();              // Output: SkyRider is taking off.
        flyingCar.land();                 // Output: SkyRider has landed.
        
        flyingCar.switchToDrivingMode();  // Output: SkyRider is now in driving mode.
        flyingCar.stopEngine();           // Output: SkyRider engine stopped.
    }
}
