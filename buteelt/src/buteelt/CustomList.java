package buteelt;
import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    // Function 1: Add an element to the list
    public void addElement(T element) {
        elements.add(element);
    }

    // Function 2: Remove an element from the list
    public void removeElement(T element) {
        elements.remove(element);
    }

    // Function 3: Get the size of the list
    public int getSize() {
        return elements.size();
    }

    // Function 4: Check if the list contains a specific element
    public boolean containsElement(T element) {
        return elements.contains(element);
    }

    // Function 5: Get an element at a specific index
    public T getElementAt(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null; // Return null if index is out of bounds
    }

    // Function 6: Clear all elements from the list
    public void clearList() {
        elements.clear();
    }

    public static void main(String[] args) {
        CustomList<String> stringList = new CustomList<>();

        // Add elements to the list
        stringList.addElement("Element 1");
        stringList.addElement("Element 2");
        stringList.addElement("Element 3");

        // Print the size of the list
        System.out.println("Size of the list: " + stringList.getSize());

        // Check if the list contains a specific element
        System.out.println("Contains Element 2: " + stringList.containsElement("Element 2"));

        // Get an element at a specific index
        System.out.println("Element at index 1: " + stringList.getElementAt(1));

        // Remove an element from the list
        stringList.removeElement("Element 1");

        // Clear all elements from the list
        stringList.clearList();

        // Print the size of the list after clearing
        System.out.println("Size of the list after clearing: " + stringList.getSize());
    }
}
