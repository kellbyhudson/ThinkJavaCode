import java.util.Scanner;

public class ZeroDestiny
{
    public static int youMustEnterZero(int num)
    {
        int count = 0;
        Scanner in = new Scanner(System.in);
        while (num != 0)
        {
            System.out.println("Try Again: ");
            num = in.nextInt();
            count++;
        }
        System.out.println("You entered Zero!");

        return count;
    }

    public static void main(String[] args)
    {
        int number;
        int counter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        counter = youMustEnterZero(number);
        System.out.println("You entered a number other than zero: " + counter);

    }
}
