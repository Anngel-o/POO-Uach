package Electronicos;

public class Television extends HomeAppliances{
    Television() {
        this(DEF_PRICE, DEF_WEIGHT, DEF_COLOR, DEF_ENERGY, DEF_RESOLUTION, DEF_TUNERTDT);
    }
    
    Television(double basePrice, double weight) {
        this(basePrice, weight, DEF_COLOR, DEF_ENERGY, DEF_RESOLUTION, DEF_TUNERTDT);
    }
    
    Television(double basePrice, double weight, String color, char energyConsumption, int resolution, boolean tunerTDT) {
        super(basePrice, weight, color, energyConsumption);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    private int resolution;
    private boolean tunerTDT;

    private final static int DEF_RESOLUTION = 20;
    private final static boolean DEF_TUNERTDT = false;

    public int getResolution() {
        return resolution;
    }

    public boolean getTunerTDT() {
        return tunerTDT;
    }

    public double finalPrice() {
        double extra = super.finalPrice();
        // Además de las condiciones de pago de Electrodómesticos se agrega la de capacidad de Television
        if (resolution > 40) {
            extra += (basePrice * .3);
        }
        if (tunerTDT = true) {
            extra += 50;
        }
        return extra;
    }
}
