import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList= new ArrayList<>();
    public void addGroceryItem(String item){
        myNumbers[5]=4;
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+" items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
}
