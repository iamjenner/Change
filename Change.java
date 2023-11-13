/* Ijenna Okonkwo
 * iso2108
 * Change.java - directs a cashier how to give change
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How much is due? ");

        int due = sc.nextInt();

        System.out.print("How much did the customer give you? ");

        int recieved = sc.nextInt();

        int change = recieved - due;
        int dollars, quarters, dimes, nickels, pennies;

        dollars = change/100;
        change = change%100;

        quarters = change/25;
        change = change%25;

        dimes = change/10;
        change = change%10;

        nickels = change/5;
        change = change%5;

        pennies = change;

        System.out.println("Change due:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
        
    }
    
    
}
