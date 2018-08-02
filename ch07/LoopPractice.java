import java.util.Scanner;

public class LoopPractice
{
    public static void forOneToTen()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Count: " + i);
        }

    }

    public static void whileOneToTen()
    {
        int i = 1;
        while (i <= 10)
        {
            System.out.println("Count: " + i);
            i++;
        }

    }

    public static void doWhileOneToTen()
    {
        int i = 1;
        do
        {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 10);

    }

    public static void forTenToOne()
    {
        for (int i = 10; i >= 1; i--)
        {
            System.out.println("Count: " + i);
        }

    }

    public static void whileTenToOne()
    {
        int i = 10;
        while (i >= 1)
        {
            System.out.println("Count: " + i);
            i--;
        }

    }

    public static void doWhileTenToOne()
    {
        int i = 10;
        do
        {
            System.out.println("Count: " + i);
            i--;
        } while (i >= 1);

    }

    public static void forByTens()
    {
        for (int i = 0; i <= 100; i += 10)
        {
            System.out.println("Count: " + i);
        }

    }

    public static void whileByTens()
    {
        int i = 0;
        while (i <= 100)
        {
            System.out.println("Count: " + i);
            i += 10;
        }

    }

    public static void doWhileByTens()
    {
        int i = 0;
        do
        {
            System.out.println("Count: " + i);
            i += 10;
        } while (i <= 100);

    }

    public static void forSequence()
    {
        for (int i = 100; i >= -100; i -= 8)
        {
            System.out.println("Count: " + i);
        }

    }

    public static void whileSequence()
    {
        int i = 100;
        while (i >= -100)
        {
            System.out.println("Count: " + i);
            i -= 8;
        }

    }

    public static void doWhileSequence()
    {
        int i = 100;
        do
        {
            System.out.println("Count: " + i);
            i -= 8;
        } while (i >= -100);

    }

    public static void printOneToNumber(int num)
    {
        int i = 1;
        while(i <= num)
        {
            System.out.println("Count: " + i);
            i++;
        }
        System.out.println("Finished Counting");
    }

    public static void main(String[] args)
    {
        System.out.println("ForOneToTen");
        forOneToTen();
        System.out.println("ForTenToOne");
        forTenToOne();
        System.out.println("WhileOneToTen");
        whileOneToTen();
        System.out.println("WhileTenToOne");
        whileTenToOne();
        System.out.println("DoWhileOneToTen");
        doWhileOneToTen();
        System.out.println("DoWhileTenToOne");
        doWhileTenToOne();

        System.out.println("forByTens");
        forByTens();
        System.out.println("whileByTens");
        whileByTens();
        System.out.println("doWhileByTens");
        doWhileByTens();

        System.out.println("ForSequence");
        forSequence();
        System.out.println("WhileSequence");
        whileSequence();
        System.out.println("DoWhileSequence");
        doWhileSequence();

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        printOneToNumber(num);

    }
}
