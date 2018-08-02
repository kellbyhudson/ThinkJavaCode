import java.util.Scanner;

public class HigherThanOneThousand
{
    public static int getPastOneThousand(int number)
    {
        int num = number;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (num <= 1000)
        {
            System.out.println("Total: " + num);
            System.out.println("Enter another number: ");
            num = num + scanner.nextInt();
            count++;
        }

        return num;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number;
        int counter;
        System.out.println("Enter a number: ");
        number = in.nextInt();
        counter = getPastOneThousand(number);
        System.out.println("You entered a total of " + counter + " to finally achieve a total greater than 1000");

    }
}
