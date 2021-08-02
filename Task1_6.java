import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        double x;
        double y;
        boolean result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        x = scanner.nextDouble();
        System.out.println("Введите y:");
        y = scanner.nextDouble();

        result = (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <=0) ? true : false;

        System.out.println(result);
    }
}
