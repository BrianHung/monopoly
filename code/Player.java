public class Player {

    enum Piece {
        SEGWAY, TESLA, CABLECAR, GOOGLEBUS, BART, AC72, AVIATO , AVOCADOTOAST;
    }

    private String name;
    
    private Piece piece;
    
    // Balance; cannot be negative.
    private int balance;
    
    // Location of Player.
    private int currTile;
    
    private List<Property> owned;
    
    private List<Property> mortaged;
    
    public Player(String _name, Piece _piece) {
        name = _name;
        piece = _piece;
        balance = 1500;
    }
    
    public payMortage() {
        for (Property property : mortaged) {
            if (balance < 0) {
                throw new BankruptException("Oh no! You've defaulted on your mortage.");
            }
            balance = balance - property.rate();
        }
    }
    
    public move() {
        return rollDice() + rollDice();
    }
    
    public int location() {
        return currTile;
    }

}
