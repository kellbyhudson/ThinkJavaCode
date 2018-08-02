import java.util.Scanner;

public class PetNames
{
    public static void receivePetNames()
    {
        Scanner in = new Scanner(System.in);
        int numPets;
        System.out.println("How many pets do you have?");
        numPets = in.nextInt();
        in.nextLine();

        String[] petsArray = new String[numPets];

        for (int i = 0; i < petsArray.length; i++)
        {
            System.out.println("Pet Name: ");
            petsArray[i] = in.nextLine();
        }

        System.out.println("************");
        System.out.println("*Pets Names*");
        System.out.println("************");

        for (int i = 0; i < petsArray.length; i++)
        {
            System.out.println(petsArray[i]);
        }
    }

    public static void main(String[] args)
    {
        receivePetNames();
    }
}
