import java.util.Scanner;

public class ArrayDemo
{
    public static void printArray(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + "  ");
        }
        System.out.println();
    }

    public static void printArray(String[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + "  ");
        }
        System.out.println();
    }

    public static int arrayTotal(int[] values)
    {
        int total = 0;
        for (int i = 0; i < values.length; i++)
        {
            total = total + values[i];
        }
        return total;
    }

    public static int arrayMax(int[] values)
    {
        int max = 0;

        for (int i = 0; i < values.length; i++)
        {
            if (values[i] > max)
            {
                max = values[i];
            }
        }

        return max;
    }

    public static int arrayMaxIndex(int[] values)
    {
        int index = 0;
        int max = 0;

        for (int i = 0; i < values.length; i++)
        {
            if (values[i] > max)
            {
                max = values[i];
                index = i;
            }
        }

        return index;
    }

    public static double arrayAverage(double[] values)
    {
        double average;
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }
        average = sum / (values.length);
        return average;
    }

    public static void main(String[] args)
    {
        int[] values = new int[3];

        values[0] = 1;
        values[1] = 5;
        values[2] = 9;

        int[] moreValues = new int[5];

        moreValues[0] = 5;
        moreValues[1] = 2;
        moreValues[2] = 9;
        moreValues[3] = 8;
        moreValues[4] = 0;

        int[] newValues = new int[4];

        newValues[0] = 78;
        newValues[1] = 23;
        newValues[2] = 9;
        newValues[3] = 34;

        printArray(values);
        printArray(moreValues);

        int totals;
        totals = arrayTotal(values);
        System.out.println(totals);
        totals = arrayTotal(newValues);
        System.out.println(totals);

        int[] testArray = new int[5];
        testArray[0] = 5;
        testArray[1] = 8;
        testArray[2] = 21;
        testArray[3] = 19;
        testArray[4] = 2;
        int max;
        max = arrayMax(testArray);
        System.out.println(max);
        max = arrayMax(values);
        System.out.println(max);
        max = arrayMax(newValues);
        System.out.println(max);

        int index;
        index = arrayMaxIndex(values);
        System.out.println(index);
        index = arrayMaxIndex(testArray);
        System.out.println(index);
        index = arrayMaxIndex(newValues);
        System.out.println(index);

        double[] doublesArray = new double[4];
        doublesArray[0] = 34.2;
        doublesArray[1] = 18.0;
        doublesArray[2] = 12.5;
        doublesArray[3] = 13.1;

        double[] anotherDoublesArray = new double[3];
        anotherDoublesArray[0] = 10.0;
        anotherDoublesArray[1] = 15.0;
        anotherDoublesArray[2] = 20.0;

        double average;
        average = arrayAverage(doublesArray);
        System.out.println(average);
        average = arrayAverage(anotherDoublesArray);
        System.out.println(average);

        int [] integerArray = new int[10];
        integerArray[0] = 4;
        integerArray[3] = 2;
        integerArray[9] = 4;

        printArray(integerArray);

        String [] stringArray = new String[10];
        stringArray[0] = "Hi";
        stringArray[3] = "Hello";
        stringArray[9] = "Bye";

        printArray(stringArray);
    }
}
