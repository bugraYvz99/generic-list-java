public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        System.out.println("List: " + myList); // Output: [Hello, World, !]
        System.out.println("Size: " + myList.size()); // Output: 3

        // Test get and set
        System.out.println("Element at index 1: " + myList.get(1)); // Output: World
        myList.set(1, "Java");
        System.out.println("Updated List: " + myList); // Output: [Hello, Java, !]

        // Test remove
        myList.remove(2);
        System.out.println("List after removal: " + myList); // Output: [Hello, Java]

        // Test clear
        myList.clear();
        System.out.println("List after clear: " + myList); // Output: []
    }
}