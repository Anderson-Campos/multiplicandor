import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para verificar a tabuada: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int soma = num * i;
            System.out.println(num + " * " + i + " = " + soma);
        }

    }
}
