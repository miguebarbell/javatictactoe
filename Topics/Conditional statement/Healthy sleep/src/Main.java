import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int under = scanner.nextInt();
        int over = scanner.nextInt();
        int doing = scanner.nextInt();
        if (doing >= under && doing <= over) {
            System.out.println("Normal");
        } else if (doing > over) {
            System.out.println("Excess");

        } else {
            System.out.println("Deficiency");
        }

    }
}
