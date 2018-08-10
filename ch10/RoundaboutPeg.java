public class RoundaboutPeg
{
    private int position;
    private String name;


    public RoundaboutPeg(String name)
    {
        this.position = 0;
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

    public String printPosition()
    {
        if(position == 1)
        {
            return "5 to START ";
        }
        else
        {
            return ""+position;
        }
    }

    public int getNextPosition()
    {
        return position + 1;
    }

    public int getFirstPosition()
    {
        return 5;
    }

    public void resetPosition()
    {
        this.position = 0;
    }

    public void moveForward()
    {
        this.position++;
    }
}
