import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String form = scanner.nextLine();
        switch (form) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a+b+c)/2;
                System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                System.out.println(d * e);
                break;
            default:
                double r = scanner.nextDouble();
                System.out.println(r * r * 3.14);
                break;
        }
    }
}
