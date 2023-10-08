
/*This program does not use a for loop in order to get the tota for four years of college after the 10th year */

import java.lang.Math;
public class tutionCost {
// formula for compound intrest A=P(1+r/n)^nt
    public static void main(String[] args) throws Exception {

 // declare the variable needed for the compound interest formula
        double p = 10000;
        double r = .05;
        int t = 10;
        double compound_interest = 0.0;
        int n = 1;


// compute first instance of compound interest
            compound_interest = p*(Math.pow((1+r/n), t));

// print the total CI after 10 yrs
            System.out.printf("The cost of tuition after the 10th year is $ %.2f , ", compound_interest  );

// declare variables for the cost of each year after the 10th year
    double compound_interestAfter11Yrs = p*(Math.pow((1+r/n), 11));

    double compound_interestAfter12Yrs = p*(Math.pow((1+r/n), 12));

    double compound_interestAfter13Yrs = p*(Math.pow((1+r/n), 13));

    double compound_interestAfter14Yrs = p*(Math.pow((1+r/n), 14));


// declare the final variable to hold the sum of the for years
    double FinalCompoundInterest = compound_interestAfter11Yrs += compound_interestAfter12Yrs += compound_interestAfter13Yrs += compound_interestAfter14Yrs;

// print the final output displaying the four year total
    System.out.printf("The total cost of tuition for four years after the 10th year is %.2f ", FinalCompoundInterest);

        }

   
    }
    

