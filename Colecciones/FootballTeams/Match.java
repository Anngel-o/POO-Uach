package FootballTeams;

public class Match { //Partido
    public Team team1 = new Team("Rojos", null, null, null, null);
    public Team team2 = new Team("Verdes", null, null, null, null);
    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    } 
    
    void Start() {
        System.out.println("El equipo " + team1.getName() + " mete un goooooool");
        System.out.println("El equipo " + team2.getName() + " mete un goooooool");
    }
}
