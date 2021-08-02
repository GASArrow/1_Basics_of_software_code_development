import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        double r;
        double nnn;
        double ddd;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        r = scanner.nextDouble();
        //Разделение частей
        nnn = (int) r;
        ddd = r - nnn;
        if (ddd < 0){
          ddd++;
          nnn--;
        }
        //Выполнение задачи
        result = ddd * 1000 + nnn / 1000;
        //Вывод результата
        System.out.println(String.format("%.3f", result));
    }
}
