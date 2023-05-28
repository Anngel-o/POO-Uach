package FootballTeams;

import java.util.Map;
import java.util.TreeMap;

// Realice un programa que permita almacenar un conjunto de jugadores en equipos de football,deberá utilizar una map con llave tipo integer(numero del jugador)y con valor de tipo Player para las clases de tipo Team

// Nota: agregue métodos o atributos conforme los vaya necesitando para crear una simulación de una temporada de football
public class Main extends Team{
    public static void main(String[] args) {
        Map<String, Team> teams = new TreeMap<String, Team>();
        Season season = new Season(teams);
        
        Map<Integer, Player> players = new TreeMap<Integer, Player>();
        Map<Integer, Player> players2 = new TreeMap<Integer, Player>();

        Team team1 = new Team("Rojos", players, null, null, null);
        Team team2 = new Team("Verdes", players2, null, null, null);
        team1.setPlayers(null);
        
        players = team1.getPlayers();
        players2 = team2.getPlayers();

        //Equipo Rojo
        Player p1 = new Player(1, "Roberto", "Delantero", team1);
        Player p2 = new Player(2, "Jairo", "Centro", team1);
        Player p3 = new Player(3, "Memo", "Portero", team1);
        players.get(1).putPlayer(p1.getNumber(), p1);
        team1.putPlayer(p2.getNumber(), p2);
        team1.putPlayer(p3.getNumber(), p3);
        players.put(p1.getNumber(), p1);
        players.put(p2.getNumber(), p2);
        players.put(p3.getNumber(), p3);
        //Equipo Verde
        Player p11 = new Player(11, "Roberto2", "Delantero", team2);
        Player p22 = new Player(22, "Jairo2", "Centro", team2);
        Player p33 = new Player(33, "Memo2", "Portero", team2);
        team2.putPlayer(p1.getNumber(), p11);
        team2.putPlayer(p2.getNumber(), p22);
        team2.putPlayer(p3.getNumber(), p33);
        // players2.put(p11.getNumber(), p11);
        // players2.put(p22.getNumber(), p22);
        // players2.put(p33.getNumber(), p33);

        team1.setPlayers(players);
        team1.setPlayers(players2);
        teams.put("Rojos", team1);
        teams.put("Verdes", team2);
        Match match = new Match(team1, team2);
        season.info();

        match.Start();
    }
}
