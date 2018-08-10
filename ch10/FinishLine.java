public class FinishLine
{
    public static void main(String[] args)
    {
        playgame();
    }

    private static void playgame()
    {
        final int WINNING_POSITION = 10;
        PairOfDice dice = new PairOfDice();
        PlayerPeg playerOnePeg = new PlayerPeg("Kellby");
        PlayerPeg playerTwoPeg = new PlayerPeg("Mark");
        boolean gameContinue = true;

        PlayerPeg currentPlayerPeg = playerOnePeg;

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
                    System.out.println(currentPlayerPeg.getName() + " rolled a " + currentPlayerPeg.getPosition() + " with a " + dice.getDieOneValue() + " and a " + dice.getDieTwoValue());
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
                    System.out.println("\t\t\t\t\t\t\t\t\t\t" + currentPlayerPeg.getName() + " rolled a " + currentPlayerPeg.getPosition() + " with a " + dice.getDieOneValue() + " and a " + dice.getDieTwoValue());
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
                System.out.println("++++++++++++++++++++++ Finish\t\tLine ++++++++++++++++++++++++++");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("\n" + currentPlayerPeg.getName() + " wins");
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

    private static boolean playerPegCanMoveForward(PairOfDice dice, PlayerPeg peg)
    {
        boolean canMove = false;

        if (dice.getDieOneValue() == peg.getNextPosition() || dice.getDieTwoValue() == peg.getNextPosition() || dice.getDieTotalValue() == peg.getNextPosition())
        {
            canMove = true;
        }

        return canMove;
    }
}
