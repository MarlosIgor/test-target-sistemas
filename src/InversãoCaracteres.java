import java.util.Scanner;

public class InversãoCaracteres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva algo para ser invertido : ");
        String string = scanner.nextLine();
        char[] lista_caracteres = string.toCharArray();

        int tamanho = lista_caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = lista_caracteres[i];
            lista_caracteres[i] = lista_caracteres[tamanho - 1 - i];
            lista_caracteres[tamanho - 1 - i] = temp;
        }
        String string_invertida = new String(lista_caracteres);
        System.out.println("Resultado : " + string_invertida);
    }
}
// programa que inverta os caracteres de um string