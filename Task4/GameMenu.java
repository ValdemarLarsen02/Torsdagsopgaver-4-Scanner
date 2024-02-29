import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String> actions;

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu() {
        for (String action : actions) {
            System.out.println(action);
        }
    }
    
    // Method for getting the data from the user.
    public String getAction() {
        displayMenu();
        System.out.println("Type a number to choose an action:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice;
    }
}
