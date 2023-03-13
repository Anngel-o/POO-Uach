package CongresoMexicano;

import java.util.ArrayList;

public class Congress {
    public static void main(String[] args) {
        ArrayList<Legislator> legislators = new ArrayList<Legislator>();

        LegislatorsPayroll legislatorsPayroll = new LegislatorsPayroll();
        
        Legislator l1 = new Deputy(1);
        l1.setName("Ángel"); l1.setLastName("Ortiz"); l1.setAge(21); l1.setMarried(true);
        l1.setPoliticalParty("Rojo"); 
        l1.setProvinceThatRepresent("Jalisco"); 
        l1.setDispatchNumber("1");

        Legislator l2 = new Deputy(2);
        l2.setName("José"); l2.setLastName("Meraz"); l2.setAge(24); l2.setMarried(false);
        l2.setPoliticalParty("Verde");
        l2.setProvinceThatRepresent("Jalisco");
        l2.setDispatchNumber("2");
        Legislator l3 = new Deputy(3);
        l3.setName("Pedro"); l3.setLastName("Páramo"); l3.setAge(27); l3.setMarried(false);
        l3.setPoliticalParty("Verde");
        l3.setProvinceThatRepresent("Guanajuato");
        l3.setDispatchNumber("3");
        Legislator l4 = new Deputy(4);
        l4.setName("Mario"); l4.setLastName("Arias"); l4.setAge(25); l4.setMarried(true);
        l4.setPoliticalParty("Rojo");
        l4.setProvinceThatRepresent("Morelos");
        l4.setDispatchNumber("4");
        Legislator l5 = new Deputy(5);
        l5.setName("Gabriel"); l5.setLastName("García"); l5.setAge(31); l5.setMarried(true);
        l5.setPoliticalParty("Verde");
        l5.setProvinceThatRepresent("Morelos");
        l5.setDispatchNumber("5");

        Legislator l6 = new Senator(6);
        l6.setName("Sergio"); l6.setLastName("Flores"); l6.setAge(29); l6.setMarried(false);
        l6.setPoliticalParty("Rojo");
        l6.setProvinceThatRepresent("Durango");
        l6.setDispatchNumber("6");
        Legislator l7 = new Senator(7);
        l7.setName("Andrés"); l7.setLastName("Ríos"); l7.setAge(26); l7.setMarried(true);
        l7.setPoliticalParty("Verde");
        l7.setProvinceThatRepresent("Durango");
        l7.setDispatchNumber("7");
        Legislator l8 = new Senator(8);
        l8.setName("Jonas"); l8.setLastName("Hernandez"); l8.setAge(34); l8.setMarried(true);
        l8.setPoliticalParty("Rojo");
        l8.setProvinceThatRepresent("Sonora");
        l8.setDispatchNumber("8");
        Legislator l9 = new Senator(9);
        l9.setName("Antonio"); l9.setLastName("Sánchez"); l9.setAge(37); l9.setMarried(false);
        l9.setPoliticalParty("Verde");
        l9.setProvinceThatRepresent("Sonora");
        l9.setDispatchNumber("9");
        Legislator l10 = new Senator(10);
        l10.setName("Daniel"); l10.setLastName("Márquez"); l10.setAge(32); l10.setMarried(true);
        l10.setPoliticalParty("Rojo");
        l10.setProvinceThatRepresent("Guanajuato");
        l10.setDispatchNumber("10");

        legislators.add(l1); 
        legislators.add(l2);
        legislators.add(l3);
        legislators.add(l4);
        legislators.add(l5);
        legislators.add(l6);
        legislators.add(l7);
        legislators.add(l8);
        legislators.add(l9);
        legislators.add(l10);

        System.out.println("Legisladores en nómina: " + legislatorsPayroll.getNumberOfLegislators(legislators));
        System.out.println(legislators.toString());
        
    }
}
