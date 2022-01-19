import java.util.List;

public interface Component
{
    void list();
    void details();

    void addComponent(Component component);
    void remove();
    String getName();
    String getType();
    void setPath(String path);
    String getPath();
    void setParent(Component component);
    Component getParent();
    List<Component> getChildren();

    void setComponentCount(int count);
    int getComponentCount();
}
