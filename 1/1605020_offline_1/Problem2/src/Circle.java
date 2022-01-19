public class Circle implements Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double surfaceArea()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return Math.PI*radius*2;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "radius=" + radius +
                '}'
                + "\nperimeter : " + perimeter()
                + "\nsurface area : " + surfaceArea();
    }
}
