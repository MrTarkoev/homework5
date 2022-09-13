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
        int deliveryDistance = 45;
        if (deliveryDistance <= 20){
            System.out.println(" Потребуется дней: 1 день");
        } else if ( deliveryDistance > 20 &&  deliveryDistance <= 60) {
            System.out.println(" Потребуется дней: 2 дня ");
        } else if ( deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потреубется дней: 3 дня");
        }

        // Условный оператор. Часть 2. Задание 5.
        System.out.println("Условный оператор. Часть 2. Задание 5.");

        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println( " Месяц январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println( " Месяц февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println( " Месяц март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println( " Месяц апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println( " Месяц май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println( " Месяц июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println( " Месяц июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println( " Месяц август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println( " Месяц сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println( " Месяц октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println( " Месяц ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println( " Месяц декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println( " Такого месяца нет ");

        }
    }
}