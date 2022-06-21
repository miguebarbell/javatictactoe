import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int largest = 0;
        int scanned;
        do {
            scanned = scanner.nextInt();
            if (scanned > largest) {
                largest = scanned;
            }
        }
        while (scanned != 0);
        System.out.println(largest);
    }
}
