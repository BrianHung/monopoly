public Board {

    private static final BOARD_LENGTH = 40;

    private Tile[] tile;
    
    private int numPlayers;
    
    private bool gameOver;

    public Board(int _numPlayers) {
        numPlayers = _numPlayers
        gameOver = false;
    }
    
    public int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }
}
