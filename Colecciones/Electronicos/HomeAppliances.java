package Electronicos;

public class HomeAppliances { //Electrodomésticos
    HomeAppliances() {
        this(DEF_PRICE, DEF_WEIGHT, DEF_COLOR, DEF_ENERGY);
    }
    
    HomeAppliances(double basePrice, double weight) {
        this(basePrice, weight, DEF_COLOR, DEF_ENERGY);
    }
    
    HomeAppliances(double basePrice, double weight, String color, char energyConsumption) {
        this.basePrice = basePrice;
        this.weight = weight;
        checkColor(color);
        checkEnergyConsumption(energyConsumption);
    }

    protected  double basePrice;
    protected double weight;
    protected String color; // Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si
    // el nombre está en mayúsculas o en minúsculas.
    protected char energyConsumption; // (letras entre A y F)

    protected final static String DEF_COLOR = "blanco";
    protected final static char DEF_ENERGY = 'F';
    protected final static double DEF_PRICE = 100;
    protected final static double DEF_WEIGHT = 5;
    
    public double getBasePrice() {
        return basePrice;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void checkEnergyConsumption (char energyConsumption) {
        //ASCII A - F / ASCII a - f
        if ((energyConsumption >= 65 && energyConsumption <= 70)) {
            this.energyConsumption = energyConsumption;
        }
        else {
            this.energyConsumption = DEF_ENERGY;
        }
    }

    public void checkColor(String color) {
        //blanco, negro, rojo, azul y gris
        String[] colors = {"blanco", "negro", "rojo", "azul", "gris", "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        boolean is = false;

        //Recorrer el vector de colores y comparar los valores
        for (int i = 0; i < colors.length && !is; i++) {
            if (colors[i].equals(color)) {
                is = true;
            }
        }
        if (is) {
            this.color = color;
        }
        else {
            this.color = DEF_COLOR;
        }
    }

    public double finalPrice() {
        double extra = 0;
        switch (energyConsumption) {
            case 'A':
                extra += 100;
                break;
            case 'B':
                extra += 80;
                break;
            case 'C':
                extra += 60;
                break;
            case 'D':
                extra += 50;
                break;
            case 'E':
                extra += 30;
                break;
            case 'F':
                extra += 10;
                break;
        }
        
        if (weight >= 0 && weight <= 19) {
            extra += 10;
        }
        else if (weight >= 20 && weight <= 49) {
            extra += 50;
        }
        else if (weight >= 50 && weight <= 79) {
            extra += 80;
        }
        else if (weight >= 80) {
            extra += 100;
        }

        return basePrice + extra;
    }
}
