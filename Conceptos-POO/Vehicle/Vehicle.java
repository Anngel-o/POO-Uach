package Vehicle;

public class Vehicle {
    public static void main(String[] args) {
        Subway subway = new Subway();
        Subway subway2 = new Subway("blanco", 45, 20);
        Train train = new Train();
        Train train2 = new Train("negro", 2003, 17);

        Truck truck = new Truck("amarillo", 2022, 18);
        Car car = new Car("negro", 2007, 2);
        Bike bike = new Bike("azul", 2001, 20);
        Submarine submarine =  new Submarine("amarillo", 1200, 2);
        Boat boat = new Boat("blanco", 2001, 400);
        Raft raft = new Raft("rojo", 2017, 80);

        System.out.println("Hay un metro de color " + subway2.color + ", con " + subway2.numSeat + " asientos, y " + subway2.numWindows + " ventanas");

        System.out.println("Hay un tren de color " + train.color + ", modelo " + train.model + ", con " + train.wagons + " vagones");
        System.out.println("Hay un tren de color " + train2.color + ", modelo " + train2.model + ", con " + train2.wagons + " vagones");

        System.out.println("Hay un camión de color " + truck.color + ", modelo " + truck.model + ", y número de llantas " + truck.numTires);
    
    }
}

class Subway {
    String color;
    int numSeat;
    int numWindows;

    void Start () {}
    void BoardPassenger () {}
    void DropPassenger () {}

    Subway(String color, int numSeat, int numWindows) {
        this.color = color;
        this.numSeat = numSeat;
        this.numWindows = numWindows;
    }
    Subway() {

    }

}

class Train {
    String color;
    int model;
    int wagons;

    void Start () {}
    void Stop () {}
    void DropWagon () {}

    Train(String color, int model, int wagons) {
        this.color = color;
        this.model = model;
        this.wagons = wagons;
    }
    Train() {
        this.color = "gris";
        this.model = 2018;
        this.wagons = 7;
    }
}

class Truck{
    String color;
    int model;
    int numTires;

    void Start () {}
    void LowerGlass () {}
    void ClimbGlass () {}

    Truck(String color, int model, int numTires) {
        this.color = color;
        this.model = model;
        this.numTires = numTires;   
    }
    Truck() {

    }
}

class Car{
    String color;
    int model;
    int doors;

    void Start () {}
    void ActivateWindshield () {}
    void ApplyGearstick() {}

    Car(String color, int model, int doors) {
        this.color = color;
        this.model = model;
        this.doors = doors;
    }
    Car() {

    }
}

class Bike{
    String color;
    int model;
    int tireSize;
    
    void Start () {}
    void Brake () {}
    void DeathTwist () {}

    Bike(String color, int model, int tireSize){
        this.color = color;
        this.model = model;
        this.tireSize = tireSize;
    }
    Bike() {

    }
}

class Submarine{
    String color;
    float maxDepth;
    int numHatches;

    void Immerse() {}
    void Start() {}
    void Shoot() {}

    Submarine(String color, float maxDepth, int numHatches) {
        this.color = color;
        this.maxDepth = maxDepth;
        this.numHatches = numHatches;    
    }
    Submarine() {

    }
}

class Boat{
    String color;
    int model;
    float loadCapacity;

    void Surf () {}
    void Stop () {}
    void ChangeDirection () {}

    Boat(String color, int model, float loadCapacity) {
        this.color = color;
        this.model = model;
        this.loadCapacity = loadCapacity;
    }
    Boat() {

    }
}

class Raft{
    String color;
    int model;
    float loadCapacity;

    void Surf() {}
    void Stop () {}
    void RunEmergeny () {} 

    Raft(String color, int model, float loadCapacity) {
        this.color = color;
        this.model = model;
        this.loadCapacity = loadCapacity;
    }
    Raft() {

    }
}
