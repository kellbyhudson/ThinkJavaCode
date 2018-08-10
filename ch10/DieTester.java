public class DieTester
{
    public static void main(String[] args)
    {
        Die die = new Die();
        System.out.println(die.getValue());
        die.roll();
        System.out.println(die.getValue());

    }
}
