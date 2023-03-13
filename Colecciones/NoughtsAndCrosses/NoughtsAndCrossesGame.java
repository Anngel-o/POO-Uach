package NoughtsAndCrosses;

import java.util.Scanner;

public class NoughtsAndCrossesGame {
    NoughtsAndCrossesGame() {

    }

    Player player1 = new Player("Ang");
    Player player2 = new Player("Mar");
    Board board = new Board();

    Scanner scanner = new Scanner(System.in);

    public void play() {
        board.getBoard();
    }

    public void initPlayers() {
        player1.setSymbol("X");
        player2.setSymbol("O");
    }

    public void nextTurn() {
        if (player1.isTurn()) {
            System.out.println("Le toca al jugador 1");
        }
        if (player2.isTurn()) {
            System.out.println("Le toca al jugador 2");
        }
    }

    public void makeMove() {
        if (player1.isTurn()) {
            System.out.println("Le toca al jugador 1");
            board.countMoves++;
        }
        if (player2.isTurn()) {
            System.out.println("Le toca al jugador 2");
            board.countMoves++;
        }
    }  
    
    public void changeTurn() {
        if (player1.isTurn()) {
            player1.turn = !player1.turn;
        }
        if (player2.isTurn()) {
            player2.turn = !player2.turn;
        }   
    }  
    
    public void endGame() {

    }
    
    public void getSymbolTurn() {
        if (player1.isTurn()) {
            System.out.println(player1.getName() + " en turno con el símbolo " + player1.getSymbol());
        }
        if (player2.isTurn()) {
            System.out.println(player2.getName() + " en turno con el símbolo " + player2.getSymbol());
        }
    }

    public boolean doWeHaveAWinner() {
        if (checkForWinnerLi() != false || checkForWinnerCo() != false || checkForWinnerDiP() != false 
                || checkForWinnerDiI() != false) {
            return true;
        }
        return false;
    }

    public void printWinner() {
        if (doWeHaveAWinner()) {
            System.out.println("Ganador");
        }
    }
    
    public boolean checkForWinnerLi() {
        String symbol;
        boolean win = false;

        for (int i = 0; i < board.length; i++) {
            Player player = new Player();
            win = true;
            board.board[i][0] = player.getSymbol();
            if (player.getSymbol() != "-") {
                for (int j = 0; j < board.length; j++) {
                    if (player.getSymbol() != board.board[i][j]) {
                        win = false;
                    }
                }
                if (win) {
                    System.out.println(player.getSymbol());
                }
            }
        }
        return win;
    }

    public boolean checkForWinnerCo() {
        String symbol;
        boolean win = false;

        for (int j = 0; j < board.length; j++) {
            Player player = new Player();
            win = true;
            board.board[0][j] = player.getSymbol();
            if (player.getSymbol() != "-") {
                for (int i = 0; i < board.length; i++) {
                    if (player.getSymbol() != board.board[i][j]) {
                        win = false;
                    }
                }
                if (win) {
                    System.out.println(player.getSymbol());
                }
            }
        }
        return win;
    }

    public boolean checkForWinnerDiP() {
        Player player = new Player();
        String symbol;
        boolean win = true;

        board.board[0][0] = player.getSymbol();
        if (player.getSymbol() != "-") {
            for (int i = 1; i < board.length; i++) {
                if (player.getSymbol() != board.board[i][i]) {
                    win = false;
                }
            }
            if (win) {
                System.out.println(player.getSymbol());
            }
        }
        return win;
    }

    public boolean checkForWinnerDiI() {
        Player player = new Player();
        String symbol;
        boolean win = true;

        board.board[0][0] = player.getSymbol();
        if (player.getSymbol() != "-") {
            for (int i = 1, j = 1; i < board.length; i++, j--) {
                if (player.getSymbol() != board.board[i][j]) {
                    win = false;
                }
            }
            if (win) {
                System.out.println(player.getSymbol());
            }
        }
        return win;
    }
}