import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
//        int[] result = new int[n];
        System.out.print(array[n - 1] + " ");
        for (int i = 0; i < n - 1; i++) {
//            result[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
    }
}
