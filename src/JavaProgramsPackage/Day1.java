package JavaProgramsPackage;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) throws InterruptedException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
       // Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
      
        int num;
        double val;
        String str;
        
        /* Read and save an integer, double, and String to your variables.*/
        Scanner s1=new Scanner(System.in);
        System.out.println("Please enter integer");
        num=s1.nextInt();
        System.out.println("Please enter float value");
        val=s1.nextDouble();
        System.out.println("Please enter String-----------");
       
        str=s1.next();
        Thread.sleep(1000);
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        int sum=i+num;
        System.out.println("The addition of two int variable"+sum);
        
        /* Print the sum of the double variables on a new line. */
		double sum2=d+val;
        System.out.println("The addition of double values is"+sum2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

            String str3=s+str;
            System.out.println("The concatenated string____" +str3);

        s1.close();
    }
}