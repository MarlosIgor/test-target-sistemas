import java.util.Scanner;

public class SequênciaFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, a = 0, b = 1, c = 0;
        boolean pertence = false;

        System.out.print("Informe um número: ");
        num = input.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            pertence = true;
        }

        while (c < num) {
            c = a + b;
            a = b;
            b = c;

            if (c == num) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
                pertence = true;
                break;
            }
        }

        if (!pertence) {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        input.close();
    }
}
// O número 55 pertence à sequência de Fibonacci.