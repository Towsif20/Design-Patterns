import java.util.ArrayList;
import java.util.List;

public class Folder implements Component
{
    String name;
    String type;
    String path;

    Component parent;
    int componentCount;

    List<Component> children = new ArrayList<>();

    public Folder(String name)
    {
        this.name = name;

        type = "folder";

        parent = null;

        componentCount = 0;

        System.out.println("Folder " + name + " created");
    }

    public List<Component> getChildren()
    {
        return children;
    }

    @Override
    public void list()
    {


        Component temp = parent;

        while (temp != null)
        {
            System.out.print("\t");
            temp = temp.getParent();
        }

        System.out.print("....");
        int c = children.size();

        System.out.println(name);

        for(int i=0;i<c;i++)
        {
//            if (children.get(i).getType().equalsIgnoreCase("folder"))
//                System.out.print("\t\t....");
//
//            if (parent.getType().equalsIgnoreCase("folder"))
//                System.out.print("\t\t....");

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

        for (int i=0;i<children.size();i++)
        {
            children.get(i).remove();
        }

        this.getParent().setComponentCount(this.getParent().getComponentCount()-1);

        this.getParent().getChildren().remove(this);

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
