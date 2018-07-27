import java.util.Scanner;

public class HiSpeedInternet
{
    public static void upgradeAR(int speed)
    {
        System.out.println("There are no current upgrade promotions being offered in your area.");
    }

    public static void upgradeMO(int speed)
    {
        if (speed < 10)
            System.out.println("You are eligible for a free upgrade to our 20M HSI service.");
        else if (speed < 25 && speed >= 10)
            System.out.println("You are eligible for a free upgrade to our 50M HSI service.");
        else
            System.out.println("There are no current upgrade promotions being offered.");
    }

    public static void upgradeIA(int speed)
    {
        if (speed < 30)
            System.out.println("you are eligible for a free upgrade to our 50M HSI service.");
        else
            System.out.println("There are no current upgrade promotions being offered.");
    }

    public static void main(String[] args)
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++New Madrid Fault Area HSI Company Upgrade Application++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        int speed;
        String residence;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate which state you have service (IA, MO, AR): ");
        residence = scanner.nextLine();
        System.out.println("Please indicate your current HSI speed service: ");
        speed = scanner.nextInt();
        residence = residence.toUpperCase();
        System.out.println(residence);
        if (residence.equals("AR"))
            upgradeAR(speed);
        else if (residence.equals("MO"))
            upgradeMO(speed);
        else if (residence.equals("IA"))
            upgradeIA(speed);
        else
            System.out.println("You do not live in our service area.");
    }
}
