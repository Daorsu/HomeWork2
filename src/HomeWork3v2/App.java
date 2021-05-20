package HomeWork3v2;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        Cat cat1 =  new Cat("Барсик", 6);
        Cat cat2 =  new Cat("Чёрныш", 3);
        Cat cat3 =  new Cat("Рысик", 2);
        Dog dog1 = new Dog("Шароик", 5);
        Dog dog2 = new Dog("Рэкс", 7);



        ListOfAnimal newList1 = new ListOfAnimal(new HashMap<>());

        newList1.addAnimal(String.valueOf(cat1.getClassName()), cat1);
        newList1.addAnimal(String.valueOf(cat3.getClassName()), cat2);
        newList1.addAnimal(String.valueOf(cat2.getClassName()), cat3);
        newList1.addAnimal(String.valueOf(dog1.getClass()), dog1);
        newList1.addAnimal(String.valueOf(dog2.getClass()), dog2);














    }
}
