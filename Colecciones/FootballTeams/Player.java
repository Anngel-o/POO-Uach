package FootballTeams;

public class Player {
    private Integer number;
    private String name;
    private String position;
    private Team team;
    
    public Player(Integer number, String name, String position, Team team) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.team = team;
    }

    public Integer getNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return "Player [number=" + number + ", name=" + name + ", position=" + position + ", team=" + team + "]";
    }

    public void putPlayer(Integer number2, Player p1) {
    }
}
