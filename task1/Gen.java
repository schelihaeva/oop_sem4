// Обобщенный класс Gen
class Gen<T> { // принмает аргумент Т (ти)
    T ob; //обьявляем переменную типа Т
    
    Gen(T o) {
    ob = o;
    }
    
    T getob() { //возвращает обьект об
    return ob;
    }
    
    void showType() { //возвращает тип обьекта
    System.out.println("Тип T - это " + ob.getClass().getName());
    }
    }