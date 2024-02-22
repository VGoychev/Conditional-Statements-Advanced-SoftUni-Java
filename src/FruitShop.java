import java.util.Scanner;
//Напишете програма, която чете от конзолата плод
//(banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
//ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
//и количество (десетично число) , въведени от потребителя, и пресмята цената според цените
//от таблиците по-горе. При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".
public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.00;

        switch (fruit) {
            case "banana":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 2.50;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 2.70;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            case "apple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 1.20;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.25;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            case "orange":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 0.85;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 0.90;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            case "grapefruit":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 1.45;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.60;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            case "kiwi":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 2.70;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 3.00;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            case "pineapple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 5.50;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 5.60;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            case "grapes":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 3.85;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 4.20;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", price * quantity);
                break;
            default:
                System.out.println("error");
        }
    }
}
