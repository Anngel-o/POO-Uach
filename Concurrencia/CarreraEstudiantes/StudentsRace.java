package Concurrencia.CarreraEstudiantes;

public class StudentsRace {
    //CARRERA DE ESTUDIANTES
    public static void main(String[] args) throws InterruptedException {
        Thread[] students = new Thread[3];
        
        int id = 1;
        for (int i = 0; i < students.length; i++) {
            students[i] = new Thread(new Student(id));
            id++;
        }

        for (int i = 0; i < students.length; i++) {
            students[i].start();
        }

        for (int i = 0; i < students.length; i++) {
            students[i].join();
        }

        for (int i = 0; i < students.length; i++) {
            students[i].interrupt();
        }
    }
}
