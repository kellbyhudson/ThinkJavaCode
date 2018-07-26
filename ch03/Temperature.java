import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double cel;
        double fahr;

        System.out.println("This program will convert Celsius to Fahrenheit. Please enter a Celsius temperature: ");
        cel = in.nextDouble();

        fahr = cel * (9.0 / 5.0) + 32;

        System.out.printf("%.1f C =  %.1f F.", cel, fahr);
    }
}
