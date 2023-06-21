package lab5;

import java.util.Scanner;

public class Lab05_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter 'falling stars' as string: ");
        String stars = scanner.next();
        
        // Find Max value in the string
        int max = 0;
        for (int i = 0; i < stars.length(); i++) {
            if (stars.charAt(i) > max) {
                max = stars.charAt(i);
            }   
        }
        
        // Convert max values ASCII to integer
        max -= '0';
 
        System.out.println("Falling Stars: ");
        System.out.println(stars);
        
        // go through each row
        for (int j = 0; j < max; j++) {
            
            // go through each column
            for (int k = 0; k < stars.length(); k++) {

                // Check if value in specified position is greater than its row or not
                if (stars.charAt(k) - '0' > j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close(); 
    }
}
