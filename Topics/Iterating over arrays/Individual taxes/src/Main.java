import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
//        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
//            result[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
    }
}
