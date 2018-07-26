import java.text.DecimalFormat;

public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal = 137;
        double fee;
        int twenties = withdrawal / 20;
        int remainder = withdrawal % 20;
        int tens = remainder / 10;
        remainder = remainder % 10;
        int fives = remainder / 5;
        remainder = remainder % 5;
        int ones = remainder / 1;
        fee = 0.10 * (twenties + tens + fives + ones);

        System.out.print("$20" + "( " + twenties + " )" + ", ");
        System.out.print("$10" + "( " + tens + " )" + ", ");
        System.out.print("$5" + "( " + fives + " )" + ", ");
        System.out.println("$1" + "( " + ones + " )");
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Transaction Fee: " + df.format(fee + 1.00));
    }
}
