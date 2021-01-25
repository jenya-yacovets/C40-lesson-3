import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел для генерции:");
        int count = scanner.nextInt();

        System.out.println("Получите:");
        Random random = new Random();
        for (int i=0; i < count; i++) {
            System.out.println(random.nextInt(20));
        }
    }
}
