/*
Goal: Write a concrete class called Node.

- Extends ListItem class
-
 */


import java.util.List;

public class Node extends ListItem{
    public Node(Object object) {
        super(object);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.rightLink=listItem;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        this.leftLink=listItem;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        return super.getValue().toString().compareTo(listItem.getValue().toString());
    }
}
