import java.util.Scanner;

public class ConvertTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        int input;

        System.out.println("Please enter a value of seconds: ");
        input = in.nextInt();

        seconds = input;
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(input + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
