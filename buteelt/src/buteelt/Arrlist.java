package buteelt;

import java.util.Scanner;

public class Arrlist<T> {    
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Arrlist() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        if (size == elements.length) 
            ensureCapacity();
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args){
        Arrlist<BookStore> bookList = new Arrlist<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Номын нэр оруулна уу?");
        String name = scan.nextLine();
        System.out.print("Номын үнэ оруулна уу? ");
        double cost = scan.nextDouble();
        BookStore newBook = new BookStore(name, cost);
        bookList.add(newBook);
        System.out.println("Амжилттай нэмэгдлээ");
        System.out.println("Номын жагсаалт");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).getName() + " - $" + bookList.get(i).getCost());
        }
        System.out.print("Номын индэксийг оруулна уу: ");
        int index = scan.nextInt();
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
            System.out.println("Ном амжилттай устлаа.");
        }
       
        
        
    }
    public static class BookStore  {
        private String name;
        private double cost;
        
        public BookStore(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }

    }
}
