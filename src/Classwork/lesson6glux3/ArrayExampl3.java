package Classwork.lesson6glux3;

public class ArrayExampl3 {
    public static void main(String[] args) {

        int[] numbers = new int[9];

        numbers[0] = 86;
        numbers[3] = 56;
        numbers[2] = 98;

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + "  ");
        }
    }
}
