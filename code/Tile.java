public Tile {
    
    enum Type {
        PROPERTY, SPECIAL, OTHER;
    }
    
    private Type type;
    
    Queue<Player> player;
    
    public Tile() {
    }
    
}
