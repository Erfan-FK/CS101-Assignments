package lab3;

/*Gradutaion Time
 * date: 2022 / 10 / 20
 * @author Ugur Dogrusoz
 */


import java.util.Scanner;
class Lab03_Q1{
    public static void main(String[] args) {
        // Object of Scanner
        Scanner scanner = new Scanner(System.in);

        // take Credits Units from User
        System.out.println("Enter Your Credit Units: ");
        int credit_units = scanner.nextInt();

        // take CGPA from User
        System.out.println("Enter Your CGPA: ");
        double cgpa = scanner.nextDouble();

        // Check whether Credit Units are enough or not
        if (credit_units > 120 ){

            // Check wheter CGPA is enough or not
            if(cgpa > 2.00){
                System.out.println("The Gradaution requirments are satisified");
            }
            else{
                System.out.println("The CGPA is not sufficient");
                System.out.println("The gradaution requirments are NOT satisified");
            }
        }
        else{
            System.out.println("The credt units are not sufficient");
            System.out.println("The gradaution requirments are NOT satisified");
        }
        scanner.close();
    }
}