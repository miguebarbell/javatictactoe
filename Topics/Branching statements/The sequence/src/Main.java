import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
//        int n = 50;
        int counter = 0;
//        System.out.println(n);
        String res = "";
        for (int i = 0; counter < n; i++) {
            for (int j = 0; j < i; j++) {
//                System.out.println(res.length());
                if (counter >= n) {
                    break;
                }
                res = res + i + " ";
                counter++;
            }
        }
        System.out.println(res);
    }
}
