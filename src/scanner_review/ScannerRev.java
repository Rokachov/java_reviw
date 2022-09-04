package scanner_review;

import java.util.Scanner;
public class ScannerRev {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //1. Ask the user to enter an  integer number
        System.out.println("Enter an integer number:");
        int a = input.nextInt();

        //2. Ask the user to enter a decimal number
        System.out.println("Enter a decimal number:");
        double b = input.nextDouble();

        //3. Ask the user to enter a word
        System.out.println("Enter a word:");
        String c = input.next();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }

}
