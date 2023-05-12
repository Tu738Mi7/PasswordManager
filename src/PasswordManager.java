import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager {
    private static HashMap<String, String> passwords = new HashMap<String, String>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Password Manager");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add Password");
            System.out.println("2. View Password");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPassword();
                    break;
                case 2:
                    viewPassword();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void addPassword() {
        System.out.println("\nPlease enter the name of the account:");
        String account = scanner.next();

        System.out.println("Please enter the password:");
        String password = scanner.next();

        passwords.put(account, password);

        System.out.println("\nPassword added successfully!");
    }

    private static void viewPassword() {
        System.out.println("\nPlease enter the name of the account:");
        String account = scanner.next();

        if (passwords.containsKey(account)) {
            System.out.println("The password for " + account + " is " + passwords.get(account));
        } else {
            System.out.println("Account not found.");
        }
    }
}
