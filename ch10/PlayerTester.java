public class PlayerTester
{
    public static void main(String[] args)
    {
        Player player1 = new Player("Kellby");

        System.out.println(player1.getScore());
        player1.increaseScore();
        System.out.println(player1.getScore());
        player1.increaseScore();
        System.out.println(player1.getScore());
        player1.resetScore();
        System.out.println(player1.getScore());

    }
}
