import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        int t;
        int hours;
        int minutes;
        int seconds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время:");
        t = scanner.nextInt();
        //Разделение на часы, минуты, секунды
        hours = t / 3600;
        minutes = (t - hours * 3600) / 60;
        seconds = t - hours * 3600 - minutes * 60;
        //Вывод результата в необходимом формате
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
