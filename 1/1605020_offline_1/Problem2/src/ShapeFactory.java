import java.util.Scanner;

public class ShapeFactory
{
    public Shape getShape(String type)
    {
        if(type.equalsIgnoreCase("circle"))
        {
            Scanner scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
            return new Circle(r);
        }

        if(type.equalsIgnoreCase("rectangle"))
        {
            Scanner scanner = new Scanner(System.in);
            double l = scanner.nextDouble();
            double w = scanner.nextDouble();
            return new Rectangle(l,w);
        }

        if(type.equalsIgnoreCase("square"))
        {
            Scanner scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
            return new Square(r);
        }

        if(type.equalsIgnoreCase("triangle"))
        {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            return new Triangle(a,b,c);
        }

        return null;
    }
}
