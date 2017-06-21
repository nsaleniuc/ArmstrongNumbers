package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userNum, store, output = 0, remainder;

        Scanner in = new Scanner(System.in);//user input to check if cubed digits equals userNum
        System.out.println("Please enter a number:");
        userNum = in.nextInt();

        store = userNum;//userNum stored in variable to come back to later
        while (userNum != 0) {
            remainder = userNum % 10;//modulus separates last digit from userNum
            output = output + (remainder * remainder * remainder);//cubes remainder and adds output
            userNum = userNum / 10;//separates digits other than modulus from userNum
        }
        if (store == output) { //store stores original userNum, and compares to output from while loop
            System.out.println("True");
        } else {
            System.out.println("False");
            System.out.println("");
            System.out.println("Please try again");
        }
    }
}
