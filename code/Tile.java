public Tile {
    
    static enum Type {
        PROPERTY, SPECIAL, OTHER;
    }
    
    private Type type;
    
    private Queue<Player> players;
    
    public Tile(Type _type) {
        players = new Queue<>();
        type = _type;
    }
    
    // Moves a player from SRC and lands them at DST.
    public static movePlayer(Tile src, Tile dst) {
        dst.land(src.move());
    }
    
    // Moves a player off a tile.
    public Player move() {
        return players.pop();
    }
    
    // Lands a player onto a tile.
    public void land(Player player) {
        players.add(player);
    }
    
}
