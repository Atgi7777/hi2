package buteelt;
import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    // 1 3:49
    public void addElement(T element) {
        elements.add(element);
    }

    // 2
    public void removeElement(T element) {
        if (elements.contains(element)) {
            elements.remove(element);
            System.out.println("Element removed: " + element);
        } else {
            System.out.println("Element not found: " + element);
        }
    }


    // 3
    public int getSize() {
        return elements.size();
    }

    // 4
    public boolean containsElement(T element) {
    	if (elements.contains(element)) {
    		  return elements.contains(element);
    	}
    	
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

       
        stringList.addElement("Элемент 1");
        stringList.addElement("Элемент 2");
        stringList.addElement("Элемент 33");

       
        System.out.println("Жагсаалтын хэмжээ: " + stringList.getSize());

        
        System.out.println("Элемент 2 шалгах: " + stringList.containsElement("Element 2"));
        System.out.println("Элемент 2 шалгах: " + stringList.containsElement("Element 5"));
        
        System.out.println("индекс 1 ийн элемент: " + stringList.getElementAt(1));

       
        stringList.removeElement("Элемент 1");

        System.out.println(stringList.getSize());
        
        stringList.clearList();

   
        System.out.println("Цэвэрлэсний дараахь жагсаалтын хэмжээ: " + stringList.getSize());
    }
}
