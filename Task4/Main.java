import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        GameMenu gameMenu = new GameMenu(actions);
        
        // Get user choice
        String userChoice = gameMenu.getAction();
        
        // Convert userChoice to int and call doAction
        try {
            int action = Integer.parseInt(userChoice);
            doAction(action);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    // Printing what the user choose
    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting game");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid action.");
                break;
        }
    }
}
