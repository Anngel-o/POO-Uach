package Electronicos;

public class WashingMachine extends HomeAppliances{ //Lavadora
    private double capacity;
    private final static double DEF_CAPACITY = 5;

    WashingMachine() {
        this(DEF_PRICE, DEF_WEIGHT, DEF_COLOR, DEF_ENERGY, DEF_CAPACITY);
    }

    WashingMachine(double basePrice, double weight) {
        this(basePrice, weight, DEF_COLOR, DEF_ENERGY, DEF_CAPACITY);
    }

    WashingMachine(double basePrice, double weight, String color, char energyConsumption, double capacity){
        super(basePrice, weight, color, energyConsumption);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double finalPrice() {
        //Además de las condiciones de pago de Electrodómesticos se agrega la de capacidad de Lavadora
        double extra = super.finalPrice();

        if (capacity > 30) {
            extra += 50;
        }
        return extra;
    }
}
