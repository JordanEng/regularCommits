/**
 * Created by ros_jheng on 10/21/2015.

 Extend previous gitHub assignment to allow the user to submit a second number if they choose. If a second number is submitted then the program should print GCD for the numbers rather than factors.  Add a JUnit test suite to test all edge cases in the program (including cases from the original assignment).

 Requirements:
 Create a new branch off of your github project and submit changes daily.
 Create Pull Requests from your newly created branch to your main branch. Accept the pull requests on your main branch and merge them.
 Each Junit test should account for a specific success or error scenario. You should write at least 4 tests.
 Example input:

 > 10 15
 5

 > 10
 1 2 5 10
 */

import java.util.*;

public class regularCommits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String lineInput;
        int numberInput1;
        int numberInput2;

        regularCommits run = new regularCommits();

        while (true){
            lineInput = console.nextLine();

            if(lineInput.equalsIgnoreCase("quit")) {
                    return;
            }
            else if (lineInput.contains(" ")){
                int space = lineInput.indexOf(" ");
                numberInput1 = Integer.parseInt(lineInput.substring(0, space));
                numberInput2 = Integer.parseInt(lineInput.substring(space + 1, lineInput.length()));

                int gcd = run.twoNumbers(numberInput1, numberInput2);
                System.out.println(gcd);
            } else {
                numberInput1 = Integer.parseInt(lineInput);
                String factors = run.oneNumber(numberInput1);
                System.out.println(factors);
            }
        }
    }

    public String oneNumber(int numberInput1){
        String factors = "";

        if (numberInput1 > 100 || numberInput1 < 1) {
            return "Only integer values between 1 and 100 are allowed";
        }

        for (int i = 1; i < numberInput1; i++) {
            if (numberInput1 % i == 0) {
                factors = factors + i + " ";
            }
        }

        factors = factors + numberInput1;

        return factors;
    }

    public int twoNumbers(int numberInput1, int numberInput2){
        int smallerNumber;
        int gcd = 1;

        if (numberInput1 > numberInput2) {
            smallerNumber = numberInput2;
        } else {
            smallerNumber = numberInput1;
        }

        for (int i = smallerNumber; i >= 1; i--) {
            if (numberInput1 % i == 0 && numberInput2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
