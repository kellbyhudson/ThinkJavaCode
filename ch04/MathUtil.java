public class MathUtil
{
    public static void printDifference(int first, int second)
    {
        int diff = first - second;
        printAbsValue(diff);
    }

    public static void printAbsValue(int a)
    {
        System.out.println("Value is: " + a + " and abs value is: " + Math.abs(a));
    }
    public static void main(String[] args)
    {
        printDifference(1000,4000000);
    }
}
