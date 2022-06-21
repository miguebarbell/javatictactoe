import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
