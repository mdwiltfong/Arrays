import org.w3c.dom.Node;

public interface NodeList {
    public ListItem getRoot();
    public boolean addItem(ListItem listItem);
    public boolean removeItem(ListItem listItem);
    public void traverse(ListItem root);



}
