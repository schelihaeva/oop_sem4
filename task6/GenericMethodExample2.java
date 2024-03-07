package task6;

public class GenericMethodExample2 {
    // Обобщенный метод для вывода любого объекта
public static <T> void print(T item) {
    System.out.println(item);
    }
    
    public static void main(String[] args) {
    // Примеры использования обобщенного метода
    print(5); // Выводит число 5
    print("Hello, world!"); // Выводит строку "Hello, world!"
    print(3.14); // Выводит число 3.14
    }
}
