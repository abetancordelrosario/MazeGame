package mazegame;

import java.util.HashMap;
import java.util.Map;

public class Compartment {
    public final Map<DIRECTION, Compartment>  border = new HashMap<>();

    public Compartment() {
    }
    
    public void setBorder(DIRECTION direction, Compartment compartment) {
        this.border.put(direction, compartment);
    }
    
    public Compartment getBorder(DIRECTION direction) {
        return this.border.get(direction);
    }
}
