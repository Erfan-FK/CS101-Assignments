package lab4;

import java.util.Scanner;

public class Lab04_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter Input n: ");
        int input = 0;

        // Check if input is valid
        if (scanner.hasNextInt()){
            input = scanner.nextInt();
            if (input < 0){
                System.out.println("Enter a None-Negetive Integer Stupid!!!");
                System.exit(0);
            }
        }
        else {
            System.out.println("Enter an Integer Stupid!!!");
            System.exit(0);
        }

        int inverted = 0;

        // Reverse Number
        while (input > 0){
            int num = input % 10;
            inverted = inverted * 10 + num;
            input /= 10;
        }

        // Output the reverse number
        System.out.println(inverted);
        
        scanner.close();
    }
}