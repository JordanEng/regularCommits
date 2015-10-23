/**
 * Created by ros_jheng on 10/21/2015.

 Write a console program that asks for an integer input from 1-100, then prints all of the factors of that number
 (prime factors only if you're feeling ambitious). Any non-integer input or input outside the given range should
 print an error message ("Only integer values are allowed" or some such. The program should continue accepting
 user input until the user enters "quit" (case insensitive), which will exit the program.

 Example input:
 > 10
 1 2 5 10
 > quit
 */

import java.util.*;

public class regularCommits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true){
            String input = console.next();
            int numberInput;

            if (input.equalsIgnoreCase("quit")) {
                return;
            } else {
                numberInput = Integer.parseInt(input);
            }

            if(numberInput > 100 || numberInput < 1){
                System.out.println("Only integer values between 1 and 100 are allowed");
                return;
            }

            for (int i = 1; i <= numberInput; i++) {
                if (numberInput % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
