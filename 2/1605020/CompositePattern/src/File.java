import java.util.ArrayList;
import java.util.List;

public class File implements Component
{
    String name;
    String type;
    String path;

    Component parent;

    public File(String name)
    {
        this.name = name;

        type = "file";

        parent = null;

        System.out.println("File " + name + " created");
    }

    @Override
    public void list()
    {

//        if (parent.getType().equalsIgnoreCase("folder"))
//        {
//            System.out.print("\t\t....");
//        }
        Component temp = parent;

        while (temp != null)
        {
            System.out.print("\t");
            temp = temp.getParent();
        }

        System.out.print("....");
        System.out.println(name);
        //

    }

    @Override
    public void details()
    {
        System.out.println("\nName : " + name);
        System.out.println("Type : " + type);
        System.out.println("Directory : " + path);
        //System.out.println("Component count :" + componentCount);
    }

    @Override
    public void addComponent(Component component)
    {
        //nothing
    }

    @Override
    public void remove()
    {
        this.getParent().setComponentCount(this.getParent().getComponentCount()-1);

        this.getParent().getChildren().remove(this);

        parent = null;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getType()
    {
        return type;
    }

    @Override
    public void setPath(String path)
    {
        this.path = path + ":\\" + name;
    }

    @Override
    public String getPath()
    {
        return path;
    }

    @Override
    public void setParent(Component component)
    {
        parent = component;
    }

    @Override
    public Component getParent()
    {
        return parent;
    }

    @Override
    public List<Component> getChildren()
    {
        return null;
    }

    @Override
    public void setComponentCount(int count)
    {
        //nothing
    }

    @Override
    public int getComponentCount()
    {
        return 0;
    }

}
