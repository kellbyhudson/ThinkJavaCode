public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle ronnie = new Rectangle();
        System.out.println(ronnie.toString());

        Rectangle louis = new Rectangle(3,6);
        System.out.println(louis.toString());

        Rectangle kellby = new Rectangle(louis);
        kellby.doubleSize();
        System.out.println(kellby.toString());


        System.out.println("\n\nRONNIE" + ronnie.isSquare());
        System.out.println("LOUIS" + louis.isSquare());
        System.out.println("KELLBY" + kellby.isSquare());
    }
}
