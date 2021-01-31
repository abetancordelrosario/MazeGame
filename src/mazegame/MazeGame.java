package mazegame;

//Abstract Factory

public class MazeGame {
    
    private static Maze createMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.makeMaze();
        
        Compartment outSideWorld = mazeFactory.makeCompartment();
        maze.addCompartment(outSideWorld);
        
        Room room23 = mazeFactory.makeRoom(23);
        room23.setBorder(DIRECTION.North, new Wall(room23, outSideWorld));
        room23.setBorder(DIRECTION.West, new Wall(room23, outSideWorld));
        room23.setBorder(DIRECTION.South, new Wall(room23, outSideWorld));
        
        Room room25 = mazeFactory.makeRoom(25);
        room25.setBorder(DIRECTION.North, new Wall(room25, outSideWorld));
        room25.setBorder(DIRECTION.South, new Wall(room25, outSideWorld));
        room25.setBorder(DIRECTION.East, new Wall(room25, outSideWorld));
        
        Door door = mazeFactory.makeDoor(room23, room25, DOOR_STATUS.Open);
        
        room23.setBorder(DIRECTION.East, door);
        room25.setBorder(DIRECTION.West, door);
        
        maze.addCompartment(door);
        maze.addCompartment(room23);
        maze.addCompartment(room25);
        
        return maze;
    }

    public static void main(String[] args) {
        MazeFactory mazeFactory = new MazeFactory();
        Maze maze = createMaze(mazeFactory);
        
        HauntedMazeFactory hauntedMazeFactory = new HauntedMazeFactory();
        Maze maze1 = createMaze(hauntedMazeFactory);
    }
    
}
