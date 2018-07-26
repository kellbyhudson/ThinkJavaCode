public class BigMethodSignature
{
    public static void printSum(int one,int two,int three,int four,int five,
                                int six,int seven, int eight, int nine,int ten)
    {
        System.out.println("The sum of " + one + " " + two + " " + three + " "
                + four + " " + five + " " + six + " " + seven + " " + eight + " "
                + nine + " "  + ten + " is: " + (one+two+three+four+five+six+seven+eight+nine+ten));
    }
    public static void main(String[] args)
    {
        printSum(5,8,6,9,8,4,2,3,6,55);
        printSum(4,8,6,9,7,1,2,3,6,5);
    }
}
