import java.util.*;

/**
 * Created by Arsen on 2019
 *
 * We have array myArrayList and we must find SubArray in the mother array, which SebArray must equal or more X number.
 *
 */

public class Combine {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length and after enter X: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        int x = input.nextInt();
        ArrayList<Integer> myArrayList = new ArrayList<>();
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/

        for (int i = 0; i < size; i++) {
            myArrayList.add(input.nextInt()); // Заполняем массив элементами, введёнными с клавиатуры
        }
        //Scanner input2 = new Scanner(System.in); // Объявляем Scanner


        //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        //int x = input2.nextInt();

//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        myArrayList.add(100);
//        myArrayList.add(1);
//        myArrayList.add(200);
//        myArrayList.add(1);
//        myArrayList.add(100);
        //or

//        myArrayList.add(1);
//        myArrayList.add(2);
//        myArrayList.add(1);
//        myArrayList.add(2);
//        myArrayList.add(1);

        List<Integer> SubArray = new ArrayList<>();// Attention hmmm..
        int maximum = Collections.max(myArrayList);

//        for (int i = 0; i < myArrayList.size(); i++) {
//            sum2 += myArrayList.get(i);
//
//        }

//        if (sum2 <0)
//        {
//            System.out.print("The answer is -1");
//        }
         if (maximum > x)
        {
            if (maximum >0) {
                System.out.print("The answer is 1");
            }
            if (maximum <0) {
                System.out.print("The answer is -1");
            }
        }
//        else if (sum2 < x)
//        {
//            System.out.println("The answer is -1");
//            System.out.println("X is " + x);
//        }
        else {
            if (maximum<0) {
                System.out.println("The answer is -1*");
            }else {

                for (int sum = 0; sum < x; ) {

                    SubArray.add(Collections.max(myArrayList));
                    myArrayList.remove(Collections.max(myArrayList));

                    for (int i = 0; i < SubArray.size(); i++) {
                        sum += SubArray.get(i);

                    }
                    //System.out.print(sum);
                    //count++;
                    //counter++;
                }

                int module = SubArray.size() + 1;
                //System.out.println(myArrayList.size());
                System.out.println("answer is " + module);
                System.out.println("X is " + x);
            }
        }
    }
}
