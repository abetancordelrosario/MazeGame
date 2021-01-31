package mazegame;

import java.util.ArrayList;

public class Maze {
    private final ArrayList<Compartment> compartemnts = new ArrayList<>();

    public Maze() {
    }
    
    public void addCompartment(Compartment compartment){
        compartemnts.add(compartment);
    }
}
