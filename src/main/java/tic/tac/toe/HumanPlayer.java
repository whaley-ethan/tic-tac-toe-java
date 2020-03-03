package tic.tac.toe;


import java.io.InputStream;
import java.util.Scanner;

public class HumanPlayer implements Player{
    private char symbol;
    HumanPlayer(char symbol) {
        System.setIn(System.in);
        this.symbol = symbol;
    }

    HumanPlayer(char symbol, InputStream in) {
        System.setIn(in);
        this.symbol = symbol;

    }

    public char getSymbol() {
        return symbol;
    }

    public void makeAMove(Board board) {
        Scanner sc = new Scanner(System.in);
        int square = 0;
        try {
            square = sc.nextInt();
        }
        catch (Exception e) {
            // If input isn't an int we want it to do nothing
        }
        if (board.isCellEmpty(square)) {
            board.addMark(square, symbol);
        }
    }
}
