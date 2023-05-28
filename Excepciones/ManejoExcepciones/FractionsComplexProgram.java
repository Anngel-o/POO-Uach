package Excepciones.ManejoExcepciones;
import java.util.Scanner;

public class FractionsComplexProgram{
    private static Scanner input = new Scanner(System.in);

    public static int Menu() {
        int opt;
        System.out.println("***** Números Complejos *****");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Digita una opción: ");
        opt = input.nextInt();
        input.nextLine();
        return opt;
    }

    public static void main(String[] args) throws Exception{
        Complex calc, n1, n2, res;
        calc = new Complex();
        double real, imaginary;
        int opt;
        do {
            opt = Menu();
            switch (opt) {
                case 1:   
                    try {
                        System.out.print("Introduce un número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce un número imaginario: ");
                        imaginary = input.nextDouble();
                        n1 = new Complex(real, imaginary);
                        System.out.print("Introduce otro número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce otro número imaginario: ");
                        imaginary = input.nextDouble();
                        n2 = new Complex(real, imaginary);
                        res = n1.sum(n2);
                        if (res.getImaginary() < 0.0)
                            System.out.println("La suma es: " + res.getReal() + " + i" + -res.getImaginary());
                        else
                            System.out.println("La suma es: " + res.getReal() + " + i" + res.getImaginary());
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }   catch (MyRuntimeException  e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Introduce un número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce un número imaginario: ");
                        imaginary = input.nextDouble();
                        n1 = new Complex(real, imaginary);
                        System.out.print("Introduce otro número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce otro número imaginario: ");
                        imaginary = input.nextDouble();
                        n2 = new Complex(real, imaginary);
                        res = n1.substract(n2);
                        if (res.getImaginary() < 0.0)
                            System.out.println("La resta es: " + res.getReal() + " + i" + -res.getImaginary());
                        else
                            System.out.println("La resta es: " + res.getReal() + " + i" + res.getImaginary());
                    } catch (MyError e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Introduce un número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce un número imaginario: ");
                        imaginary = input.nextDouble();
                        n1 = new Complex(real, imaginary);
                        System.out.print("Introduce otro número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce otro número imaginario: ");
                        imaginary = input.nextDouble();
                        n2 = new Complex(real, imaginary);
                        res = n1.multiply(n2);
                        if (res.getImaginary() < 0.0)
                            System.out.println("La multiplicación es: " + res.getReal() + " + i" + -res.getImaginary());
                        else
                            System.out.println("La multiplicación es: " + res.getReal() + " + i" + res.getImaginary());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Introduce un número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce un número imaginario: ");
                        imaginary = input.nextDouble();
                        n1 = new Complex(real, imaginary);
                        System.out.print("Introduce otro número real: ");
                        real = input.nextDouble();
                        System.out.print("Introduce otro número imaginario: ");
                        imaginary = input.nextDouble();
                        n2 = new Complex(real, imaginary);
                        res = n1.divide(n2);
                        if (res.getImaginary() < 0.0)
                            System.out.println("La divición es: " + res.getReal() + " + i" + -res.getImaginary());
                        else
                            System.out.println("La divición es: " + res.getReal() + " + i" + res.getImaginary());
                    } catch (MyException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("***** Hasta Luego *****");
                    break;

                default:
                    break;
            }
        } while (opt != 5);
    }


    class MyException extends Exception {
   
        public MyException(String message) {
            super(message);
        }
    }

    class MyError extends Error {
        public MyError(String message) {
            super(message);
        }
    }

    class MyRuntimeException extends RuntimeException {
        public MyRuntimeException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}