import java.util.Random;
import java.util.Scanner;
public class Employee
{
    public static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    public static void printFullName(String first, String middle, String last)
    {
        System.out.println(last + ", " + first + "  " + middle);
    }

    public static void printUnionStatus(boolean unionStatus)
    {
        System.out.println("Your union status is: " + unionStatus);
    }

    public static void printAge(int birthYear)
    {
        int currentYear = 2018;
        System.out.println("Your age is: " + (currentYear - birthYear));
    }

    public static void printEvenOrOdd(int value)
    {
        System.out.println("Employee number is even/odd (1=odd, 0=even): " + (value % 2));
    }

    public static void printGeneratedSecretPassword(int value)
    {
        Random random = new Random();
        int number = random.nextInt(10)+1;
        number += value;
        System.out.println("Employee's random secret pw is: " + (number * 5));
    }
    public static void main(String[] args)
    {
        int birthYear = 1999;
        boolean isUnionMember = false;
        String firstName = "Kellby";
        String middleName = "Danniel";
        String lastName = "Hudson";
        int employeeNumber;
        Scanner scanner = new Scanner(System.in);

        printHeader();
        System.out.println("Please enter your 5 digit employee number: ");
        employeeNumber = scanner.nextInt();

        printFullName(firstName, middleName, lastName);
        printUnionStatus(isUnionMember);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGeneratedSecretPassword(employeeNumber);
    }
}
