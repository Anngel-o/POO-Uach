package FootballTeams;

import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class Team {
    private String name;
    private Map<Integer, Player> players = new TreeMap<Integer, Player>();
    //Todos los jugadores  
    private Map<Coach, Player> teamMembers = new TreeMap<Coach, Player>();
    //Jugadores y entrenadores
    private Map<Integer, Player> fieldPlayers = new TreeMap<Integer, Player>();//Jugadores en el campo
    private Map<Integer, Player> injuredPlayers = new TreeMap<Integer, Player>();//Jugadores heridos

    public void putPlayer(Player player, Integer key) {//Agregar jugador
        players.put(key, player);
    }

    public void getPlayer() {
        //Obtener jugador
        //getPlayer(key: Integer): Player
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Player> getPlayers() {
        return players;
    }

    public void setPlayers(Map<Integer, Player> players) {
        this.players = players;
    }

    public Map<Coach, Player> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Map<Coach, Player> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public Map<Integer, Player> getFieldPlayers() {
        return fieldPlayers;
    }

    public void setFieldPlayers(Map<Integer, Player> fieldPlayers) {
        this.fieldPlayers = fieldPlayers;
    }

    public Map<Integer, Player> getInjuredPlayers() {
        return injuredPlayers;
    }

    public void setInjuredPlayers(Map<Integer, Player> injuredPlayers) {
        this.injuredPlayers = injuredPlayers;
    }

    @Override
    public String toString() {
        return "Team [name=" + name + ", players=" + players + ", teamMembers=" + teamMembers + ", fieldPlayers="
                + fieldPlayers + ", injuredPlayers=" + injuredPlayers + "]";
    }

}
