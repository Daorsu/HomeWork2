package HomeWork2;

import java.util.Arrays;

public class MyApp {

    public static void main(String[] args) throws Exception {
        int a = 4;
        int b = 4;
        String[][] arrayS = new String[][]{{"1","6","4","6"},{"1","2","4","6"},{"1","2","4","6"},{"1","4","h","6"}};
//        arrayEx(a,b);
//

        int[][] array = new int[a][b];
//        if(array[a][b] != array[4][4]){
//            throw new MyArraySizeException("Прога сломалась ");
//        }

//        if (a != 4 || b != 4) {
//            throw new Exception("Прога сломалась ");
//        }


        try {
             myArray(arrayS);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }

//    public static void arrayEx(int a, int b)throws Exception{
//        if (a != 4 || b != 4) {
//            throw new Exception("Прога сломалась ");
//        }
//    }
    public static void myArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int a = 0;

        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException("Нам п****");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    a += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException ex){
                    //System.out.println("В матрице должны быть только числа" + " в " + caunt + " ячейке буква" + array[i][j]);
                    throw new MyArrayDataException("В матрице должны быть только числа" + " в ячейке " + i  + j + " лежит " + array[i][j]);
                }
            }
        }
        System.out.println(a);
    }
}
