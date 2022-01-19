public abstract class Computer
{
    String name;

    String resolution;

    String CPU;

    String MMU;

    public String getResolution()
    {
        return resolution;
    }

    @Override
    public String toString()
    {
        return "Computer\n" +
                "name='" + name + '\'' +
                "\nresolution='" + resolution + '\'' +
                "\nCPU='" + CPU + '\'' +
                "\nMMU='" + MMU + '\'' +
                "\n";
    }
}
