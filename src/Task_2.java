import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер масив:");
        int lengthArray = scanner.nextInt();

        int[] mass = new int[lengthArray];

        int countA = 0;
        int maxNumber = 0;
        int indexMax = 0;

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(20);

            if (mass[i] != 0 && mass[i] % 2 == 0) {
                countA++;
            }

            if (mass[i] > maxNumber) {
                maxNumber = mass[i];
                indexMax = i;
            }
        }

        System.out.println(Arrays.toString(mass));

        if (indexMax != mass[mass.length-1]) {
            int oldValue = mass[mass.length-1];
            mass[mass.length-1] = mass[indexMax];
            mass[indexMax] = oldValue;
        }

        System.out.println(Arrays.toString(mass));

        if (countA > mass.length-countA) {
            System.out.println("В масиве больше четных чисел");
        } else if (countA < mass.length-countA) {
            System.out.println("В масиве больше нечетных чисел");
        } else {
            System.out.println("В масиве одинаковое количество четных и не четных чисел");
        }

        System.out.println("Максимальное значение в масиве: " + maxNumber);
    }
}