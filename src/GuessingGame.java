import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomnum = new Random();
        System.out.println("Guess a number between 1 and 10:");
        int num1 = 0;
        int rannum = randomnum.nextInt(10);
        while (num1 != rannum) {
            num1 = input.nextInt();
            if (num1 > rannum)
                System.out.println("Too big. Try again");
            else if (num1 < rannum)
                System.out.println("Too Small. Try again");
        }
        System.out.println("Good Job!! You got the right number");
        }
    }

