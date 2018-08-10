import java.util.Random;

public class Die
{

    private int value;

    public Die()
    {
        roll();
    }

    public int getValue()
    {
        return value;
    }

    public void roll()
    {
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }
}
