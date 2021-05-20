package HomeWork1;

public interface RobotRun {
    default boolean robotRun(int isLong){

        if (isLong > 0){
            System.out.println("Робот пробежал");
            return true;
        }else {
            System.out.println("Робот не пробежал");
            return false;
        }
    }

}
