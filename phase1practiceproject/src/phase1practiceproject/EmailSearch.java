package phase1practiceproject;

import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        // Sample array of email IDs
        String Emails[] = {
            "hemank@gmail.com",
            "john@gmail.com",
            "ryan@gmail.com",
            "tom@gmail.com",
            "jack@gmail.com"
        };

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the email ID to search
        System.out.print("Enter the email ID to search: ");
        String emailToFind = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the searchEmail method to check if the email exists
        boolean found = searchEmail(emailToFind, Emails);
        

        // Display the result
        if (found) {
            System.out.println("The email ID " + emailToFind + " was found in the list.");
        } else {
            System.out.println("The email ID " + emailToFind + " was not found in the list.");
        }
    }

    // Method to search for an email ID in an array
    public static boolean searchEmail(String emailToFind, String[] emailList) {
        for (String email : emailList) {
            if (email.equals(emailToFind)) {
                return true;
            }
        }
        return false;
    }
}
