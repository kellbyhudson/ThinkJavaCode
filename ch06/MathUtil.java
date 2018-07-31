public class MathUtil
{
    public static double getCargoVolume(double height, double length, double depth, boolean heavyDuty)
    {
        double thickness = 0.25;
        if (heavyDuty)
            thickness *= 2;
        double volume = (height - 2 * thickness) * (length - 2 * thickness) * (depth - 2 * thickness);
        return volume;
    }

    public static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static int absoluteSum(int first, int second)
    {
        int sum = Math.abs(first) + Math.abs(second);

        return sum;
    }

    public static int absoluteSum(int first, int second, int third)
    {
        int sum = Math.abs(first) + Math.abs(second) + Math.abs(third);

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(getTotal(12, 12));
        System.out.println(getCargoVolume(10.5, 12.5, 15.5, false));
        System.out.println(absoluteSum(12, -12));
        System.out.println(absoluteSum(12, -12, -12));
    }
}
