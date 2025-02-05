//Caden Maki
//CS1400
//Assignment 2
//9-20-2024
//TaskB Splitting the bill

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskB
{
    public static void main (String[]arg)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("How many people are in your party?: ");
        int partySize = in.nextInt();//takes user input for party size
        System.out.println();

        System.out.print("What is the total bill amount before tax and tip?: ");
        double billAmount = in.nextDouble();//takes user input for bill amount
        System.out.println();

        //declares variables for tax and tip rate
        double tax = .0725;
        double tip = .20;

        //Processing
        double tipAmount = (billAmount * tip);
        double taxAmount = ((billAmount + tipAmount) * tax);
        double totalAmount = billAmount + taxAmount + tipAmount;
        double amountPerPerson = (totalAmount / partySize);

        //limits the decimal value to two places

        //Outputs results
        System.out.print("for a party size of " + partySize
                + " people, the amount due for each person is: $" +
                new DecimalFormat("#.##").format(amountPerPerson)); //Truncates the double variable
        //and limits it to two places
    }
}