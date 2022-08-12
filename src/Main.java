import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c--) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void task2() {
        for (int t = 3; t <= 31; t += 7) {
            System.out.println("Сегодня пятница, " + t + "-е число. Необходимо подготовить отчет!");
        }
    }

    public static void task3() {
        LocalDate localDate = LocalDate.now();
        int b = localDate.getYear() - 200;
        int e = localDate.getYear() + 100;
        for (int i = 0; i < e; i += 79) {
            if (i > b) {
                System.out.println(i);
            }
        }
    }
}