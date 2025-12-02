import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero1 = getNumero(scanner);

        System.out.println("Digite outro numero: ");

        int numero2 = getNumero(scanner);

        if (numero1 > numero2) {
        System.out.println("O maior número é: " + numero1);
    }else if (numero1 < numero2) {
        System.out.println("O maior número é: " + numero2);
    }else{
        System.out.println("Os número são iguais!");
    }

    }

    private static int getNumero(Scanner scanner) {
            int numero = scanner.nextInt();
            return numero;
    }

}
