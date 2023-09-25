public class Room {
    private String name;
    private String description;
    private Room northRoom;
    private Room soutRoom;


    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName (){
        return name;

    }
}
