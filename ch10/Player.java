public class Player
{
    private String name;
    int score;

    public Player(String name)
    {
        this.name = name;
        this.score = 0;
    }

    public void increaseScore()
    {
        score++;
    }

    public void resetScore()
    {
        score = 0;
    }

    public int getScore()
    {
        return score;
    }
}
