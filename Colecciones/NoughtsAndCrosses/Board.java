package NoughtsAndCrosses;

public class Board {
    Board() {

    }

    String board[][] = new String[3][3];
    public int countMoves = 0;
    public int length;
    
    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
            System.out.println();
        }
    }
    public String[][] getBoard() {
        return board;
    }

    public int numberOfMoves() {
        return countMoves;
    }

    public void initialize() {
        String board[][] = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
        }
    }

    public void marPosition(int x, int y, Player player) {
        if (player.isTurn()) {
            board[x][y] = player.getSymbol();
        }
    }
}
