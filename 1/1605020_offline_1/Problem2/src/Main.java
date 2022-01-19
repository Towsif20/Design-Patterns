import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ComputerFactory computerFactory = new ComputerFactory();
        ShapeFactory shapeFactory = new ShapeFactory();

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        Computer computer = computerFactory.getComputer(type);
        type = scanner.next();
        Shape shape = shapeFactory.getShape(type);

        Combination combination = new Combination(shape, computer);

        System.out.println(combination);

        type = scanner.next();
        Computer computer2 = computerFactory.getComputer(type);
        type = scanner.next();
        Shape shape2 = shapeFactory.getShape(type);

        Combination combination2 = new Combination(shape2, computer2);

        System.out.println(combination2);


    }
}
