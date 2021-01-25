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
    }
}
