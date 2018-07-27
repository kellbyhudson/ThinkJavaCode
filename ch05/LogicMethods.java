public class LogicMethods
{
    public static void printIsLarge(int number)
    {
        if (number > 99)
            System.out.println("The number is large");
    }

    public static void printsIsLargeOrSmall(int number)
    {
        if (number > 99)
            System.out.println("The number is large");
        if (number < 10)
            System.out.println("The number is small");
    }

    public static void printLargest(int number1, int number2)
    {
        System.out.println("The largest number is: " + Math.max(number1, number2));
        if (number1 == number2)
            System.out.println("The numbers are equal");
    }

    public static void printLargestOdd(int number1, int number2)
    {
        if (number1 == Math.max(number1, number2) && number1 % 2 == 1)
            System.out.println("The largest odd number is: " + number1);
        else if (number2 == Math.max(number1, number2) && number2 % 2 == 1)
            System.out.println("The largest odd number is: " + number2);
        else if (Math.min(number1, number2) % 2 == 1)
            System.out.println("The largest odd number is: " + Math.min(number1, number2));
        if ((number1 % 2 != 1) && (number2 % 2 != 1))
            System.out.println("Neither number is odd");
        else if (number1 % 2 == 1 && number2 % 2 == 1)
            System.out.println("Two odds make an even");
    }

    public static void main(String[] args)
    {
        printLargestOdd(71, 72);
    }
}
