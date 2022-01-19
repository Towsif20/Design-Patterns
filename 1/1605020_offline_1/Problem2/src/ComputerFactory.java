public class ComputerFactory
{
    public Computer getComputer(String type)
    {
        if(type.equalsIgnoreCase("a"))
        {
            return new ComputerA();
        }

        if(type.equalsIgnoreCase("b"))
        {
            return new ComputerB();
        }

        if(type.equalsIgnoreCase("c"))
        {
            return new ComputerC();
        }

        return null;
    }
}
