public Property extends Tile {
    
    private String name;
    
    private String owner;
    
    private int value;
    
    private int numHouses;
    private int houseRent;
    
    private int numHotels;
    private int hotelRent;
    
    private bool owned;

    public Property(String _name, int _value) {
        name = _name;
        value = _value;
    }
    
    public String owner() {
        return owner;
    }
    
    public bool owned() {
        return owned;
    }
    
    public int rent() {
        return baseRent + (numHouses * houseRent) 
            + (numHotels * hotelRent);
    }
    
    public int buyHouse() {
        numHouses += 1;
    }
    
    public int buyHotel() {
        numHotels += 1;
    }
    

}
