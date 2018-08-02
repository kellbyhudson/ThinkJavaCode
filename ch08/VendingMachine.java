import java.util.Scanner;

public class VendingMachine
{
    public static void printMenu(String[] menu)
    {
        int item = 0;
        String s;
        Scanner in = new Scanner(System.in);
        int[] order = new int[3];

        do
        {


            System.out.println("Please select from:");
            for (int i = 0; i < menu.length; i++)
            {
                System.out.println(i + ")\t" + menu[i]);
            }
            System.out.print("Your selection: ");
            item = in.nextInt();
            if (item == 99)
            {
                printSales(menu, order);
                return;
            }

            s = String.valueOf(item);
            if (s.length() > 9)
            {
                return;
            }

            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == '0')
                {
                    order[0]++;
                    item = 0;

                }
                if (s.charAt(i) == '1')
                {
                    order[1]++;
                    item = 1;

                }
                if (s.charAt(i) == '2')
                {
                    order[2]++;
                    item = 2;

                }

            }

            System.out.println();


            System.out.println("Thank you for choosing " + menu[item]);
            System.out.println("Sold so far:");
            for (int i = 0; i < menu.length; i++)
            {
                System.out.println(order[i] + " of\t" + menu[i]);
            }
            System.out.println();
        } while (item < 3);


    }

    public static void printSales(String[] menu, int[] order)
    {
        System.out.println();
        System.out.println("Final Sales Totals:");
        for (int i = 0; i < menu.length; i++)
        {
            System.out.println(order[i] + " of\t" + menu[i]);
        }
        System.out.println("Goodbye!");

    }

    public static void main(String[] args)
    {
        String[] menu = new String[3];
        menu[0] = "Freeze Dried Sushi";
        menu[1] = "Spock\'s Brain Blast";
        menu[2] = "Alien Asparagus";

        printMenu(menu);

    }
}
