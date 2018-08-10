public class Roundabout
{
    public static void main(String[] args)
    {
        playgame();
    }

    private static void playgame()
    {
        final int WINNING_POSITION = 12;
        PairOfDice dice = new PairOfDice();
        RoundaboutPeg playerOnePeg = new RoundaboutPeg("Kellby");
        RoundaboutPeg playerTwoPeg = new RoundaboutPeg("Mark");
        boolean gameContinue = true;

        RoundaboutPeg currentPlayerPeg = playerOnePeg;

        do
        {
            if (currentPlayerPeg == playerOnePeg)
            {
                currentPlayerPeg = playerOnePeg;
                //Player One
                dice.roll();

                if (playerPegCanMoveForward(dice, playerOnePeg))
                {
                    currentPlayerPeg.moveForward();
                    System.out.println(currentPlayerPeg.getName() + " rolled a " + currentPlayerPeg.printPosition() + " with a " + dice.getDieOneValue() + " and a " + dice.getDieTwoValue());
                    if(currentPlayerPeg.getPosition() == playerTwoPeg.getPosition())
                    {
                        playerTwoPeg.resetPosition();
                        System.out.println("\t\t\t\t\t♦♦♦♦♦♦♦♦♦♦♦" + playerTwoPeg.getName() + " got BUMPED ♦♦♦♦♦♦♦♦♦♦♦♦♦");
                    }
                    currentPlayerPeg = playerTwoPeg;

                }
                else
                {
                    currentPlayerPeg = playerTwoPeg;
                }
            }
            else
            {
                //Player Two
                dice.roll();

                if (playerPegCanMoveForward(dice,playerTwoPeg))
                {
                    currentPlayerPeg.moveForward();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t" + currentPlayerPeg.getName() + " rolled a " + currentPlayerPeg.printPosition() + " with a " + dice.getDieOneValue() + " and a " + dice.getDieTwoValue());
                    if(currentPlayerPeg.getPosition() == playerOnePeg.getPosition())
                    {
                        playerOnePeg.resetPosition();
                        System.out.println("\t\t\t\t\t♦♦♦♦♦♦♦♦♦♦♦" + playerOnePeg.getName() + " got BUMPED ♦♦♦♦♦♦♦♦♦♦♦♦♦");

                    }
                    currentPlayerPeg = playerOnePeg;
                }
                else
                {
                    currentPlayerPeg = playerOnePeg;
                }
            }

            if (currentPlayerPeg.getPosition() == WINNING_POSITION)
            {
                gameContinue = false;
                System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("++++++++++++++++++++++ \tRoundabout\t ++++++++++++++++++++++++++");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦" + currentPlayerPeg.getName() + " wins♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
            }
        } while (gameContinue);

    }

    /*private static PlayerPeg togglePlayerPeg(PlayerPeg playerOne, PlayerPeg playerTwo, PlayerPeg currentPlayer)
    {
        PlayerPeg nextPlayer;
        if(currentPlayer == playerOne)
        {
            nextPlayer = playerTwo;
        }
        else
        {
            nextPlayer = playerOne;
        }
        return nextPlayer;
    }*/

    private static boolean playerPegCanMoveForward(PairOfDice dice, RoundaboutPeg peg)
    {
        boolean canMove = false;

        if(peg.getPosition() == 0)
        {
            if(dice.getDieOneValue() == peg.getFirstPosition() || dice.getDieTwoValue() == peg.getFirstPosition() || dice.getDieTotalValue() == peg.getFirstPosition())
            {
                canMove = true;
            }
        }

        else if (dice.getDieOneValue() == peg.getNextPosition() || dice.getDieTwoValue() == peg.getNextPosition() || dice.getDieTotalValue() == peg.getNextPosition())
        {
            canMove = true;
        }

        return canMove;
    }
}
