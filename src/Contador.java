import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroParametro, segundoParametro;

        do {
            try {
                System.out.print("Digite o primeiro parâmetro: ");
                primeiroParametro = scanner.nextInt();

                System.out.print("Digite o segundo parâmetro: ");
                segundoParametro = scanner.nextInt();

                if (primeiroParametro >= segundoParametro) {
                    throw new ParametrosInvalidosException();
                } else {
                    contar(primeiroParametro, segundoParametro);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números inteiros!");
                scanner.nextLine(); 
            } catch (ParametrosInvalidosException e) {
                System.err.println(e.getMessage());
            }
        } while (true); 

        scanner.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        int contagem = segundoParametro - primeiroParametro;

        for (int index = 1; index < (contagem + 1); index++) {
            System.out.println(String.format("Imprimindo o número %d", index));
        }
        System.out.println(String.format("%d - %d = %d", segundoParametro, primeiroParametro, contagem));
    }
}
