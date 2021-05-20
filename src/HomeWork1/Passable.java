package HomeWork1;

public interface Passable extends Run, Jump {
    default boolean pass(Object object){
        if (object instanceof Wall){
            return jump((Wall)object);

        }else if(object instanceof Track){
            return run((Track)object);

        }else throw new RuntimeException("Иначе нельзя");



    }


}
