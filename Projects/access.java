import java.util.*;

class Simple {
    String name;
    String authorizedName = "Prakash"; // Assuming "Prakash" is the authorized name

    public void displayMessage() {
        if (name.equals(authorizedName)) {
            System.out.println("Good Morning: " + name);
        } else {
            System.out.println("Access Denied! \nImportant message: you are not an authorized person");
        }
    }
}

public class access {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please:");
        String name = sc.nextLine();

        Simple message = new Simple();
        message.name = name; // Set the name in the Simple class
        message.displayMessage();
    }
}
