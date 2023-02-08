package TeacherList;

import java.util.ArrayList;
import java.util.List;

public class TeacherList {
    public static void main(String[] args) {
        
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;

    public int getAge() {return age;}

    public void setAge(int newAge) {
        if(age >= 0 && age <= 110) {
            age = newAge;
        }
    }

    public String getName() {return name;}
    public void setName(String newName) {name = newName;}

    public String getLastName() {return lastName;}
    public void setLastName(String newLastName) {lastName = newLastName;}

    public void showInfo() {
        System.out.println(name + " " + lastName + ", " + age + " años.");
    }

    Person(String name, String lastName, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    Person() {
        super();
    }
}

class Teacher extends Person{
    private int employeeNumber;

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int newEmployeeNumber) {
        employeeNumber = newEmployeeNumber;
    }

    public void showInfo() {
        System.out.println("Número de empleado: " + employeeNumber);
    }

    Teacher(int employeeNumber) {
        super();
        this.employeeNumber = employeeNumber;
    }
    Teacher() {
        super();
    }
}

class InterimTeacher extends Teacher{
    private String dateStart;
    private String dateEnd;

    public String getDateStart() {
        return dateStart;
    }
    public String getDateEnd() {
        return dateEnd;
    }
    public void setDateStart(String newDateStart) {
        dateStart = newDateStart;
    }
    public void setDateEnd(String newDateEnd) {
        dateEnd = newDateEnd;
    }

    public void showInfo() {
        System.out.println("Fecha de inicio: " + dateStart + " - fecha de fin: " + dateEnd);
    }

    InterimTeacher(String dateStart, String dateEnd) {
        super();
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
    
    InterimTeacher() {
        super();
    }
}

class TitularTeacher extends Teacher{
    private int cubicleNumber;

    public int getCubicleNumber() {return cubicleNumber;}
    public void setCubicleNumber(int newCubicleNumber) {cubicleNumber = newCubicleNumber;}

    public void showInfo() {
        System.out.println("Cubículo número: " + cubicleNumber);
    }
    TitularTeacher(int cubicleNumber) {
        super();
        this.cubicleNumber = cubicleNumber;
    }
    TitularTeacher() {
        super();
    }
}

class ListOfTeachers {
    public List<Teacher> teachers;

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        /*
         * este método debe recibir un parámetro de tipo Profesor el cual
         * será agregado a la lista de profesores utilizando el método add de la clase
         * ArrayList
         */

    }
    public void toListTeacher() {
        System.out.println(teachers);
        /*
         * este método deberá imprimir en la consola la lista de
         * profesores utilizando el método mostrar datos de cada tipo de profesor
         */

    }

    ListOfTeachers() {
        super();
        List<Teacher> teachers = new ArrayList<Teacher>();
        /*
         * Constructor sin parámetros: inicialice la lista de profesores creando una
         * instancia
         * de tipo ArrayList < Profesor >
         */
    }
}

class Sega {
    /*
     * Atributos:
     * • 2 profesores titulares
     * • 2 profesores interinos
     * • 1 lista de profesores
     * Implementar el método main en el cual se crearán 4 objetos de tipo profesor
     * utilizando sus constructores para capturar los datos correspondientes, además
     * de crear una lista de profesores y agregar los 4 profesores creados
     * anteriormente, y por ultimo deberá imprimir la lista de profesores mediante
     * el
     * método Listar Profesores de la lista de profesores
     */
}