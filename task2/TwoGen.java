package task2;

// Обобщенный класс TwoGen с двумя параметрами типа T и V
class TwoGen<T, V> { //КЛАСС ПРИНИМАЕТ ДВА ПАРАМЕТРа T и V
    T ob1; //аргумент типа Т
    V ob2; //аргумент типа V
    
    // Конструктор класса, принимающий два аргумента типов T и V
    TwoGen(T o1, V o2) {
    ob1 = o1; //создаем поля для типов 1 и 2
    ob2 = o2;
    }
    
    // Метод для отображения типов T и V
    void showTypes() {
    System.out.println("Тип T - это " + ob1.getClass().getName());
    System.out.println("Тип V - это " + ob2.getClass().getName());
    }
    
    // Методы для получения объектов типов T и V
    T getob1() {
    return ob1;
    }
    
    V getob2() {
    return ob2;
    }
    }