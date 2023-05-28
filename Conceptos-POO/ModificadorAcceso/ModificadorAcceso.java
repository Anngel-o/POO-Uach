import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

//Programar las siguientes clases con sus métodos y atributos con sus respectivos modificadores de acceso, deberan de elegir que modificadores aplicar a cada metodo y atributo segun su lógica 
public class ModificadorAcceso {
    public static void main(String[] args) {
        TeacherFullTime teacher1 = new TeacherFullTime("Anngel", "Ortiz", "Meraz", 20, "Desarrollador", "Aplicaciones móviles", "diciembre 2001", 6000);

        System.out.println(teacher1.name + " " + teacher1.lastNameFath + " " + teacher1.lastNameMoth + ", " + teacher1.title + ".");
    }
}
class Subject {
    public String name;
    public int grade;

    public Subject(String name, int grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    public Subject() {
        super();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int setGrade() {
        return grade;
    }
    public void getGrade(int grade) {
        this.grade = grade;
    }
}

class TeacherFullTime {
    //atributos
    public String name;
    public String lastNameFath;
    public String lastNameMoth;
    protected int age;
    public String title;
    public String specialty;
    protected String birthDate;
    private float salary;
    //materias que imparte (cada materia es una clase pojo)
    public List<Subject> subjects = new ArrayList<Subject>();
    Subject s1 = new Subject("POO", 4);
    Subject s2 = new Subject("POO avanzada", 5);
    //Subject subjects[] = new Subject[2];

    //métodos
    protected void PrepareClassMaterial() {}
    public void Impart() {}
    protected void PrepareTest() {}
    protected void ReviewTest() {}
    protected void RateTest() {}
    public void ImpartConsultancie() {}
    public void ImpartTutorial() {}

    public TeacherFullTime(String name, String lastNameFath, String lastNameMoth, int age, String title, String speciality, String birthDate, float salary) {
        this.name = name;
        this.lastNameFath = lastNameFath;
        this.lastNameMoth = lastNameMoth;
        this.age = age;
        this.title = title;
        this.specialty = speciality;
        this.birthDate = birthDate;
        this.salary = salary;
    }
    
    public TeacherFullTime() {
        
    }
}
