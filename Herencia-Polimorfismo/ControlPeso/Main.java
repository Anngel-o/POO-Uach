package ControlPeso;

public class Main {
    public static void showIMC(Person person) {
        switch (person.getIMC()) {
            case Person.UNDER_WEIGHT:
                System.out.println(person.getName() + " se encuentra en un peso bajo.");
                break;
            case Person.IDEAL_WEIGHT:
                System.out.println(person.getName() + " se encuentra en un peso ideal.");
                break;
            case Person.OVER_WEIGHT:
                System.out.println(person.getName() + " se encuentra en sobrepeso.");
                break;
        }
    }

    public static void showAdult(Person person) {
        if (person.isLegalAge()) {
            System.out.println(person.getName() + " es mayor de edad.");
            System.out.println();
        }
        else {
            System.out.println(person.getName() + " es menor de edad.");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Person anngel; 
        Person jorge; 
        Person margarita; 

        //INSTANCIAR OBJETOS
        anngel = new Person("Anngel", 21, 'H', null, 77.5, 1.78);

        jorge = new Person("Jorge", 20, 'H');
        jorge.setWeight(99.7);
        jorge.setHeight(1.69);
        
        margarita = new Person();
        margarita.setName("Margarita");
        margarita.setAge(17);
        margarita.setGender('M');
        margarita.setWeight(47.8);
        margarita.setHeight(1.62);

        //IMRIMIR DATOS
        System.out.println(anngel.toString());
        showIMC(anngel);
        showAdult(anngel);
        System.out.println(jorge.toString());
        showIMC(jorge);
        showAdult(jorge);
        System.out.println(margarita.toString());
        showIMC(margarita);
        showAdult(margarita);
    }
}
