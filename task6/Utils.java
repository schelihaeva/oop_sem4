package task6;

public class Utils {
    // Обобщенный метод для проверки равенства двух объектов
    public <T> boolean isEqual(T obj1, T obj2) {
    return obj1.equals(obj2);
    }
    
    // Обобщенный метод для вывода содержимого массива
    public <T> void printArray(T[] array) {
    for (T item : array) {
    System.out.print(item + " ");
    }
    System.out.println();
    }
    }