package Concurrencia.CarreraEstudiantes;

public class Student implements Runnable{
    private Integer id;
    private Integer pos = 0;
    private Integer winner = -1;
    private final Integer raceDistance = 200;

    public Student(Integer id) {
        this.id = id;
        this.pos = 0;
    }

    public Student() {
    }

    @Override
    public void run() {
        
        try {
            int numAleatory;
            int numSleep = generateNumAleatory(10, 100);
            while (pos < raceDistance) {
                numAleatory = generateNumAleatory(1, 6);
                System.out.println("El estudiante " + this.id
                        + " avanza " + numAleatory + " metros...");

                synchronized (StudentsRace.class) {
                    pos += numAleatory;
                    Thread.sleep(numSleep);
                }
                
                if (this.pos >= raceDistance) {
                    this.winner = 1;
                    System.out.println("*** El estudiante " + this.id + " corrió " + this.pos);
                    System.out.println("*** El estudiante " + this.id + " ha llegado a la meta!!!");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // TODO Auto-generated method stub
    }

    public Integer generateNumAleatory(int min, int max){
        int num = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getWinner() {
        return winner;
    }

    public void setWinner(Integer winner) {
        this.winner = winner;
    }

    public Integer getRaceDistance() {
        return raceDistance;
    }    
}
