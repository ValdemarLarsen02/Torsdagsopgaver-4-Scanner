import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + ", please type your age");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
        int yearsBack = 67 - age;
        System.out.println("You have " + yearsBack + " years until you can retire.");
        
    }
}
