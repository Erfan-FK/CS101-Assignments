package lab4;

import java.util.Scanner;

public class Lab04_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take Input
        System.out.print("Please input n: ");
        int input = scanner.nextInt();

        // Declare Variables
        int remainder = 0;
        String binary = "";

        // Convert to Binary
        while (input != 0){
            remainder = input % 2;
            binary = remainder + binary;
            input /= 2;
        }
        
        // Convert String to Long
        long binary_int = Long.valueOf(binary);

        // Output 
        System.out.println(binary_int);
        
        scanner.close();
    }
}
