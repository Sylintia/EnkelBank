import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    //Attributes
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner myScan = new Scanner(System.in);

    //Constructors
    public Bank(){
        System.out.println("Do you want to create a new user? (1: yes, 2: no)");

        while (true) {

            try {
                int ans = myScan.nextInt();

                if (ans == 2) {
                    System.out.println("no new user");
                }
                break;
          //  } catch (IOException e) {
          //      System.out.println("not a number");
            } catch (Exception e) {
                System.out.println();e.getMessage();
                System.out.println("Something went worng!");
            }
        }
    }

    //Methods


    //Getters / Setters

}
