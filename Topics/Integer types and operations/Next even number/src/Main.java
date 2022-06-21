import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        System.out.println(n % 2 == 0 ? n + 2 : n + 1);
    }
}
