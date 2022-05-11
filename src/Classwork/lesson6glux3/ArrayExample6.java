package Classwork.lesson6glux3;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

public class ArrayExample6 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int x = i + 1;
            numbers[i] = x;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }

    }
}
