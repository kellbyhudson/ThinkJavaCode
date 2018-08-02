public class Demo
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 10;

        while (i <= 10)
        {
            System.out.println(i + " " + sum);
            i++;
            sum = sum + 10;
        }
        System.out.println("Out of the while loop!");

        i = 1;
        sum = 10;

        System.out.println("Starting the do while loop!");

        do
        {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("Out of the do while loop!");

        for (int j = 1; j <= 10; j++)
        {
            sum += i;
            System.out.println(sum);
        }

        System.out.println("Out of the for loop!");
    }
}
