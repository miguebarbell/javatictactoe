import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //3
        int k = scanner.nextInt(); //4
        int[][] array = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(array));
        int [][] outputArray = new int[k][n];
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < n; i++) {
                outputArray[j][i] =  array[n - i - 1][j];
            }
        }

        for (int j = 0; j < k; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(outputArray[j][i] + " ");
            }
            System.out.println(" ");
        }
//        System.out.println(Arrays.deepToString(outputArray));
    }
}
