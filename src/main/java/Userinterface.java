import java.util.Scanner;

public class Userinterface {
    private Scanner input = new Scanner(System.in);
    public Adventure adventure = new Adventure();


    public void start() {
        System.out.println("Welcome to the adventure game");


        String userInput = "";
        while (true) {
            userInput = input.nextLine().toLowerCase().trim();
            switch (userInput) {
                case "north", "n", "go north" -> {
                    System.out.println("going north");
                    adventure.goNorth();
                    System.out.println(Farve.ANSI_RED + "You are inside of: "+adventure.getCurrent().getName() + adventure.getCurrent().getDescription());
                }
                case "south", "s", "go south" -> {
                    System.out.println(Farve.ANSI_RESET + Farve.ANSI_BLUE + "Going south" + Farve.ANSI_RESET);
                    adventure.goSouth();
                    System.out.println(Farve.ANSI_GREEN + "You are inside of: "+adventure.getCurrent().getName() + adventure.getCurrent().getDescription() + Farve.ANSI_RESET);
                }
                case "east", "e", "go east" -> {
                    System.out.println("Going east");
                    adventure.goEast();
                    System.out.println("You are inside of: "+adventure.getCurrent().getName() + adventure.getCurrent().getDescription());
                }
                case "west", "w", "go west" -> {
                    System.out.println("Going west");
                    adventure.goWest();
                    System.out.println("You are inside of: " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());
                }
                case "look", "l", "looking around" ->
                        System.out.println("You are inside of " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());
                case "exit" -> {
                    System.out.println(Farve.ANSI_BLUE + "Home of the free" +Farve.ANSI_WHITE+" -because of the brave" +Farve.ANSI_RED+"- Thank you for playing");
                    System.exit(0);
                }
                case "info" -> System.out.println("""
                        Write north, south, east or west to move in this dirrection
                        Write look to view your current room
                        Write exit to exit the game
                        """);
                default -> System.out.println("Ugyldigt input");
            }
        }
    }
}
