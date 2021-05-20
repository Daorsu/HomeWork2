package HomeWork3v2;

import java.util.*;

public class ListOfAnimal implements Map {
    private Map<String, List<Object>> animalMap;

    public ListOfAnimal(Map<String, List<Object>> animalMap) {
        this.animalMap = animalMap;
    }


    public void addAnimal(String key, Animal value){
        List<Object> animalList = animalMap.get(key);
        if(animalList == null){
            animalList = new ArrayList<>();
            animalMap.put(key, animalList);
        }
        animalList.add(value);
    }

    @Override
    public String toString() {
        return "listOfAnimal{" +
                "animalMap=" + animalMap +
                '}';
    }

    public void info(){
        System.out.println(animalMap);
    }




    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }


}
