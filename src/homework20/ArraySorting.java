package homework20;

import java.util.Arrays;

public class ArraySorting {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void sortThread(int[] arr){
        int[] arrInsert = Arrays.copyOf(arr, arr.length);
        int[] arrSelect = Arrays.copyOf(arr, arr.length);
        int[] arrBubble = Arrays.copyOf(arr, arr.length);

        Thread t1 = new Thread(()->{
            System.out.println("Принял " + Arrays.toString(arrInsert) +
                    "\nПрименяю метод вставками\n");
            long st = System.nanoTime();
            insertionSort(arrInsert);
            long end = System.nanoTime();

            System.out.println("Получил вставками " + Arrays.toString(arrInsert) +
                    "\nПо времени вышло " + ((end - st) / 1_000_000.0));
        });
        Thread t2 = new Thread(()->{
            System.out.println("Принял " + Arrays.toString(arrSelect) +
                    "\nПрименяю метод выбором\n");
            long st = System.nanoTime();
            selectionSort(arrSelect);
            long end = System.nanoTime();

            System.out.println("Получил выбором " + Arrays.toString(arrSelect) +
                    "\nПо времени вышло " + ((end - st) / 1_000_000.0));
        });
        Thread t3 = new Thread(()->{
            System.out.println("Принял " + Arrays.toString(arrBubble) +
                    "\nПрименяю метод пузырьком\n");
            long st = System.nanoTime();
            bubbleSort(arrBubble);
            long end = System.nanoTime();

            System.out.println("Получил пузырьком " + Arrays.toString(arrBubble) +
                    "\nПо времени вышло " + ((end - st) / 1_000_000.0));
        });
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nВсе сортировки завершены.");
    }
}
