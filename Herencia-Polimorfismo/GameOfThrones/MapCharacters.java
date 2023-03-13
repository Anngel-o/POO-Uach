package GameOfThrones;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapCharacters {
    public static void main(String[] args) {
        Map<Character, Weapon> mapCharcaters = new TreeMap<Character, Weapon>(new NameComparator());

        Character joffrey = new King(new Sword(), "Joffrey Baratheon");
        Character viserion = new Dragon(new Fire(), "Viserion");
        Character cersei = new Queen(new Knife(), "Cersei Lannister");
        
        mapCharcaters.put(joffrey, joffrey.weapon);
        mapCharcaters.put(cersei, cersei.weapon);
        mapCharcaters.put(viserion, viserion.weapon);
        

        Iterator it = mapCharcaters.keySet().iterator();
        while (it.hasNext()) {
            Character key = (Character) it.next();
            System.out.println("Llave: " + key.toString() + ", valor: " + mapCharcaters.get(key).toString());
        }
    }
}
