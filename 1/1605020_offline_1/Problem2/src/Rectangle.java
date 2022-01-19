public class Rectangle implements Shape
{
    double length;
    double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter()
    {
        return length*width;
    }

    @Override
    public double surfaceArea()
    {
        return 2*(length + width);
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}'
                + "\nperimeter : " + perimeter()
                + "\nsurface area : " + surfaceArea();
    }
}
