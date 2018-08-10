import java.util.Random;
import java.util.Scanner;

public class BasketballGame
{
    public static void main(String[] args)
    {
        playGame();
    }

    private static void playGame()
    {
        System.out.println("••••••••••••••••••••••••••••••••••••   Welcome to the Basketball Palace of Mid America   ••••••••••••••••••••••••••••••••••••");
        int WINNING_POSITION = 100;

        String firstPlayer;
        String secondPlayer;
        Scanner scanner = new Scanner(System.in);
        PairOfDice dice = new PairOfDice();
        System.out.println("Enter a name for Player One:");
        firstPlayer = scanner.nextLine();
        System.out.println("Enter a name for Player Two");
        secondPlayer = scanner.nextLine();
        BallPlayer playerOne = new BallPlayer(firstPlayer);
        BallPlayer playerTwo = new BallPlayer(secondPlayer);
        boolean gameContinue = true;

        BallPlayer offensivePlayer = playerOne;
        String winner;

        do
        {
            if (offensivePlayer == playerOne)
            {
                //Player One
                dice.roll();

                if (offensivePlayer.scoring(dice))
                {
                    playerTwo.assignFoul();
                    if (offensivePlayer.getFouls() < 5)
                    {
                        WINNING_POSITION++;
                        WINNING_POSITION++;
                    }
                    else
                    {
                        WINNING_POSITION++;
                    }
                }
                System.out.println("====================================================================================");
                System.out.println("\n" + (playerOne.getPossessions() + playerTwo.getPossessions()) + "     " + WINNING_POSITION + "\t\t♦ ♦ ♦ ♦\t" + offensivePlayer.getName() + " " + offensivePlayer.getShot(dice) + " \t♦ ♦ ♦ ♦\n");

                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + offensivePlayer.getName() + " rolls •" + dice.getDieTotalValue() + "• to get to •" + offensivePlayer.getPosition() + "•");
                System.out.println("====================================================================================");

                if (dice.getDieTotalValue() == 9)
                {
                    if (missShotRecovery())
                    {
                        offensivePlayer = togglePlayerPeg(playerOne, playerTwo, offensivePlayer);
                        System.out.println("\t\t\t#RoundMoundOfRebound");
                    }
                }
            }
            else
            {
                //Player Two
                dice.roll();


                if (offensivePlayer.scoring(dice))
                {
                    playerOne.assignFoul();
                    if (offensivePlayer.getFouls() < 5)
                    {
                        WINNING_POSITION++;
                        WINNING_POSITION++;
                    }
                    else
                    {
                        WINNING_POSITION++;
                    }
                }
                System.out.println("====================================================================================");
                System.out.println("\n" + playerOne.getPossessions() + playerTwo.getPossessions() + "     " + WINNING_POSITION + "\t\t♦ ♦ ♦ ♦\t" + offensivePlayer.getName() + " " + offensivePlayer.getShot(dice) + "\t♦ ♦ ♦ ♦\n");

                System.out.println(offensivePlayer.getName() + " rolls •" + dice.getDieTotalValue() + "• and makes it •" + offensivePlayer.getPosition() + "•");
                System.out.println("====================================================================================");

                if (dice.getDieTotalValue() == 9)
                {
                    if (missShotRecovery())
                    {
                        offensivePlayer = togglePlayerPeg(playerOne, playerTwo, offensivePlayer);
                        System.out.println("\t\t\t#RoundMoundOfRebound");
                    }
                }
            }

            offensivePlayer = togglePlayerPeg(playerOne, playerTwo, offensivePlayer);


            if (playerOne.getPossessions() + playerTwo.getPossessions() > WINNING_POSITION)
            {
                if (playerOne.getPosition() == playerTwo.getPosition())
                {
                    winner = " DRAW ";
                }
                else if (playerOne.getPosition() > playerTwo.getPosition())
                {
                    winner = playerOne.getName();
                }
                else
                {
                    winner = playerTwo.getName();
                }
                gameContinue = false;
                System.out.println("\n\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("\t\t\t++++++++++++++++++++++ \tBasketball Champion\t ++++++++++++++++++++++");
                System.out.println("\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("\n\t\t\t\t♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦" + winner + " wins♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
                System.out.println("\n\t\t\t\t♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦  " + playerOne.getPosition() + " - " + playerTwo.getPosition() + "  ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");

                System.out.println("\n\nGame Stats: ");
                System.out.println(playerOne.getName() + ": " + "Possessions: " + playerOne.getPossessions() + ", Turnovers: " + playerOne.getTurnovers() + ", Fouls: " + playerOne.getFouls());
                System.out.println("\n\n" + playerTwo.getName() + ": " + "Possessions: " + playerTwo.getPossessions() + ", Turnovers: " + playerTwo.getTurnovers() + ", Fouls: " + playerTwo.getFouls());

            }

        } while (gameContinue);
    }

    private static BallPlayer togglePlayerPeg(BallPlayer playerOne, BallPlayer playerTwo, BallPlayer offensivePlayer)
    {
        BallPlayer nextPlayer;
        if (offensivePlayer == playerOne)
        {
            nextPlayer = playerTwo;
        }
        else
        {
            nextPlayer = playerOne;
        }
        return nextPlayer;
    }

    private static boolean missShotRecovery()
    {
        boolean chance = false;

        Random random = new Random();
        int number = random.nextInt(2);
        if (number == 0)
        {
            chance = true;
        }
        return chance;
    }
}
