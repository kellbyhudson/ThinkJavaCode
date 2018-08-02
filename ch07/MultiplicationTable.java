import java.util.Formatter;

public class MultiplicationTable
{
    public static void table(int max)
    {
        System.out.print("\t"); //Header numbers
        for (int start = 1; start <= max; start++)
        {
            System.out.print("\t" + start); // Header numbers
        }
        System.out.println();
        System.out.print("\t "); // header lines
        for (int start = 1; start <= max; start++)
        {
            System.out.print("-----"); // header lines
        }
        System.out.println();
        for (int outer = 1; outer <= max; outer++)
        {
            System.out.print(outer + "\t" + " | ");
            for (int inner = 1; inner <= max; inner++)
            {
                System.out.print("\t" + outer * inner);

            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        table(20);

    }
}
