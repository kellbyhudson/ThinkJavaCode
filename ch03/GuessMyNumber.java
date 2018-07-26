import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        System.out.println("I'm thinking of number between 1 and 100\n" +
                "(including both). Can you guess what it is?");

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int difference;
        int number = random.nextInt(100) + 1;
        System.out.print("Type a number: ");
        guess = in.nextInt();

        System.out.println("\nYour guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        difference = guess - number;
        System.out.println("You were off by " + Math.abs(difference));
    }
}
