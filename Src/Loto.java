import java.util.Arrays;
import java.util.Random;

public class Loto {
    public static void main(String[] args) {
        int min = 0;
        int max = 9;
        Integer[] arr = new Integer[7];
        Integer[] arr2 = new Integer[7];
        Random random1 = new Random();
        Random random2 = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random1.nextInt(max-min+1)+min ;
            arr2[i] = random2.nextInt(max-min+1)+min;

        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int coinc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                coinc++;
            }
        }
        System.out.println("Кількість збігів: " + coinc);
    }
}
