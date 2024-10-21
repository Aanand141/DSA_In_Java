import java.util.*;

class simple {
    String name;
    String prakash;
    public void displayMessage() {
        if(name==prakash){
        System.out.println("Good Morning :" + name);
        }
        else{
            System.out.println("Access Denied! \nImportant message:you are not an authorised person");
        }
    }
}


public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name plese!:");
        String name = sc.nextLine();
        simple mssage = new simple();
        mssage.name = name;
        mssage.displayMessage();

    }

}