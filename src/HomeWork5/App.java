package HomeWork5;

public class App {



    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];




        Arr(arr);

        try {
            ArrayCopy(arr, size, h);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }






    public static void Arr(float[] arr){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = System.currentTimeMillis();
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = 1;
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(System.currentTimeMillis() - a + " первый массив");
            }
        });
        thread.start();

    }




    public static void ArrayCopy(float[] arr, int size, int h) throws InterruptedException {
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println(System.currentTimeMillis() - a + " Разделили 2 массив на два");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = System.currentTimeMillis();
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = 1;
                    a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(System.currentTimeMillis() - a + " Первая часть массива");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = System.currentTimeMillis();
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = 1;
                    a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(System.currentTimeMillis() - a + " Вторая часть массива");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = System.currentTimeMillis();
                System.arraycopy(a1, 0, arr, 0, h);
                System.arraycopy(a2, 0, arr, h, h);
                System.out.println(System.currentTimeMillis() - a + " Склейка массива");
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();


    }


}
