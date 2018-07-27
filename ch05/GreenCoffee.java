import java.util.Scanner;

public class GreenCoffee
{
    public static void bikeDiscount(int bikeMi)
    {
        if (bikeMi < 21)
            System.out.println("Free Coffee for your commute!");
        else if (bikeMi < 30)
            System.out.println("For your cycling commute you get a 30% discount!");
        else if (bikeMi < 50)
            System.out.println("For your cycling commute you get a 20% discount!");
        else
            System.out.println("You commute too far to qualify for our discount program.");
    }

    public static void busDiscount(int busMi)
    {
        if (busMi < 21)
            System.out.println("Free Coffee for your commute!");
        else if (busMi >= 35 && busMi < 50)
            System.out.println("For your bus commute you get a 50% discount!");
        else if (busMi < 35)
            System.out.println("For your bus commute you get a 30% discount!");
        else
            System.out.println("For your bus commute you get a 20% discount");
    }

    public static void main(String[] args)
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++Green Coffee Growers of Antarctica Discount Application++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        int bikeMiles;
        int busMiles;
        int commuter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press 1 if you Bike, Press 2 if you bus: ");
        commuter = scanner.nextInt();
        if (commuter == 1)
        {
            System.out.println("\nHow many miles do you Bike?");
            bikeMiles = scanner.nextInt();
            bikeDiscount(bikeMiles);
        }
        else if (commuter == 2)
        {
            System.out.println("\nHow many miles do you Bus?");
            busMiles = scanner.nextInt();
            busDiscount(busMiles);
        }
        else
            System.out.println("Get outta here, Gas Guzzler");

    }
}
