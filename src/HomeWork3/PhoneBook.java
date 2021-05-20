package HomeWork3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PhoneBook {


    private Map<String, List<Long>> myClassListMap;

    public PhoneBook(Map<String, List<Long>> myClassListMap) {
        this.myClassListMap = myClassListMap;
    }

    public void createMap(){

    }


    public void addBook(String key, Long value) {
        List<Long> numbersList = myClassListMap.get(key);
        if(numbersList == null) {
            numbersList = new ArrayList<Long>();
            myClassListMap.put(key,numbersList);
        }
        numbersList.add(value);
    }

    public void getBook(PhoneBook pb){

        System.out.println();

    }

    public void getBookV2(String key){
        System.out.println(myClassListMap.get(key));
    }


    @Override
    public String toString() {
        return "PhoneBook{" +
                "myClassListMap=" + myClassListMap +
                '}';
    }
}
