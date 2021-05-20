package HomeWork3v2;

public class Animal {
    public static final String className = "Животное";
    public final String name;
    public final int age;

    public Animal(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  String getClassName() {
        return className;
    }

    public void info(){

        System.out.println(className + " по кличке " + name + " , возраст " + age);

    }
}
