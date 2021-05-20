package HomeWork1;

public interface Run {

    default boolean run(Track track){
        if (track.getIsLong() > 0){
            System.out.println("Пробежал");
            return true;
        }else {
            System.out.println("Не пробежал");
            return false;
        }
    }
}
