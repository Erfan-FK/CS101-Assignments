/*Let's Create PvP Game!

 * date: 2022 / 10 / 20
 * @author Ugur Dogrusoz
 */

package lab3;
import java.util.Scanner;

public class Lab03_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coins = 600;
        String buddy = null;

        // Username Check
        System.out.print("Enter your username: ");
        String username = scanner.next();
        if(!username.equals("JavaWarrior")){
            System.out.println("Username not found! Bye!");
            System.exit(0);
        }
   
        
        // Password Check
        System.out.print("Enter your password: ");
        String password = scanner.next();
        if(!password.equals("JavaRocks")){
            System.out.println("Wrong Password, Bye!");
            System.exit(0);
        }

        // Display Menu
        System.out.println("1- Upgrade Armor");
        System.out.println("2- Add a buddy");
        System.out.println("3- Chagne credentials");
        System.out.print("Select an operation: ");
        
        // Users Choice
        int choice = scanner.nextInt();

        // Choice 1 body
        if(choice == 1){
            System.out.println("Upgrade Armor: ");
            System.out.println("You have " + coins + " coins.");
            System.out.println("Your armor has benn upgraded");
            coins -= 150;
            System.out.println("You have " + coins + " coins.");
        }
        
        // Choice 2 budyy
        else if (choice == 2){
            System.out.println("Add a buddy: ");

            // Choice 2 if there is no buddy
            if( buddy == null ){
                System.out.print("Enter your buddy's name: ");
                buddy = scanner.next();
                System.out.println("Your Buddy is " + buddy + ". Bye!");
            }

            // Choice 2 if there is buddy
            else{
                System.out.println("You already have a buddy");
                System.out.println("Your Buddy is " + buddy + ". Bye!");
            }
        }

        // Choice 3 body
        else if (choice == 3){
            System.out.println("Change Credentials: ");
            System.out.println("1- Change username");
            System.out.println("2- Change password");
            System.out.print("Select Option:");
            int second_Choice = scanner.nextInt();

            // If user wants to change username
            if(second_Choice == 1){
                System.out.print("Enter your new username: ");
                username = scanner.next();
                System.out.println("Your new username is " + username );
                System.out.println("Your password is " + password );
                System.out.println("Bye!");
            }

            // If user wants to change password
            else if (second_Choice == 2){
                System.out.print("Enter your new password: ");
                password = scanner.next();
                System.out.println("your username is " + username);
                System.out.println("Your password is " + password );
                System.out.println("Bye!");
            }
        }
        scanner.close();
    } 
}
