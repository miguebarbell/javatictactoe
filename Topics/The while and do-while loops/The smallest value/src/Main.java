import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int res = 2;
        int n = 2;
        long value = scanner.nextLong();
//        boolean continueLooping = false;
        do {
            res = res * n;
            n++;
        } while(res < value);
        System.out.println(n);
    }
}
