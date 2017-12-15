public Board {

    private static final BOARD_LENGTH = 40;

    private Tile[] tile;
    
    private int numPlayers;
    
    private Player currentPlayer;
    
    private PlayerQueue queue;
    
    private bool gameOver;

    public Board(int _numPlayers) {
        numPlayers = _numPlayers;
        queue = initPlayers();
        gameOver = false;
    }
    
    private PlayerQueue initPlayers() {
        // Prompts users for names.
        Player[] players = requestPlayers();
        return new PlayerQueue(players);
    }
    
    public void makeMove() {
        
        currentPlayer = queue.curr(); 
        
        int currTile = currentPlayer.location();
        int numMove  = currentPlayer.move();
        
        Tile.movePlayer(tile[currTile], tile[(currTile + numMove) % BOARD_LENGTH]);
        currentPlayer.update(); currentPlayer.prompt(); currentPlayer = queue.next();
    }
    
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }
    
    public void moveBackToParentsHouse(Player player) {
        queue.dequeue(player);
    }
}
