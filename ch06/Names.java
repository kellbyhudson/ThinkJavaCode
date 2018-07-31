public class Names
{
    public static String getMyName()
    {
        return "Cindy";
    }

    public static String getMyFancyName(String decoration)
    {
        return decoration + "Cindy" + decoration;
    }

    public static void main(String[] args)
    {
        String returnValue;
        returnValue = getMyFancyName("!*");
        System.out.println(returnValue);
    }
}
