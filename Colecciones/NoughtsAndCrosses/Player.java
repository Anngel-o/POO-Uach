package NoughtsAndCrosses;

public class Player {
    Player() {

    }

    Player(String name) {
        this.name = name;
    }

    String name;
    String symbol;
    boolean turn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
}
