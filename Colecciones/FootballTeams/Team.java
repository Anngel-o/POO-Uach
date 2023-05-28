package FootballTeams;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Team {
    public Team() {
    }

    public Team(String name, Map<Integer, Player> players, Map<Integer, Player> fieldPlayers) {
        this.name = name;
        this.players = players;
        this.fieldPlayers = fieldPlayers;
    }

    public Team(String name, Map<Integer, Player> players, Map<Coach, Player> teamMembers,
            Map<Integer, Player> fieldPlayers, Map<Integer, Player> injuredPlayers) {
        this.name = name;
        this.players = players;
        this.teamMembers = teamMembers;
        this.fieldPlayers = fieldPlayers;
        this.injuredPlayers = injuredPlayers;
    }

    private String name;
    private Map<Integer, Player> players = new TreeMap<Integer, Player>(); //todos los equipos
    private Map<Coach, Player> teamMembers = new TreeMap<Coach, Player>(); //Jugadores y entrenadores
    private Map<Integer, Player> fieldPlayers = new TreeMap<Integer, Player>();//Jugadores en el campo
    private Map<Integer, Player> injuredPlayers = new TreeMap<Integer, Player>();//Jugadores heridos

    public void putPlayer(Integer key, Player player) {//Agregar jugador
        this.players.put(key, player);
    }

    public void getPlayer() { //Obtener jugador
        Iterator it = players.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Llave: " + key + ", valor: " + players.get(key));
            System.out.println();
        }
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
