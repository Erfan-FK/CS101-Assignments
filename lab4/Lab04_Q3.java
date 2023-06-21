package lab4;

import java.util.Scanner;

public class Lab04_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Checker for using while as do while loop
        int checker = 1;
        while (checker > 0) {

            // Ask for a Input
            System.out.print("Enter Input N: ");
            int input = scanner.nextInt();

            // Ask for operation
            System.out.print("Please Choose Your Operation. 'd' for Division and 'm' for Multiplication: ");
            char operator = scanner.next().charAt(0);

            // Ask for multipier
            System.out.print("Enter the multipier or divisor that is multiple of two: ");
            int multiple_input = scanner.nextInt();
            int multiple = 0;

            // calculate the power of 2
            while (multiple_input != 1) {
                multiple++ ;
                multiple_input /= 2;                
            }

            int new_value = 0;
            // Operation of Division and RIGHT SHIFTING
            if (operator == 'd') {
                new_value = input >> multiple;
            }

            // Operation of Multiplication and LEFT SHIFTING
            else if  (operator == 'm') {
                new_value = input << multiple;
            }

            // Output
            // Conver input to binary form
            int remainder = 0;
            String binary = "";
            while (new_value != 0) {
                remainder = new_value % 2;
                binary = remainder + binary;
                new_value /= 2;
            }
            System.out.println("0b" + binary);
            

            // Ask user for another round or no
            System.out.println("Do you want to do another operation Professor? 'y' for Yes, 'n' for No: ");
            char again = scanner.next().charAt(0);

            if (again == 'y') {
                checker = 1;
            }
            else if (again == 'n') {
                checker = -1;
            }
        }

        System.out.println("Hasta La Vista!");
        scanner.close();
    }    
}
