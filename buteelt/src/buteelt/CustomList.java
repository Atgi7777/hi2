package buteelt;
import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    // 1
    public void addElement(T element) {
        elements.add(element);
    }

    // 2
    public void removeElement(T element) {
        elements.remove(element);
    }

    // 3
    public int getSize() {
        return elements.size();
    }

    // 4
    public boolean containsElement(T element) {
        return elements.contains(element);
    }

    // 5
    public T getElementAt(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null; 
    }

    // 6   3;47
    public void clearList() {
        elements.clear();
    }

    public static void main(String[] args) {
        CustomList<String> stringList = new CustomList<>();

       
        stringList.addElement("Element 1");
        stringList.addElement("Element 2");
        stringList.addElement("Element 33");

       
        System.out.println("Size of the list: " + stringList.getSize());

        
        System.out.println("Contains Element 2: " + stringList.containsElement("Element 2"));

        
        System.out.println("Element at index 1: " + stringList.getElementAt(1));

       
        stringList.removeElement("Element 1");

    
        stringList.clearList();

       
        System.out.println("Size of the list after clearing: " + stringList.getSize());
    }
}
