package CongresoMexicano;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private boolean married;
    private String mar;

    Person() {

    }
    
    Person(String name, String lastName, int age, boolean married) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
    }

    public String toString() {
        String info = (name + " " + lastName + ", " + age + " años " + ", " + mar);
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        if (married == true) {
            this.mar = "casado";
        } else {
            this.mar = "soltero";
        }
    }

    public String getMar() {
        return mar;
    }

}


