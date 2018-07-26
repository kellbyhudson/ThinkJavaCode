import java.util.Scanner;

public class TongueWeightMethod
{
    public static void printRange(double trailer, double cargo)
    {

        double tongue;
        double min;
        double max;

        tongue = trailer + cargo;
        min = tongue * 0.09;
        max = tongue * 0.15;

        System.out.printf("The minimum Tongue weight is %.2f and the maximum Tongue weight is %.2f.", min, max);
    }
    public static void main(String[] args)
    {
        double trailer;
        double cargo;
        System.out.print("Please enter a Trailer weight: ");
        Scanner in = new Scanner(System.in);
        trailer = in.nextDouble();
        System.out.print("\nPlease enter a Cargo weight: ");
        cargo = in.nextDouble();

        printRange(trailer,cargo);
    }
}
