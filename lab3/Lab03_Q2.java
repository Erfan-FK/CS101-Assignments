package lab3;


/*Is My number Palindromic
 * date: 2022 / 10 / 20
 * @author Ugur Dogrusoz
 */

import java.util.Scanner;


public class Lab03_Q2 {
    public static void main(String[] args) {
        // obejvt of scanner
        Scanner scanner = new Scanner(System.in);
        
        // Geting number from user
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); 
        
        // assignin input to another varibale not to change
        long original = number;

        // turn integer to string to find its length
        String numberStr = String.valueOf(number);
        int length = numberStr.length();

        

        // checking if number meets requirments
        if (number < 100 || number > 9999999){
            System.out.println("The Input is invalid. The number must be between 3 and 7 digits long.");
            System.out.println("The numbere has " + length + " digits.");
        }
        else{
            // For 3 digits
            if (numberStr.length() == 3){
                if(numberStr.charAt(0) == numberStr.charAt(2)){
                    System.out.println(original + " is a palindromic number.");
                }
                else{
                    System.out.println(original + " is NOT a palindromic number.");
                }
            }
            // For 4 digits
            else if (numberStr.length() == 4){
                if(numberStr.charAt(0) == numberStr.charAt(3) && numberStr.charAt(1) == numberStr.charAt(2)){
                    System.out.println(original + " is a palindromic number.");
                }
                else{
                    System.out.println(original + " is NOT a palindromic number.");
                }
            }
            // For 5 digits
            else if (numberStr.length() == 5){
                if(numberStr.charAt(0) == numberStr.charAt(4) && numberStr.charAt(1) == numberStr.charAt(3) &&
                 numberStr.charAt(2) == numberStr.charAt(2)){
                    System.out.println(original + " is a palindromic number.");
                }
                else{
                    System.out.println(original + " is NOT a palindromic number.");
                }
            }
            // For 6 digits
            else if (numberStr.length() == 6){
                if(numberStr.charAt(0) == numberStr.charAt(5) && numberStr.charAt(1) == numberStr.charAt(4) &&
                numberStr.charAt(2) == numberStr.charAt(3)){
                    System.out.println(original + " is a palindromic number.");
                }
                else{
                    System.out.println(original + " is NOT a palindromic number.");
                }
            }
            // For 7 digits
            else if (numberStr.length() == 7){
                if(numberStr.charAt(0) == numberStr.charAt(6) && numberStr.charAt(1) == numberStr.charAt(5) &&
                numberStr.charAt(2) == numberStr.charAt(4) && numberStr.charAt(3) == numberStr.charAt(3)){
                    System.out.println(original + " is a palindromic number.");
                }
                else{
                    System.out.println(original + " is NOT a palindromic number.");
                }
            }
        }

        // Close Scanner to pervent source leak
        scanner.close();
        
    }    
}
