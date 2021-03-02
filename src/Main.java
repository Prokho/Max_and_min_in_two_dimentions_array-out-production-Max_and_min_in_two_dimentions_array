//\найти сумму максим строки  и сумму мин строки двумерн массива и поменять их местами через случайнфый интегратор заполнениея>
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int [][] arr = new int[4][4];
        for(int i=0; i< arr.length; i++)

        {
            for(int j=0; j < arr.length; j++){

                arr[i][j] = rnd.nextInt(10);}}

        int min = 0;
        int max = 0;
        int sumMin = 0;
        int sumMax = 0;

        for (int j = 0; j < arr.length; j++){
            sumMin += arr[0][j];
        }
            sumMax = sumMin;

        for (int i = 1; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr.length; j++){
                sum += arr[i][j];
            }
            if (sum > sumMax){
                sumMax = sum;
                max = i;
            }
            if (sum < sumMin){
                sumMin = sum;
                min = i;
            }

            System.out.println(sumMax);
            System.out.println(sumMin);
        }

        for (int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }

        System.out.println(min);
        System.out.println(max);

        int [] t = arr [min];
        arr [min] = arr [max];
        arr [max] = t;

        for (int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
