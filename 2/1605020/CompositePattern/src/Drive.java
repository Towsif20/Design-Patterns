import java.util.ArrayList;
import java.util.List;

public class Drive implements Component
{
    String name;
    String type;
    String path;

    Component parent;
    int componentCount;

    List<Component> children = new ArrayList<>();

    public Drive(String name)
    {
        this.name = name;

        type = "drive";

        path = name;

        parent = null;

        componentCount = 0;

        System.out.println("Drive " + name + " created");
    }

    public List<Component> getChildren()
    {
        return children;
    }

    @Override
    public void list()
    {
        Component temp = parent;

        if (temp != null)
        {
            while (temp != null)
            {
                System.out.print("\t");
                temp = temp.getParent();
            }

            System.out.print("....");
        }


        System.out.println(name + ":\\");

        int c = children.size();

        for(int i=0;i<c;i++)
        {
            //System.out.print("\t....");
            children.get(i).list();
        }
    }

    @Override
    public void details()
    {
        System.out.println("\nName : " + name);
        System.out.println("Type : " + type);
        System.out.println("Directory : " + path);
        System.out.println("Component count :" + componentCount);
    }

    @Override
    public void addComponent(Component component)
    {
        children.add(component);
        componentCount++;
        component.setParent(this);
        component.setPath(path);
    }

    @Override
    public void remove()
    {
        children.clear();

        componentCount = 0;

        if (parent != null)
        {
            this.getParent().setComponentCount(this.getParent().getComponentCount()-1);

            this.getParent().getChildren().remove(this);
        }



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
        this.path = name;
    }

    @Override
    public String getPath()
    {
        return path;
    }

    @Override
    public void setParent(Component component)
    {
        this.parent = component;
    }

    @Override
    public Component getParent()
    {
        return parent;
    }

    @Override
    public void setComponentCount(int count)
    {
        componentCount = count;
    }

    @Override
    public int getComponentCount()
    {
        return componentCount;
    }
}
