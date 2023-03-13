package Electronicos;

public class Main {
    public static void main(String[] args) {
        // Los colores disponibles son blanco, negro, rojo, azul y gris.
        HomeAppliances homeAppliances[] = new HomeAppliances[10];
        homeAppliances[0] = new HomeAppliances();
        homeAppliances[1] = new HomeAppliances(150, 60);
        homeAppliances[2] = new HomeAppliances(450, 55, "negro", 'A');
        homeAppliances[3] = new WashingMachine();
        homeAppliances[4] = new WashingMachine(300, 20);
        homeAppliances[5] = new WashingMachine(220, 15, "blanco", 'C', 30);
        homeAppliances[6] = new Television();
        homeAppliances[7] = new Television(350, 7);
        homeAppliances[8] = new Television(200, 9, "AZUL", 'E', 50, false);
        homeAppliances[8] = new Television(270, 5, "GRIS", 'F', 30, true);

        /*
         *  Deberás mostrar el precio de cada clase, es decir, el precio de todas las
         * televisiones por un lado, el de las lavadoras por otro y la suma de los
         * HomeAppliances
         */

        double countHomeApp = 0;
        double countWashingM = 0;
        double countTelevision = 0;

        for (int i = 0; i < homeAppliances.length; i++) {
            if (homeAppliances[i] instanceof HomeAppliances) {
                countHomeApp += homeAppliances[i].finalPrice();
            }
            if (homeAppliances[i] instanceof WashingMachine) {
                countWashingM += homeAppliances[i].finalPrice();
            }
            if (homeAppliances[i] instanceof Television) {
                countTelevision += homeAppliances[i].finalPrice();
            }
        }   

        System.out.println("La suma de Electrodomésticos es: " + countHomeApp);
        System.out.println("La suma de Lavadoras es: " + countWashingM);
        System.out.println("La suma de Televisores es: " + countTelevision);
    }
}
