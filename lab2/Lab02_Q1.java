/* Ellipse Properties
 * This program prints information about the lab schedule and grading policy.
 * It has certain syntax errors that are to be fixed by the student.
 * date: 2022 / 10 / 20
 * @author Ugur Dogrusoz
 */

package lab2;
import java.util.Scanner;

public class Lab02_Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Take input and data from the user 
        System.out.println("Enter length of the semi major axis of the ellipse: ");
        double a = scanner.nextDouble();

        System.out.println("Enter length of the semi minor axis: ");
        double b = scanner.nextDouble();

        // Calculate and output the Area of the ellipse
        double area_Ellipse = Math.PI * a * b;
        System.out.printf("The area of the ellipse is : %.3f" , area_Ellipse);
        System.out.println();


        // calculate and output the circumference Ellipse
        double expression = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
        double sqrt = Math.sqrt(expression);
        double circumference_Ellipse = 2 * Math.PI * sqrt;
        System.out.printf("The circumference of the ellipse is ~ : %.3f" , circumference_Ellipse);
        System.out.println();
    
        scanner.close();


    }
    
}
