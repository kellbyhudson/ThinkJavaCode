import java.util.Scanner;

public class WholesaleStringCheese
{
    public static void order(int size, int yards)
    {
        int charge = 5;
        if (size == 1)
        {
            charge = charge + 2 * yards;
            if (yards < 50)
                charge += 2 * yards;

            System.out.println("Your order of " + yards + " yards of " + size + " inch string cheese\n" +
                    "will cost you a total of $" + charge);
        }
        else if (size == 2)
        {
            charge = charge + 4 * yards;
            if (yards < 75)
                charge += 2 * yards;

            System.out.println("Your order of " + yards + " yards of " + size + " inch string cheese\n" +
                    "will cost you a total of $" + charge);
        }

        else if (size == 3)
        {
            charge = charge + 6 * yards;
            if (yards < 25)
                charge += 4 * yards;

            System.out.println("Your order of " + yards + " yards of " + size + " inch string cheese\n" +
                    "will cost you a total of $" + charge);
        }


        else
        {
            System.out.println("That order is too crazy, and this is coming from Crazy Ed!!");
        }
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size;
        int yards;
        System.out.println("We offer string cheese in varieties of 1, 2, or 3 inch widths\n" +
                "Please enter a size of cheese: ");
        size = scanner.nextInt();
        System.out.println("Please enter an order by the yards: ");
        yards = scanner.nextInt();

        order(size, yards);
    }
}
