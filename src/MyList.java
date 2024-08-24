import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private final List<T> arr;

    // Default constructor with initial capacity 10
    public MyList() {
        arr = new ArrayList<>(10); // Use a default initial capacity
    }

    // Constructor with custom initial capacity
    public MyList(int capacity) {
        arr = new ArrayList<>(capacity);
    }

    // Add an element to the list
    public void add(T element) {
        arr.add(element);
    }

    // Get an element at a specific index
    public T get(int index) {
        validateIndex(index);
        return arr.get(index);
    }

    // Remove an element at a specific index
    public void remove(int index) {
        validateIndex(index);
        arr.remove(index);
    }

    // Update an element at a specific index
    public void set(int index, T element) {
        validateIndex(index);
        arr.set(index, element);
    }

    // Get the size of the list
    public int size() {
        return arr.size();
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    // Check if the list contains a specific element
    public boolean contains(T element) {
        return arr.contains(element);
    }

    // Clear all elements from the list
    public void clear() {
        arr.clear();
    }

    // Private method to validate index
    private void validateIndex(int index) {
        if (index < 0 || index >= arr.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arr.size());
        }
    }

    // Return a string representation of the list
    @Override
    public String toString() {
        return arr.toString();
    }

    // Main method for testing

}
