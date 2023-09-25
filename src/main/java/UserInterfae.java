import java.util.Scanner;

public class UserInterfae {
    private Scanner input = new Scanner(System.in);
    public Adventure adventure = new Adventure();
    public void start() {
        System.out.println("Welcome to the adventure game");
        String UserInput = input.nextLine();
        switch (UserInput){
            case "north", "n" -> System.out.println("Going north");
            case  "south" -> System.out.println("Going south");
            case "east" ->System.out.println("Going east");
            case "west" -> System.out.println("Going west");
            case "look" -> adventure.getCurrent();
            case "exit" -> System.exit(0);
            case "info" -> System.out.println("""
                            Write north, south, east or west to move in this dirrection
                            Write look to view your current room 
                            Write exit to exit the game
                            """);
        }
    }
}
