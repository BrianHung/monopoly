/** Driver class for Monopoly.
 *  @author Brian Hung
 */
public class Main {

    /** Usage: java monopoly.Main ARGS, where ARGS contains
     *  <NUM_PLAYERS> .... */
    public static void main(String... args) {
    
        System.out.println("Monopoly! Version 0.0");
    
        Game game = new Game(new Board(args[0]));
        game.process();
    }

}
