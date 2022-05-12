package Homework1;

public class Figure4 {
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("8");
            }
            for (int k = 4; k >i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
