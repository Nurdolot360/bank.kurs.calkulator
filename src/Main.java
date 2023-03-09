import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        System.out.println();
        switch (soz) {
            case "RUB":
                System.out.print("RUB"+"1.17");
                int ww = scanner.nextInt();
                System.out.println(1.17 * ww);
                break;
            case "USD":
                System.out.println("USD"+"86.77");
                int ss = scanner.nextInt();
                System.out.println(86.77 * ss);
                break;
            case "EUR":
                System.out.println("EUR"+"93,35");
                int ww2 = scanner.nextInt();
                System.out.println(1.17 * ww2);
                break;
            case "KZT":
                System.out.println("KZT"+"0,19");
                int ww3 = scanner.nextInt();
                System.out.println(1.17 * ww3);
                break;
            default:
                System.out.println("oshybka");
        }
        }
    }



