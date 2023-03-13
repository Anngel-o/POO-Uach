package GameOfThrones;

public class GameOfThrones {
    public static void main(String[] args) {
        Character joffrey = new King(new Sword(), "Joffrey Baratheon");
        joffrey.figth();

        Character cersei = new Queen(new Knife(), "Cersei Lannister");
        cersei.figth();

        joffrey.changeWeapon(new BowAndArrow());
        joffrey.figth();

        Character viserion = new Dragon(new Fire(), "Viserion");
        viserion.figth();

        cersei.changeWeapon(new Axe());
        cersei.figth();
    }
}
