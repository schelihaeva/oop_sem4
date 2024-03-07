package task6;

public class GenericMethodExample {

    // Обобщенный метод для обмена местами двух элементов в массиве
    public static <T> void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
    
    public static void main(String[] args) {
    // Пример использования обобщенного метода
    Integer[] intArray = {1, 2, 3, 4, 5};
    System.out.println("Before swap:");
    printArray(intArray);
    
    // Обмен местами элементов с индексами 0 и 4
    swap(intArray, 0, 4);
    
    System.out.println("After swap:");
    printArray(intArray);
    }
    
    // Вспомогательный метод для печати массива
    public static <T> void printArray(T[] array) {
    for (T element : array) {
    System.out.print(element + " ");
    }
    System.out.println();
    }
    }
