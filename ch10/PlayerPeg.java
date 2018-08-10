public class PlayerPeg
{
    private int position;
    private String name;


    public PlayerPeg(String name)
    {
        this.position = 1;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getPosition()
    {
        return position;
    }

    public int getNextPosition()
    {
        return position + 1;
    }

    public void moveForward()
    {
        this.position++;
    }
}
