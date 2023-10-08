
/*This program will use a for loop in order to iterate between each of the four years after the 10th year and then it will print the total of the four years */

import java.lang.Math;
public class TuitionCalcWForLoop {
    public static void main(String[] args) throws Exception {

        // declare the variable needed for the compound interest formula
               double p = 10000;
               double r = .05;
               int t = 10;
               double compound_interest;
               int n = 1;
       
       
       // compute first instance of compound interest
                   compound_interest = p*(Math.pow((1+r/n), t));

    // print the total CI after 10 years.. %.2f will convert the double into a float for display to the user
                   System.out.printf("The cost of tuition after the 10th year is $ %.2f , ", compound_interest  );

    // initialize variable finalCompoundInterest = to 0 before enter a forloop
                   double finalCompoundInterest =0.0;

    // set a forloop for the variable year to cycle through 4 times. This is because the year needs to increase by 1 in orter to get the total with compound interest after each year. 
                   for(int year = 11; year <=14; year++){
                  
                      double interestPerYear = p*(Math.pow((1+r/n), year));

    // sum the years together and hold them in variable finalCompoundInterest              
                      finalCompoundInterest += interestPerYear;
                      
                  
                   }
    //print out the sum of the compound interest formula for 4 years worth of tuition cost.
                   System.out.printf("The total cost of tutition for four years after the 10th year is $ %.2f%n ", finalCompoundInterest);
    }
}
