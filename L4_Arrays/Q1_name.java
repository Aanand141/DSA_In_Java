import java.util.Scanner;

class Formullah {
    public String DisplayArray(String[] name) {
        StringBuilder result = new StringBuilder();
        for (String s : name) {
            result.append(s).append(" ");
        }
        return result.toString().trim();
    }
}

public class Q1_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students are there:");
        int seize = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] name = new String[seize];
        System.out.println("Enter the names of students:");
        for (int i = 0; i < seize; i++) {
            name[i] = sc.nextLine();
        }
        Formullah formullah = new Formullah();
        System.out.println("Names of students are: " + formullah.DisplayArray(name));
    }
}
