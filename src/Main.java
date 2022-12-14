import java.util.Scanner;
import java.time.LocalDate;

public class Main {


    public static void printLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        boolean years = ((year > 1584 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        if (years) {
            System.out.println("Этот год " + year + " високосный ");

        }else
        System.out.println("Этот год " + year + "  не високосный ");
        System.out.println(" ");
    }

    public static String printOS() {
        Scanner scanner = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        String system = "0";
        String otherOS = "1";
        System.out.println("Enter your OS");
        String OS = scanner.next();
        System.out.println("Enter your client OS");
        int clientOS = scanner.nextInt();
        System.out.println("Enter your device year");
        int deviceYear = scanner.nextInt();
        if (clientOS == 0 && deviceYear ==currentYear ) {
            System.out.print("Для " + OS + " установите версию приложения по ссылке ");
        } else if (clientOS == 0 && deviceYear < currentYear) {
            System.out.print("Для " + OS + " установите облегченную версию приложения по ссылке ");
        } else if (clientOS == 1 && deviceYear == currentYear) {
            System.out.print("Для " + OS + " установите версию приложения по ссылке ");
        } else if (clientOS == 1 && deviceYear < currentYear) {
            System.out.print("Для " + OS + " установите облегченную версию приложения по ссылке ");
        } else if (clientOS > 2  ) {
            throw new RuntimeException("Нет такой ОС ");
        } else if (currentYear<deviceYear) {
            throw new RuntimeException("Телефона с выпуском больше чем " + currentYear + " еще нет");
        }
        System.out.println("\n");
        return system;
    }

    public static void distanceDelivery(){
        Scanner scanner = new Scanner(System.in);
        int day = 1;
        System.out.println("Enter delivery distance");
        int deliveryDistance = scanner.nextInt();
        if(deliveryDistance > 100 ) {
            System.out.print("К сожалению доставка на такое расстояние не осуществляется");
        }else if(deliveryDistance <=20) {
            day = day;
            System.out.print("Потребуется дней : " + day);
        } else if (deliveryDistance >=20 && deliveryDistance <= 60 ) {
            day++;
            System.out.print("Потребуется дней : " + day);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day+=2;
            System.out.print("Потребуется дней : " + day);
        }
        System.out.println("\n");
    }






    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задание №1");
    printLeapYear();
}


    public static void task2() {
        System.out.println("Задание №2");
        printOS();
    }
    public static void task3(){
        System.out.println("Задание №3");
        distanceDelivery();
    }  
}











