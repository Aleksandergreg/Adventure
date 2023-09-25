public class Adventure {
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Room room7;
    private Room room8;
    private Room room9;

    private Room currentRoom;


    public Adventure(){
        Room room1 = new Room("Room 1", "The brown bear is lurking");
        Room room2 = new Room("Room 2", "The grizzly bear is lurking");
        Room room3 = new Room("Room 3", "The polar bear is lurking");
        Room room4 = new Room("Room 4", "The polar bear is lurking");
        Room room5 = new Room("Room 5", "The polar bear is lurking");
        Room room6 = new Room("Room 6", "The polar bear is lurking");
        Room room7 = new Room("Room 7", "The polar bear is lurking");
        Room room8 = new Room("Room 8", "The polar bear is lurking");
        Room room9 = new Room("Room 9", "The polar bear is lurking");

        currentRoom = room1;
    }
public Room getCurrent(){
    return currentRoom;
}
public void setForRooms(){
        //Setters for each room connecting them
        //Room 1
room1.setNorthRoom(room2);
room1.setSouthRoom(room4);
        //Room 2
    room2.setEastRoom(room3);
    room2.setWestRoom(room1);
    //room 3
    room3.setWestRoom(room2);
    room3.setSouthRoom(room6);
    //room 4
}
}
