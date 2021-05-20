package HomeWork3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        String[] arrayWord = new String[]{"Кот", "Собака", "Стул", "Мышь", "Слон", "Стол", "Стул", "Тигр", "Стол", "Лев", "Стул"};
//        word(arrayWord);
//        word2(arrayWord);
//        word3(arrayWord);
        word4(arrayWord);


    }


    public static void word(String array[]){
        String word;
        int count = 0;

        List<String> words = new ArrayList<>(Arrays.asList(array));

        System.out.println(words);

        for (int i = 0; i < array.length ; i++) {
            word = array[i];
            for (int j = 0; j < array.length; j++) {
             if(array[j].equals(word) && (i != j)){
                 words.remove(array[j]);
             }
            }
        }

        System.out.println(words);
        System.out.println("Одинаковых слов было " + count);

    }

    public static void word2(String array[]){
        Set<String> words = new HashSet<>(Arrays.asList(array));
        System.out.println("-----------------------");
        System.out.println(words);

    }

    public static void word3(String array[]){


        int count = 1;
        Map<String, Integer> map = new HashMap<>();



        for (int i = 0; i < array.length ; i++){
            if(map.containsKey(array[i]) == true){
                map.put(array[i], map.get(array[i])+1);
            }else
            map.put(array[i], count);
        }


        System.out.println(map);


    }

    public static void word4(String array[]){


        int count = 1;
        Map<String, Integer> map = new HashMap<>();



        for (int i = 0; i < array.length ; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1); //считает количество и выводит его
        }


        System.out.println(map);


    }
}
