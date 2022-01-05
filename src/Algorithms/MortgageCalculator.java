package Algorithms;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * This java program implements an algorithm that calculates monthly mortgage payments given a set of inputs:
 * <ul>
 *  <li>Mortgage amount
 *  <li>Term of payment in years
 *  <li>Annual Interest Rate
 *</ul>
 *
 * @author Mohammed Salim Dason - dasonsalim@outlook.com
 *
 */

public class MortgageCalculator {

    public static void main(String [] args) {
        /*
          Display monthly balance for the term of a loan

          @param MONTHS_IN_YEAR total number of months in a year i.e. 12 Months
         * @param PERCENT 100% therefore value set to 100
         * @param principal loan amount
         * @param annualInterest interest rate per year eg. 3.9% = 3.9
         * @param monthlyInterest monthly interest rate obtained by dividing annual interest rate by PERCENT and then by MONTHS_IN_YEAR
         * @param years total loan term in years
         * @param numberOfPayments total number of payments obtained by multiplying years * MONTHS_IN_YEAR
         * @param mortgageFormatted number formatting to return final result as a currency (dollars, euros, yen etc.)
         * @param mortgage final result of calculation which returns the total amount to be paid monthly as mortgage payments
         */

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your loan amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter your annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Enter loan term (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.ITALY);

        //        Displaying mortgage loan details
        System.out.println("The details of your mortgage are displayed below:");
        System.out.println(".................................................");
        System.out.println("Your loan amount: " + mortgageFormatted.format(principal));
        System.out.println("Term of loan (Years): " + years);
        System.out.println("Your interest rate: " + annualInterest);
        System.out.println("Your monthly payment: " + mortgageFormatted.format(mortgage));
        System.out.println(".................................................");
    }
}
