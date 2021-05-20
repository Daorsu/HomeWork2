package HomeWork1;

public interface Jump {
     default boolean jump(Wall wall){
         if (wall.getIsHeight() > 0){
             System.out.println("Перепрыгнул");
             return true;
         }else {
             System.out.println("Не перепрыгнул");
             return false;
         }
    }
}
