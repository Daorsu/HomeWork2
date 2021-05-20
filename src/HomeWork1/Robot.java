package HomeWork1;

public class Robot implements RobotRun {
    String name;
    private static final int constClass1 = 1000;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean robotRun(int isLong) {
        return false;
    }

}
