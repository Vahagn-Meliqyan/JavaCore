package Homework2;

public class Array {
    public static void main(String[] args)
    {
        int[] array = {15, 35, 81, 11, 22, 23, 5, 1, 2, 0
        };
 //Տպեք մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
//Տպեք մասիվի ամենամեծ թիվը
        int largest = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[largest]) {
                largest++;
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(array[largest] + " ");
        }
//  Տպեք մասիվի ամենափոքրը թիվը
        int smallest = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest++;
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {


            System.out.println(array[smallest] + "  ");
        }
//Տպեք մասիվի բոլոր զույգ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {


                System.out.print(array[i] + "  ");
            }
        }
        System.out.println();
//Տպեք մասիվի բոլոր կենտ էլեմենտները

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + "  ");
            }
        }
        System.out.println();
//Տպեք զույգերի քանակը


        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }

        }
        System.out.println(even + " ");
 //Տպեք կենտերի քանակը
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
            }

        }
        System.out.println(odd);
 //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];

        }
        double integer = 0;
        for (int i = 0; i < array.length; i++) {
            integer = integer + array[i];

        }
        System.out.println(integer / array.length);
//Տպեք մասիվի էլեմենտների գումարը
        int plus = 0;
        for (int i = 0; i < array.length; i++) {
            plus = plus + array[i];}
        {
                System.out.print(plus);
            }


            }

    }








