import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {

        Scanner sacaner = new Scanner(System.in);
        System.out.println("Введите целое число:");

        if (sacaner.hasNextInt()) {
            int a = sacaner.nextInt();
            System.out.println(a*a);
        } else {
            System.out.println("Ты ввел не целое число :-(");
            sacaner.next();
        }
    }
}
