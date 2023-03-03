import java.util.Scanner;

public class question_five {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] lista_caracteres = string.toCharArray();

        int tamanho = lista_caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = lista_caracteres[i];
            lista_caracteres[i] = lista_caracteres[tamanho - 1 - i];
            lista_caracteres[tamanho - 1 - i] = temp;
        }
        String string_invertida = new String(lista_caracteres);
        System.out.println(string_invertida);
    }
}
