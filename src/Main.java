public class Main {
    public static void main(String[] args) {


        // Условный оператор. Часть 2. Задание 1.
        System.out.println("Условный оператор. Часть 2. Задание 1.");

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Условный оператор. Часть 2. Задание 2.
        System.out.println("Условный оператор. Часть 2. Задание 2.");

        int clientDeviceYear = 2016;
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Условный оператор. Часть 2. Задание 3.
        System.out.println("Условный оператор. Часть 2. Задание 3.");
        int year = 1900;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.printf(year + " год является високосным");
        } else if (year % 100 > 0) {
            System.out.printf(year + " год не является високосным");
    }
        // Условный оператор. Часть 2. Задание 4.
        System.out.println("Условный оператор. Часть 2. Задание 4.");
    }
}