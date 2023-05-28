package FootballTeams;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Season { //Temporada
    Map<String, Team> teams = new TreeMap<String, Team>(); //Todos los equipos

    public Season(Map<String, Team> teams) {
        this.teams = teams;
    }

    void info() {
        Iterator it = teams.keySet().iterator();
        while (it.hasNext()) {
            var key = it.next();
            System.out.println("Llave: " + key + ", valor: " + teams.get(key));
            System.out.println();
        }
    }
}
