import java.util.Scanner;

public class JavaStdinandStdout1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //scanner.close();

        System.out.println(a);
        System.out.println(b);
    }
}
