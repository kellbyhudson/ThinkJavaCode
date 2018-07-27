import java.util.Scanner;

public class TravelTickets
{
    public static void main(String[] args)
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++Travel Ticket Validation Application++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber;
        System.out.print("Please enter a value: ");
        ticketNumber = scanner.nextInt();
        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber / 10;
        boolean result = (lastDigit == (ticketPrefix % 7));
        if (result)
        {
            System.out.println("\nGood Number");
        }
        else
        {
            System.out.println("\nBad Number");
        }
        //System.out.println(15412 % 7);
        System.out.println("last digit: " + lastDigit);
        System.out.println("ticket prefix: " + ticketPrefix % 7);

    }
}
