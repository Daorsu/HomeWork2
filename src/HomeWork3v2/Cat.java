package HomeWork3v2;

public class Cat extends Animal{
    public static final String className = "Кот";

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.println(className + " по кличке " + name + " , возраст " + age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public  String getClassName() {
        return className;
    }
}
