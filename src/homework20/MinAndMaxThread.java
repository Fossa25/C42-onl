package homework20;

import homework15.SetStringUser;

public class MinAndMaxThread extends SetStringUser {
    public static void startTread(int[] arrayUser){
        Thread minThread = new Thread(()->{
            int minNumber = 1000000;
            for (int i = 0; i < arrayUser.length; i++) {
                if (arrayUser[i] < minNumber) {
                    minNumber = arrayUser[i];
                    System.out.println(BLUE + "В данный момент min значение = " + minNumber + RESET);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(GREEN + "Мини. значение в массиве = " + minNumber + RESET);
        });
        Thread maxThread = new Thread(()->{
            int maxNumber = -1000000;
            for (int i = 0; i < arrayUser.length; i++) {
                if (arrayUser[i] > maxNumber) {
                    maxNumber = arrayUser[i];
                    System.out.println(YELLOW + "В данный момент max значение = " +maxNumber + RESET);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(GREEN + "Макси. значение в массиве = " + maxNumber + RESET);
        });
        minThread.start();
        maxThread.start();
    }


}
