import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    }

    public static void sumArray(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        System.out.println(sum);

    }
}