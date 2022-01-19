public class Combination
{
    public Shape shape;
    public Computer computer;

    public Combination(Shape shape, Computer computer)
    {
        this.shape = shape;
        this.computer = computer;
    }

    @Override
    public String toString()
    {
        return  shape +
                "\n" + computer ;
    }
}
