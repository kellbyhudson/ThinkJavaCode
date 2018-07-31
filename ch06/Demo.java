import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        printGreeting("HELLO");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = in.nextInt();

        System.out.println("Enter another number: ");
        int secondNumber = in.nextInt();

        int total = getTotal(firstNumber, secondNumber);
        System.out.println("The total is " + total);

    }

    public static int getTotal(int num1, int num2)
    {
        int total = num1 + num2;
        return total;
    }

    public static void printTotal(int firstNumber, int secondNumber)
    {
        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }

    public static void printGreeting(String greeting)
    {
        System.out.println("<<<" + greeting + ">>>");
    }
}
