import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Please write n: ");
        int n = input.nextInt();

        for (int i = 1; i!=11 ; i++) {
            int result = i *n;
            System.out.println(n + " x " + i + " = " +result );
        }
    }
}
