import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long n = scanner.nextLong();
        String symbol = scanner.next();
        long k = scanner.nextLong();
        switch (symbol) {
            case "+":
                System.out.println(n + k);
                break;
                case "-":
                    System.out.println(n - k);
                    break;
                    case "*":
                        System.out.println(n * k);
                        break;
                        case "/":
                            if (k == 0) {
                                System.out.println("Division by 0!");
                                break;
                            }
                            System.out.println(n / k);
                            break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
