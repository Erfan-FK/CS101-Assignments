/* Maintenance Cost of a House
 * This program prints information about the lab schedule and grading policy.
 * It has certain syntax errors that are to be fixed by the student.
 * date: 2022 / 10 / 20
 * @author Ugur Dogrusoz
 */ 

package lab2;

import java.util.Scanner;

public class Lab02_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cost in dollars
        final double AVERAGE_COST = 237760;
        final double AVERAGE_SITEWORK = 15903;
        final double AVERAGE_FOUNDATIONS = 25671;
        final double AVERAGE_FARMING = 41123;
        final double AVERAGE_EXTERIOR = 33066;
        final double AVERAGE_UTILITY = 32746;
        final double AVERAGE_INTERIORFINISHES = 67939;
        final double AVERAGE_OUTDOOR = 16591;
        final double AVERAGE_UNEXPECTED = AVERAGE_COST - (AVERAGE_SITEWORK + 
        AVERAGE_FOUNDATIONS + AVERAGE_FARMING + AVERAGE_EXTERIOR + AVERAGE_UTILITY + AVERAGE_INTERIORFINISHES + AVERAGE_OUTDOOR);

        // percentages of each construction costs
        final double AVERAGE_SITEWORK_PERCENT = (AVERAGE_SITEWORK * 100) / AVERAGE_COST;
        final double AVERAGE_FOUNDATION_PERCENT = (AVERAGE_FOUNDATIONS * 100) / AVERAGE_COST;
        final double AVERAGE_FARMING_PERCENT = (AVERAGE_FARMING * 100) / AVERAGE_COST;
        final double AVERAGE_EXTERIOR_PERCENT = (AVERAGE_EXTERIOR * 100) / AVERAGE_COST;
        final double AVERAGE_UTILITY_PERCENT = (AVERAGE_UTILITY * 100) / AVERAGE_COST;
        final double AVERAGE_INTERIORFINISHES_PERCENT = (AVERAGE_INTERIORFINISHES * 100) / AVERAGE_COST;
        final double AVERAGE_OUTDOOR_PERCENT = (AVERAGE_OUTDOOR * 100) / AVERAGE_COST;
        final double AVERAGE_UNEXPECTED_PERCENT = (AVERAGE_UNEXPECTED * 100) / AVERAGE_COST;

        
        // Random House cost input
        System.out.println("Enter the cost of building a house in USD: ");
        double house_cost = scanner.nextDouble();

        // Stars 1st line
        System.out.println("*".repeat(49));

        // Stars 2nd line
        System.out.println("*".repeat(6) + "\tHouse Cost Distribution Table\t" + "*".repeat(6));

        // Stars 3rd line
        System.out.println("*".repeat(49));

        // Random House constructions costs
        double sitework_cost = house_cost * AVERAGE_SITEWORK_PERCENT;
        double foundation_cost = house_cost * AVERAGE_FOUNDATION_PERCENT;
        double farming_cost = house_cost * AVERAGE_FARMING_PERCENT;
        double exterior_cost = house_cost * AVERAGE_EXTERIOR_PERCENT;
        double utility_cost = house_cost * AVERAGE_UTILITY_PERCENT;
        double interiorFinishes_cost = house_cost * AVERAGE_INTERIORFINISHES_PERCENT;
        double outdoor_cost = house_cost * AVERAGE_OUTDOOR_PERCENT;
        double unexpected_cost = house_cost * AVERAGE_UNEXPECTED_PERCENT;

        // OUTPUT & rest of the list
        System.out.println("* Site Work \t\t" + "%" + (int)AVERAGE_SITEWORK_PERCENT + "\t\t" + Math.round(sitework_cost) + "\t*");
        System.out.println("* Foundation \t\t" + "%" + (int)AVERAGE_FOUNDATION_PERCENT + "\t\t" + Math.round(foundation_cost) + "\t*");
        System.out.println("* Farming \t\t" + "%" + (int)AVERAGE_FARMING_PERCENT + "\t\t" + Math.round(farming_cost) + "\t*");
        System.out.println("* Exterior \t\t" + "%" + (int)AVERAGE_EXTERIOR_PERCENT + "\t\t" + Math.round(exterior_cost) + "\t*");
        System.out.println("* Utility \t\t" + "%" + (int)AVERAGE_UTILITY_PERCENT + "\t\t" + Math.round(utility_cost) + "\t*");
        System.out.println("* Interior Finishes \t" + "%" + (int)AVERAGE_INTERIORFINISHES_PERCENT + "\t\t" + Math.round(interiorFinishes_cost) + "\t*");
        System.out.println("* Outdoor \t\t" + "%" + (int)AVERAGE_OUTDOOR_PERCENT + "\t\t" + Math.round(outdoor_cost) + "\t*");
        System.out.println("* Unexpected Costs \t" + "%" + (int)AVERAGE_UNEXPECTED_PERCENT + "\t\t" + Math.round(unexpected_cost) + "\t*");
        System.out.println("* TOTAL \t\t" + "\t   " + house_cost + " \t*");
        System.out.println("*".repeat(49));

        scanner.close();
        
    }
    
}
