package HomeWork1;

public class Human implements Passable {
    String name;
    private static final int isLongRun = 400;
    private static final int isJump = 300;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(Wall wall) {
        if (isJump > wall.getIsHeight()) {
            System.out.println("Человек перепрыгнул");
            return true;
        }else{
            System.out.println("Человек не перепрыгнул");
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if(track.getIsLong() < isLongRun){
            System.out.println("Человек пробежал");
            return true;
        }else {
            System.out.println("Человек не пробежал");
            return false;
        }
    }


}
