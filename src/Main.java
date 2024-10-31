
class Vehicle {

    String type;

    // SuperClass constructor

    Vehicle(String type){
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }

}


class Car extends Vehicle {
// Overloaded constructor chaining to the above constructor

    String model;
    Car(String type, String model ){
        super(type); //Call to Vehicle constructor
        this.model = model;
        System.out.println("Car model: "+ model);
    }
    Car(String model){
        this("Sedan", model);
    }
}







public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("SUV", "Toyota");
        Car car2 = new Car("Honda");

    }
}