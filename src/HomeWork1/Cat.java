package HomeWork1;

public class Cat implements Passable {
    String name;
    private static final int isLongRun = 500;
    private static final int isJump = 200;

    public Cat(String name) {
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
            System.out.println("Кот перепрыгнул");
            return true;
        }else{
            System.out.println("Кот не перепрыгнул");
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if(track.getIsLong() < isLongRun){
            System.out.println("Кот пробежал");
            return true;
        }else {
            System.out.println("Кот не пробежал");
            return false;
        }
    }

    public boolean validateLong(int inLong){
        if (inLong < isLongRun){
            return true;
        }else return false;
    }
}
