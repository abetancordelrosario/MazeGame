package mazegame;

public class Door extends Compartment{
    private final Compartment compartment1, compartment2;
    private DOOR_STATUS status;

    public Door(Compartment compartment1, Compartment compartment2, DOOR_STATUS status) {
        this.compartment1 = compartment1;
        this.compartment2 = compartment2;
        this.status = status;
    }    
    
    public Compartment atOtherSide(Compartment compartment) {
        return compartment1 == compartment? compartment2: (compartment2 == compartment? compartment1 : null);
    }
    
    public DOOR_STATUS getStatus() {
        return this.status;
    }

    public void setStatus(DOOR_STATUS status) {
        this.status = status;
    }
    
}
