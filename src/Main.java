import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task8();
    }

    private static void task1() {
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

    private static void task2() {
        for (int t = 3; t <= 31; t += 7) {
            System.out.println("Сегодня пятница, " + t + "-е число. Необходимо подготовить отчет!");
        }
    }

    private static void task3() {
        LocalDate localDate = LocalDate.now();
        int b = localDate.getYear() - 200;
        int e = localDate.getYear() + 100;
        for (int i = 0; i < e; i += 79) {
            if (i > b) {
                System.out.println(i);
            }
        }
    }

    private static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
                continue;
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
                continue;
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
                continue;
            }
            System.out.println(i + ":");
        }
    }

    private static void task5() {
//      for (int a = 0, b = 1; a < 50; a = a + b, b = a + b) {
//          System.out.print(a + " " + b + " ");
//        }
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int n = a + b;
            a = b;
            b = n;
        }
        System.out.println();
    }

    private static void task8() {
        int a = 379;
        int b = (a % 100) / 10;
        System.out.println("Если a равно " + a + ", то b равно " + b);
    }
}