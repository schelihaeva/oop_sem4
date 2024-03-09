package dz_sem4;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса Pair
        Pair<Integer, String> pair = new Pair<>(10, "Hello");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        pair.setFirst(20);
        pair.setSecond("World");
        System.out.println("Updated first element: " + pair.getFirst());
        System.out.println("Updated second element: " + pair.getSecond());

        // Пример использования класса DataContainer
        DataContainer<String> stringContainer = new DataContainer<>();
        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");

        String fruit = stringContainer.get(1);
        System.out.println("Fruit at index 1: " + fruit);

        stringContainer.remove(1);
        System.out.println("Size of container: " + stringContainer.getSize());
    }
}
