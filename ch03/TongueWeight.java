import java.util.Scanner;

public class TongueWeight
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a Trailer weight: ");
        double trailer;
        double cargo;
        double tongue;
        double min;
        double max;
        Scanner in = new Scanner(System.in);
        trailer = in.nextDouble();
        System.out.print("\nPlease enter a Cargo weight: ");
        cargo = in.nextDouble();

        tongue = trailer + cargo;
        min = tongue * 0.09;
        max = tongue * 0.15;

        System.out.printf("The minimum Tongue weight is %.2f and the maximum Tongue weight is %.2f.", min, max);
    }
}
