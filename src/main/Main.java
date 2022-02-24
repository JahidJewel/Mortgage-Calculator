package main;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Priod (Years): ");
        int Period = scanner.nextInt();
        int Months = Period * MONTHS_IN_YEAR;

        double Mortgages = principal * ( monthlyInterest * Math.pow (1+monthlyInterest, Months)
        / (Math.pow (1 + monthlyInterest , Months) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgages);
        System.out.println("Mortgages: " + mortgageFormatted);


    }
}
