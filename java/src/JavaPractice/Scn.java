package JavaPractice;

import java.util.Scanner;

public class Scn {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter a line of integer: ");

        // Wait for the user to enter something
        int value = input.nextInt();

        // Tell them what they entered
        System.out.println("You entered "+value);
    }
}
