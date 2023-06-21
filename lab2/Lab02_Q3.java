/* Strings Incorporated
 * This program prints information about the lab schedule and grading policy.
 * It has certain syntax errors that are to be fixed by the student.
 * date: 2022 / 10 / 20
 * @author Ugur Dogrusoz
 */ 
package lab2;
import java.util.Scanner;

public class Lab02_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();

        System.out.println("-".repeat(50));

        // Title length 
        int title_length = title.length();
        System.out.println("Number of characters: " + title_length);

        // Turn Lowercase
        String title_lowercase = title.toLowerCase();
        System.out.println("All Lowercase: " + "\"" + title_lowercase + "\"");

        // remove whitespaces from ends
        String title_trim = title.trim();
        System.out.println("Remove leading and trailing blank characters:" + "\"" + title_trim + "\"");

        // Chara at index 4
        char title_index4 = title.charAt(4);
        System.out.println("Character at index posotion 4: " + title_index4);

        // from 3rd char to 5th char
        String title_3to5 = title.substring(2, 5);
        System.out.println("Title from 3rd character to 5th character (both included): " + title_3to5);

        // first occurenc of char 'P'
        int title_first_P = title.indexOf('e');
        System.out.println("First occurence of 'e': " + title_first_P);

        // last occurenc of char 'P'
        int title_last_P = title.lastIndexOf('P');
        System.out.println("Last occurence of 'e': " + title_last_P);

        scanner.close();
    }    
}
