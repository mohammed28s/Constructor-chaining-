```markdown
# Java Constructor Chaining Example

This project demonstrates **constructor chaining** in Java using two classes: `Vehicle` and `Car`. Constructor chaining lets one constructor call another within the same class or a superclass, saving code and improving clarity.

## Overview

1. **Vehicle**: The base class with a `type` field. Its constructor sets this `type`.
2. **Car**: Extends `Vehicle` and adds a `model` field.
   - **Two constructors**:
     - One takes both `type` and `model`, calling the `Vehicle` constructor using `super(type)`.
     - Another takes only `model`, defaulting `type` to `"Sedan"` by calling `this("Sedan", model)`.

## Code Example

```java
class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    String model;

    Car(String type, String model) {
        super(type);
        this.model = model;
        System.out.println("Car model: " + model);
    }

    Car(String model) {
        this("Sedan", model); // Defaults type to "Sedan"
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("SUV", "Toyota");
        Car car2 = new Car("Honda");
    }
}
```

### Expected Output

When you run this code, you should see:

```plaintext
Vehicle type: SUV
Car model: Toyota
Vehicle type: Sedan
Car model: Honda
```

### Explanation

- `Car car1 = new Car("SUV", "Toyota");` creates a `Car` with `type` "SUV" and `model` "Toyota".
- `Car car2 = new Car("Honda");` uses the overloaded constructor, setting `type` to "Sedan" by default and `model` to "Honda".

## How to Run

1. **Compile**: `javac Main.java`
2. **Run**: `java Main`

This example illustrates how constructor chaining (`this()` and `super()`) simplifies class initialization.
