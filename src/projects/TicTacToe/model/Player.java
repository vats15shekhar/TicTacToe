package projects.TicTacToe.model;

public class Player {
    private String playerName;
    private char symbol;
    private PlayerType playerType;

    public Player(String playerName, char symbol, PlayerType playerType) {
        this.playerName = playerName;
        this.symbol = symbol;
        this.playerType = playerType;
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
