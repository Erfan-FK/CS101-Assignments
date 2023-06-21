/* @author Ugur Dogrusoz
* this program does some calculations for simple math expressions
* date: 2022 / 10 / 06
*/


public class Lab01_Q2 { 
    public static void main(String[] args) {
        // Expression 1
        double expression_1_denominator = (1.5 - 7.3)*(4.3 + 24.0);
        double expression_1_nominator = 32.2 - (17 / 22);
        // double expression_1_nominator = 32.2 - (17.0 / 22.0);
        double expression_1_result = expression_1_nominator / expression_1_denominator;

        // Expression 2
        double expression_2_denominator = (Math.pow(2,5) + 34);
        double expression_2_nominator = (73.5 * 16.4)-(Math.pow(3, 2)*81);
        double expression_2_result = expression_2_nominator / expression_2_denominator;

        // Expression 3
        double expression_3_base = (2.4 - 0.4);
        double expression_3_power = (-2.0 / 6.0);   
        double expression_3_result = (Math.pow(expression_3_base, expression_3_power ));
        
        // output
        System.out.println("Result of expression 1 is: " + expression_1_result);
           
        System.out.println("Result of expression 2 is: " + expression_2_result);
        
        System.out.println("Result of expreesion 3 is: " + expression_3_result);
        
    }
    
}
