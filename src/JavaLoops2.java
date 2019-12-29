import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length and after enter X: ");
//        String aa = input.nextLine();
//        String bb = input.nextLine();
//        String nn = input.nextLine();


        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
//        Integer a = Integer.valueOf(aa);
//        Integer b = Integer.valueOf(bb);
//        Integer n = Integer.valueOf(nn);
        int f = 1;
        int g = 0;
        int r = 0;



        for (int i = 0; i!=n ; i++) {
//            int result = i *n;
//            System.out.println(n + " x " + i + " = " +result );
            int s = (int) Math.pow(2,i);
            g = s*b+r;

            r = g;
            System.out.print(a+g);
            System.out.print(" ");

        }
        //int result = a+g;
        System.out.println();
    }
}
