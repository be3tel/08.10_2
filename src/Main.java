import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println("введите число. количество попыток: 3");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        if (b == a) {
            System.out.println("verno");
        } else {
            System.out.println("введите число. количество попыток: 2");
            Scanner scane = new Scanner(System.in);
            int c = scane.nextInt();
            if (c == a) {
                System.out.println("verno");
            } else {
                System.out.println("введите число. Последняя попытка");
                Scanner scaner = new Scanner(System.in);
                int d = scaner.nextInt();
                if (d == a) {
                    System.out.println("verno");
                } else
                {
                    System.out.println("Попробуйте снова");
                }
            }
        }
    }
}