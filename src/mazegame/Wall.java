package mazegame;

public class Wall extends Compartment {
    private final Compartment compartment1, compartment2;

    public Wall(Compartment compartment1, Compartment compartment2) {
        this.compartment1 = compartment1;
        this.compartment2 = compartment2;
    }
    
    
}
