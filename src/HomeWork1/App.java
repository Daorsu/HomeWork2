package HomeWork1;

public class App {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        Human human = new Human("Эрик");
        Robot robot = new Robot("RA-128");

        //Препятствия
        Track track = new Track(2000);
        Track track1 = new Track(300);
        Track track2 = new Track(600);

        Wall wall = new Wall(100);
        Wall wall1 = new Wall(300);
        Wall wall2 = new Wall(250);

//        Run runner  = cat;
//        Jump jumper = cat;
//        Run runnerHuman = human;
//        Jump jumperHuman = human;

//        RobotRun robotRun1 = robot;
//
//        robotRun1.robotRun(track.getIsLong());

//        Passable passable = cat;
//        passable.pass(wall);
//

        System.out.println("-------------------------------------");

//        jumperHuman.jump(wall.getIsHeight());
//
//
//        jumper.jump(wall.getIsHeight());
//
//        runner.run(track.getIsLong());
//
//        cat.run(track.getIsLong());
        Passable[] passables = new Passable[]{cat, human};

        Object[] objects = new Object[]{cat, human};
        Object[] obstacles = new Object[]{track, wall, track1, wall1, track2, wall2};

//        ((Run)objects[0]).run(track.getIsLong());
//        ((Jump)objects[0]).jump(wall.getIsHeight());

        for (int i = 0; i < passables.length; i++) {
            for (Object o : obstacles) {
                if(passables[i].pass(o) == false){
                    break;
                }
            }

            }




//        for (int i = 0; i < objects.length; i++) {
//            for (Object o : obstacles){
//                if (o instanceof Track){
//                    if (((Run) objects[i]).run(((Track) o).getIsLong()) == false){
//                        break;
//                    }
//
//                }else if (o instanceof Wall){
//                  if (((Jump)objects[i]).jump(((Wall)o).getIsHeight()) == false){
//                      break;
//                    }
//
//                }
//            }
//
//        }



//        Track[] tracks = new Track[]{track, track1, track2};

//        for (Track t : tracks){
//            if (runner.run(t.getIsLong()) == false){
//                break;
//            }
//        }

    }

}
