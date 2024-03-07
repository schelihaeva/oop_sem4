public class MyClass {
    private int intValue;
    private String stringValue;
    
    // Обобщенный конструктор
    public <T> MyClass(T value) {
    if (value instanceof Integer) {
    this.intValue = (Integer) value;
    } else if (value instanceof String) {
    this.stringValue = (String) value;
    } else {
    throw new IllegalArgumentException("Unsupported type");
    }
    }
    
    // Геттеры и сеттеры для intValue и stringValue
    public int getIntValue() {
    return intValue;
    }
    
    public void setIntValue(int intValue) {
    this.intValue = intValue;
    }
    
    public String getStringValue() {
    return stringValue;
    }