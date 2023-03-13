package ControlPeso;

public class Person {
    public Person() {
        this(" ", 0, GENDER_DEF, " ", 0.0, 0.0);
    }

    public Person(String name, int age, char gender) {
        this(name, age, GENDER_DEF, " ", 0.0, 0.0);
    }

    public Person(String name, int age, char gender, String id, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        
        this.id = generateId();
        compareGender(gender);
    }

    private final static char GENDER_DEF = 'H';
    public final static int OVER_WEIGHT = 1; //Sobrepeso
    public final static int IDEAL_WEIGHT = 0; //Peso ideal
    public final static int UNDER_WEIGHT = -1; //Peso bajo
    public final static int numDigits = 8;
    private String name;
    private int age;
    private String adult;
    private char gender; // H o M
    private String id;
    private double weight; // peso
    private double height; // altura

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String toString() {
        String sex;
        if (gender == 'M') {
            sex = "mujer";
        }
        else {
            sex = "hombre";
        }
        return "Id:" + id + ", Nombre: " + name + ", Edad: " + age + ", Género: " + sex + ", Altura: " + height + " m" + ", Peso: " + weight + " kg. ";
    }

    public int getIMC() {
        double imc;
        imc = weight / (Math.pow(height, 2));
        if (imc < 20) {
            //Peso bajo
            return UNDER_WEIGHT;
        }
        else if (imc >= 20 && imc <= 25) {
            //Peso ideal
            return IDEAL_WEIGHT;
        }
        else {
            //Sobrepeso
            return OVER_WEIGHT;
        }
    }

    public boolean isLegalAge() {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

    private void compareGender(char gender) {
        if (gender != 'H' && gender != 'M') {
            this.gender = GENDER_DEF;
        }
    }

    private String generateId() {
        String digits = " ";
        int arrayDigits[] = new int[numDigits];
        for (int i : arrayDigits) {
            digits += (int) (Math.random() * 9);
        }
        return digits;
    }
}
