import java.util.Scanner;

public class ReverseTemp
{
    public static void printFahrenheit(double c)
    {
        double f;

        f = c * (9.0 / 5.0) + 32;

        System.out.printf("%.1f C =  %.1f F.", c, f);

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double c;
        System.out.println("This program will convert Celsius to Fahrenheit. Please enter a Celsius temperature: ");
        c = in.nextDouble();
        printFahrenheit(c);
    }

}
