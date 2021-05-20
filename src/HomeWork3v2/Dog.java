package HomeWork3v2;

public class Dog extends Animal {
    private static final String className = "Собака";
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.println(className + " по кличке " + name + " , возраст " + age);
    }

    @Override
    public  String getClassName() {
        return className;
    }
}
