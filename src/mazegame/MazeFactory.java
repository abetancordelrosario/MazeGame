package mazegame;

public class MazeFactory { /*Abstract Factory*/

    public MazeFactory() {
    }
    
    public Maze makeMaze() {
        return new Maze();
    }
    
    public Compartment makeCompartment() {
        return new Compartment();
    }
    
    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }
    
    public Wall makeWall(Compartment compartment1, Compartment compartment2) {
        return new Wall(compartment1, compartment2);
    }
    
    public Door makeDoor(Compartment compartment1, Compartment compartment2, DOOR_STATUS status) {
        return new Door(compartment1, compartment2, status);
    }
}
