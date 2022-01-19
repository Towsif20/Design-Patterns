public class Square extends Rectangle
{
    public Square(double length)
    {
        super(length, length);
    }

    public double surfaceArea()
    {
        return super.surfaceArea();
    }

    public double perimeter()
    {
        return super.perimeter();
    }

    @Override
    public String toString()
    {
        return "Square{" +
                "length=" + length +
                '}'
                + "\nperimeter : " + perimeter()
                + "\nsurface area : " + surfaceArea();
    }
}
