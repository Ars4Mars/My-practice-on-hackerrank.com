import javax.swing.*;
import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        int a;
        int x;

        int Operation = 0;

        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a);

        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(x);

        Scanner sc3 = new Scanner(System.in);
        Operation = sc.nextInt();
        if (Operation == 1) {
            System.out.println(a + x);
        }
        if (Operation == 2) {
            System.out.println(a - x);
        }
        if (Operation == 3) {
            System.out.println(a * x);
        }

        if (Operation == 4) {
            System.out.println(a / x);
        }
    }
}
