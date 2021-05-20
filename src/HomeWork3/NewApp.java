package HomeWork3;

import java.util.HashMap;

public class NewApp {

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook(new HashMap<>());
        pb.addBook("Вася", 432432423L);
        pb.addBook("Петя", 654363456L);
        pb.addBook("Дима", 765765765L);
        pb.addBook("Рома", 876586547L);
        pb.addBook("Вася", 345345345L);
        pb.addBook("Пупа", 867574564L);







        pb.getBook(pb);
        pb.getBookV2("Вася");



    }
}
