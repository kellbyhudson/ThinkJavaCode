import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BingoNumbers
{
    private Set<Integer> bingoNumbers  = new HashSet<>();

    public static void main(String[] args)
    {
        BingoNumbers bingoNumber = new BingoNumbers();
        bingoNumber.run();
    }

    private void run()
    {
        boolean end = false;
        do
        {
            System.out.println("☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼");
            System.out.println("  Please enter one of the following commands:");
            System.out.println("• Call <1-75>");
            System.out.println("• Called");
            System.out.println("• Verify <1-75>");
            System.out.println("• Challenge <1-75>");
            System.out.println("• Togo");
            System.out.println("• Bingo");
            System.out.println("☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼");

            Scanner in = new Scanner(System.in);
            String commandLine = in.nextLine();
            String[] words = commandLine.split(" ");

            if (words.length == 2)
            {
                try
                {
                    int number = Integer.parseInt(words[1]);
                    String command = words[0];
                    command = command.toUpperCase();

                    switch (command)
                    {
                        case "CALL":
                            call(number);
                            break;
                        case "VERIFY":
                            verify(number);
                            break;
                        case "CHALLENGE":
                            challenge(number);
                            break;

                    }


                } catch (Exception e)
                {
                    System.out.println("Please enter a number after your text command.\n");
                }
            }
            else
            {
                String command = words[0];
                command = command.toUpperCase();
                switch (command)
                {
                    case "CALL":
                    case "" :
                        call();
                        break;
                    case "CALLED":
                        called();
                        break;
                    case "TOGO":
                        togo();
                        break;
                    case "BINGO":
                        bingo();
                        end = true;
                        break;
                }
            }

        } while (!end);

    }

    private void call(int number)
    {
        String col = " ";
        if (number > 0 && number < 16)
        {
            col = "B";
        }
        else if (number > 15 && number < 31)
        {
            col = "I";

        }
        else if (number > 30 && number < 46)
        {
            col = "N";

        }
        else if (number > 45 && number < 61)
        {
            col = "G";

        }
        else if (number > 60 && number < 76)
        {
            col = "O";

        }
        if (number > 0 && number < 76)
        {
            if (bingoNumbers.add(number))
            {
                System.out.println("\t\t\tAdded <" + col + number + ">\n");
            }
            else
            {
                System.out.println("\t\t\tAlready Called!\n");
            }
        }
    }

    private void call()
    {
        Random random = new Random();
        int call = random.nextInt(75) + 1;

        String col = " ";
        if (call > 0 && call < 16)
        {
            col = "B";
        }
        else if (call > 15 && call < 31)
        {
            col = "I";

        }
        else if (call > 30 && call < 46)
        {
            col = "N";

        }
        else if (call > 45 && call < 61)
        {
            col = "G";

        }
        else if (call > 60 && call < 76)
        {
            col = "O";

        }

        if (bingoNumbers.add(call))
        {
            System.out.println("\t\t\tAdded <" + col + call + ">\n");
        }
        else
        {
            System.out.println("\t\t\tAlready Called!\n");
        }

    }

    private void called()
    {
        for(int number: bingoNumbers)
        {
            String col = " ";
            if (number > 0 && number < 16)
            {
                col = "B";
            }
            else if (number > 15 && number < 31)
            {
                col = "I";

            }
            else if (number > 30 && number < 46)
            {
                col = "N";

            }
            else if (number > 45 && number < 61)
            {
                col = "G";

            }
            else if (number > 60 && number < 76)
            {
                col = "O";

            }
            System.out.print(col+number + ",  ");
        }
        System.out.println();
        System.out.println();
    }

    private void verify(int number)
    {
        if (number > 0 && number < 76)
        {
            if (bingoNumbers.contains(number))
            {
                System.out.println("Already Called\n");
            }
            else
            {
                System.out.println("Not Called Yet\n");
            }
        }
    }

    private void challenge(int number)
    {
        if (number > 0 && number < 76)
        {
            if (bingoNumbers.remove(number))
            {
                System.out.println("Removed\n");
            }
            else
            {
                System.out.println("Not Called\n");
            }
        }
    }

    private void bingo()
    {
        if (bingoNumbers.size() >= 4)
        {
            System.out.println("Congratulations, you win a fruit cake!\n");
            bingoNumbers.clear();
        }
        else
        {
            System.out.println("Cheater!\n");
        }
    }

    private void togo()
    {
        Set<Integer> compareSet = new HashSet<>();
        for (int i = 1; i < 76; i++)
        {
            compareSet.add(i);
        }

        compareSet.removeAll(bingoNumbers);

        System.out.println(compareSet);
    }
}
