public class Media
{
    String name;
    String type;
    double duration;

    public Media(String name, String type, double duration)
    {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getDuration()
    {
        return duration;
    }

    public void setDuration(double duration)
    {
        this.duration = duration;
    }

    @Override
    public String toString()
    {
        return "name : " + name +
                "\type : " + type +
                "\tduration : " + duration + "\n" ;
    }
}
