package FootballTeams;

public class Player {
    private Integer number;
    private String name;
    private String position;
    private String team;
    
    public Player(Integer number, String name, String position, String team) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.team = team;
    }
    
    @Override
    public String toString() {
        return "Player [number=" + number + ", name=" + name + ", position=" + position + ", team=" + team + "]";
    }
}
