package task4;

// Обобщенный класс NumericFns, который хранит числовое значение типа T.
class NumericFns<T extends Number> {
    T num;
    
    // Конструктор класса NumericFns, принимающий числовый объект типа T.
    NumericFns(T n) {
    num = n;
    }
    
    // Метод для возврата абсолютного значения  в виде дробного числа.
    double absValue() {
    return Math.abs(num.doubleValue());
    }
    
    // Проверка абсолютного равенства двух объектов NumericFns.
    boolean absEqual(NumericFns<?> ob) { //шаблон аргумента  в обобщениях, сравнение двух аргументов
    return this.absValue() == ob.absValue(); //объект вызывает метод
    }
    }
