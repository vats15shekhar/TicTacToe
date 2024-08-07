package projects.TicTacToe.model;

import java.util.Scanner;

public class Player {
    private String playerName;
    private char symbol;
    private PlayerType playerType;

    public Player(String playerName, char symbol, PlayerType playerType) {
        this.playerName = playerName;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move decideMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the row");
        int row = sc.nextInt();
        System.out.println("Please enter the column");
        int column = sc.nextInt();

        return new Move(this, new Cell(row, column));
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getPlayerName() {
        return playerName;
    }
    public char getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }





}
