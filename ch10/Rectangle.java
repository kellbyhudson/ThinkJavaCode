public class Rectangle
{
    private int height;
    private int width;

    public Rectangle()
    {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle (int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public Rectangle (Rectangle rectangle)
    {
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getArea()
    {
        return height*width;
    }
    public String toString()
    {
        return "Height: " + this.height + ", Width: " + this.width + ", Area: " + getArea();
    }

    public void doubleSize()
    {
        this.height *= 2;
        this.width *= 2;
    }

    public String isSquare()
    {
        if(height == width)
        {
            return " is a SQUARE ◙";
        }

        else
        {
            return " is a RECTANGLE ◘";
        }
    }
}
