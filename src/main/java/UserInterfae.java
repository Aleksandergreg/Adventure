import java.util.Scanner;

public class UserInterfae {
    private Scanner input = new Scanner(System.in);
    public Adventure adventure = new Adventure();

    public void start() {
        System.out.println("Welcome to the adventure game");



        String userInput = "";
       while (!userInput.equals("exit")){
           userInput = input.nextLine().toLowerCase();
        switch (userInput){
            case "north", "n" -> System.out.println("Going north");
            case  "south", "s" -> System.out.println("Going south");
            case "east", "e" ->System.out.println("Going east");
            case "west", "w" -> System.out.println("Going west");
            case "look", "l" ->{ System.out.println(adventure.getCurrent().getDescription());
                System.out.println("You are inside of "+ adventure.getCurrent().getName());
            break;}
            case "exit" -> { System.exit(0);}
            case "info" -> System.out.println("""
                            Write north, south, east or west to move in this dirrection
                            Write look to view your current room 
                            Write exit to exit the game
                            """);
        }
       }
    }
}
