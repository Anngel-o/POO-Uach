package FootballTeams;

public class Coach {
    private String name;

    public Coach(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coach [name=" + name + "]";
    }
}
