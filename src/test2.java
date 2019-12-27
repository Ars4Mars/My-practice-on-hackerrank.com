import java.util.*;

/**
 * Created by Arsen on 2019
 */

public class test2 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter array length: ");

    Scanner input2 = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter x: ");
    int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
    int x = input2.nextInt();

    List<Integer> SubArray2 = new ArrayList<>(); // Создаём массив int размером в size

     System.out.println("Insert array elements:");
    /*Пройдёмся по всему массиву, заполняя его*/

    for (int i = 0; i < size; i++) {
        SubArray2.add(input.nextInt()); // Заполняем массив элементами, введёнными с клавиатуры
    }

    System.out.print ("Inserted array elements:");
    System.out.println(SubArray2);
    System.out.println(x);
}

}
