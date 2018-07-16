import java.util.Scanner;

public class TrafficLight {
    public static int getTime(Colour light) {
        Scanner scanner = new Scanner(System.in);
        int time;
        while (true) {
            System.out.println("Сколько минут горит " + light.name + " свет?");
            if (scanner.hasNextInt()) {
                time = scanner.nextInt();
                scanner.nextLine();
                if (time < 0) {
                    System.out.println("Время должно быть положительным числом");
                } else {
                    break;
                }
            } else {
                System.out.println("Некорректно введены данные");
                scanner.nextLine();
            }
        }
        return time;
    }


    public static void start(int time, Colour light) throws InterruptedException {
        for (int i = time; i > 0; i--) {
            System.out.println(light.name + "  " + time--);
            Thread.sleep(1000);
        }
    }
}
