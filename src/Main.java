import java.time.LocalDate;

public class Main {

    public static void identifyALeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void getClientOS(int nameOS, int year) {
        int currentYear = LocalDate.now().getYear();

        if (nameOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (nameOS == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (nameOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (nameOS == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    public static int days(int distance) {
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int currentYear = 2021;
        identifyALeapYear(currentYear);
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2023;
        getClientOS(clientOS, clientDeviceYear);
    }


    public static void task3() {
        int deliveryDistance = 95;
        int deliveryDays = days(deliveryDistance);
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}