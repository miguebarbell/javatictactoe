import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int value = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        // make the array
        System.out.println(counter);


    }
}
