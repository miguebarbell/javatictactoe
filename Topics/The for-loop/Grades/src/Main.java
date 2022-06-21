import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int times = scanner.nextInt();
        int aGrades = 0;
        int bGrades = 0;
        int cGrades = 0;
        int dGrades = 0;
        for (int i = 0; i <= times; i++) {
            String grade = scanner.nextLine();
            if (grade.equals("A")) {
                aGrades++;
            } else if (grade.equals("B")) {
                bGrades++;
            } else if (grade.equals("C")) {
                cGrades++;
            } else if (grade.equals("D")) {
                dGrades++;
            }
        }
        System.out.println(dGrades + " " + cGrades + " " + bGrades + " " + aGrades);
    }
}
