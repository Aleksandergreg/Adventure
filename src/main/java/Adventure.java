public class Adventure {
    private Room current;
    private Room room1;

    public Adventure(){
room1 = new Room("Rum 1", "Stor guldskat");
current = room1;
    }
public Room getCurrent(){
    return current;
}
}
