import java.util.List;

/*
Goal: Write and implement an interface with the followings specs.
- Two methods:
    1. write(), takes no arguments and returns a list containing objects of type String.
    2. read(), takes a List of type String and doesn't return anything.
 */
public interface ISaveable {
    public List<String> write();
    public void read(List<String> listItem);
}
