public Player {

    enum Piece {
        SEGWAY, TESLA, CABLECAR;
    }

    private String name;
    
    private Piece piece;
    
    private int balance;
    
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

}
