public class print
{
    public static void printAmerican(int Date, int Year, String Day, String Month)
    {
        String firstline = "American format:";

        String day = Day;
        int date = Date;
        String month = Month;
        int year = Year;

        System.out.println(firstline);
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
    }
    public static void printEuropean(int Date, int Year, String Day, String Month)
    {
        String firstline = "European format:";

        String day = Day;
        int date = Date;
        String month = Month;
        int year = Year;

        System.out.println(firstline);
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);

    }

    public static void main(String[] args)
    {
        printAmerican(22,2015,"Saturday","July");
        printEuropean(22,2015,"Saturday","July");
    }
}
