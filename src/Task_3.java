import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер масив:");
        int lengthArray = scanner.nextInt();

        int[] mass = new int[lengthArray];

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(mass));

        System.out.println("Введите искаемый элемент:");

        int searchValue = scanner.nextInt();
        boolean resSearch = false;

        for (int i=0; i<mass.length; i++) {
            if (mass[i] == searchValue) {
                resSearch = true;
                break;
            }
        }

        if (resSearch) {
            System.out.println("В масиве существует такой элемент");
        } else {
            System.out.println("В масиве нет такого элемент");
        }
    }
}
