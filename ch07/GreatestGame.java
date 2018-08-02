import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GreatestGame
{
    public static int randomNumber()
    {
        int random;

        Random rand = new Random();
        random = rand.nextInt(100) + 1;

        return random;
    }

    public static int newGame(String player)
    {
        Scanner scanner = new Scanner(System.in);

        int answer;
        int guess;
        int counter = 1;
        boolean win = false;

        answer = randomNumber();
        System.out.println("Guess a number " + player + ": ");
        guess = scanner.nextInt();
        while (guess != answer && counter < 5)
        {
            if (guess < answer)
            {
                System.out.println(counter + ": Try a higher number: ");
            }
            else
            {
                System.out.println(counter + ": Try a lower number: ");
            }
            counter++;

            guess = scanner.nextInt();
        }

        if (guess == answer)
        {
            System.out.println("You Win! Yippee!");
            win = true;
        }

        if (win == false)
        {
            System.out.println("You guessed wrong 5 times, You lose");
            System.out.println("Number was " + answer);
            counter = 0;
        }
        else
        {
            System.out.println("It only took you " + (counter) + " guesses...");
        }
        return counter;
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int game;
        int win = 0;
        int loss = 0;
        int guesses;
        double stored = 0;

        String player;
        System.out.println("What is your name?");
        player = scanner.nextLine();

        do
        {
            guesses = newGame(player);
            Scanner play = new Scanner(System.in);
            if (guesses == 0)
            {
                loss++;
            }
            else
            {
                win++;
            }
            stored = stored + guesses;
            String average;
            if (stored / win > 0)
            {
                average = "" + stored / win;
            }
            else
            {
                average = "Zero";
            }
            System.out.println("You have " + win + " wins and " + loss + " losses and average " + average + " guesses per win.");
            System.out.println("Play again? (1 = Yes, 2 = No)");
            game = play.nextInt();

        } while (game == 1);

    }
}
