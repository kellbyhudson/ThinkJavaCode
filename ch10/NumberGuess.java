import java.util.Scanner;

public class NumberGuess
{
    public static void main(String[] args)
    {
        playGames();
    }

    private static void playGames()
    {
        boolean playerWantsToKeepPlaying;
        do
        {
            playgame();
            playerWantsToKeepPlaying = getYesOrNoFromUser("Want to play again?");
        }while(playerWantsToKeepPlaying);
    }

    public static void playgame()
    {
        Die die = new Die();

        System.out.println("I am going to roll a die");
        die.roll();
        System.out.println("Can you guess the number?");

        int guess = getNumberFromUser();

        if (guess == die.getValue())
        {
            System.out.println("You got it!");
        }
        else
        {
            System.out.println("Wrong! No soup for you! See you next year?");
        }
    }

    private static int getNumberFromUser ()
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }

    private static boolean getYesOrNoFromUser (String question)
    {
        System.out.println(question);
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        boolean yes = false;

        if(answer.equalsIgnoreCase("Yes"))
        {
            yes = true;
        }
        return yes;
    }
}
