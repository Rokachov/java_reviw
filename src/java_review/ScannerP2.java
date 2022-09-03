package java_review;

import java.util.Scanner;

public class ScannerP2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first sentence");
        String firstSte = input.nextLine();

        System.out.println("Enter your second sentence");
        String secondSte = input.nextLine();

        System.out.println("firstSte = " + firstSte);
        System.out.println("secondSte = " + secondSte);
    }
}
