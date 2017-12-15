public class Game {

    static enum State {
        SETUP, PLAYING;
    }
    
    private Board board;
    
    public Game(Board _board) {
        board = _board;
    }
    
    public void process() {
    
        while (true) {
        
            while (state == SETUP) {
                doSetup();
            }
            
            while (state == PLAYING) {
            
                // Exits game if gameOver.
                if (board.gameOver) {
                    break;
                }
                
                board.makeMove();
            }
            
            reportWinner();
            state = SETUP;
        }
    
    }

}
