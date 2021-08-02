import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        a = scanner.nextDouble();;
        System.out.println("Введите b:");
        b = scanner.nextDouble();
        System.out.println("Введите c:");
        c = scanner.nextDouble();

        z = ((a - 3) * b / 2) + c;

        System.out.println(z);
    }
}