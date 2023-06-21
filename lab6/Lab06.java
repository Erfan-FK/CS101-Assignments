package lab6;
import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Password Decoder
        // System.out.print("Please input the password: ");
        // int input = scanner.nextInt(); 
        // System.out.println(passwordDecoder(input));

        // Prime Element Summation
        // System.out.println("Please input the natural number: ");
        // int number = scanner.nextInt();
        // System.out.println("The summation of the prime factors of " + number + " is " + primeSummation(number));

        // Pythagorean Checker
        // System.out.print("Please enter the first number: ");
        // int a = scanner.nextInt();
        // System.out.print("Please enter the second number: ");
        // int b = scanner.nextInt();
        // System.out.print("Please enter the third number: ");
        // int c = scanner.nextInt();
        // isPythagorean(a, b, c);

        // Binary AND/OR operation
        // System.out.print("please enter the first natural number: ");
        // int number1 = scanner.nextInt();
        // System.out.print("please enter the second natural number: ");
        // int number2 = scanner.nextInt();
        // intToBinary(number1);
        // intToBinary(number2);
        // binaryAND(number1, number2);
        // binaryOR(number1, number2);

        scanner.close();
    }


// Password Decoder

    // returns the largest integer smaller than the input
    public static int floor(double digit){

        double largest_int = (10 - Math.pow((digit / 2 - 3), 2) - 0.32);
        return  (int) largest_int;
    }

    // calculate the decoded digit
    public static int digitDecoder(int digit) {

        int decoded_digit = floor(digit);
        return decoded_digit;     
    }

    // Decode Whole password
    public static int passwordDecoder(int password) {

        int decoded_password = 0;
        int reversed_password = 0;
        int number = 0;

        // reverse password
        while(password != 0){

            number = password % 10;
            reversed_password = reversed_password * 10 + number;
            password /= 10;
        }

        // decode password
        while(reversed_password != 0){

            number = digitDecoder(reversed_password % 10);
            decoded_password = decoded_password * 10 + number;
            reversed_password /= 10;            
        }

        System.out.print("The decoded password is: ");
        return decoded_password;
    }
    

// Prime Element SUmmation

    // Check if digit is prime 
    public static boolean isPrime(int number) {

        boolean isPrime = true;

        // Go through each digit until number 
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
            }
        }
        
        return isPrime;        
    }

    // Calculate the sum of prime dividers
    public static int primeSummation(int number) {

        int sum = 0;

        // find all dividers and check if is prime or not
        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {

                if (isPrime(i)){
                    sum += i;
                }
            }
        }

        return sum;
    }

// Pythagorean Checker 

    // Power method 
    public static int power(int base, int exponent) {

        int number = base;
        for (int i = 1; i < exponent; i++) {

            number *= base;
        }

        return number;        
    }

    // Pythagorean checker
    public static boolean isPythagorean(int a, int b, int c) {
        
        boolean isPythagorean = true;

            if ( power(b, 2) == power(c, 2) + power(a, 2)) {
                System.out.println("The triplet is pythagorean, power(" + b + ", 2) = power(" + c + ", 2) + power(" + a + ", 2)");
                isPythagorean = true;
            }
            else if (power(c, 2) == power(b, 2) + power(a, 2)) {
                System.out.println("The triplet is pythagorean, power(" + c + ", 2) = power(" + b + ", 2) + power(" + a + ", 2)");
                isPythagorean = true;

            }
            else if(power(a, 2) == power(c, 2) + power(b, 2) ){
                System.out.println("The triplet is pythagorean, power(" + a + ", 2) = power(" + c + ", 2) + power(" + b + ", 2)");
                isPythagorean = true;

            }
            else{
                System.out.println("The triplet is not pythagorean.");
                isPythagorean = false;
            }

        return isPythagorean;
    }

// Binary AND/OR operations

    // Int converter to binary
    public static long intToBinary(int number) {

        long binary = 0;
        int remainder = 0; 
        String binary_S = "";

        // Convert to Binary
        while (number != 0){
            remainder = number % 2;
            binary_S = remainder + binary_S;
            number /= 2;
        }
        
        // Convert String to Long
        binary = Long.valueOf(binary_S);

        System.out.println("Binary represent of the number: " + binary);
        return binary;
    }

    // Bitwise AND method
    public static long binaryAND(int number1, int number2) {
        
        long binaryAND = 0;
    
        binaryAND = number1 & number2;

        System.out.println("The bitwise AND operation result: " + binaryAND);
        return intToBinary((int) binaryAND);
    }

    // Bitwise OR method
    public static long binaryOR(int number1, int number2) {
        
        long binaryOR = 0;

        binaryOR = number1 | number2;

        System.out.println("The bitwise OR operation result: " + binaryOR);
        return intToBinary((int) binaryOR);
    }

      
}

