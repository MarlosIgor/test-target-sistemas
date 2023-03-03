import java.util.Scanner;

public class question_two {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1;

        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(a == n);
    }
}
// 55 true