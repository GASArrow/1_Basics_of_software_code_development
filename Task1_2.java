import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        a = scanner.nextDouble();
        System.out.println("Введите b:");
        b = scanner.nextDouble();
        System.out.println("Введите c:");
        c = scanner.nextDouble();

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(result);
    }
}
