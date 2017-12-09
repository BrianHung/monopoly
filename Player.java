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

}
