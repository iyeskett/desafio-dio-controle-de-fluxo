import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } catch (InputMismatchException e) {
            System.out.println("Os parâmetros devem ser numéricos");
        } catch (Exception e) {
            System.out.println("Um erro inesperado ocorreu");
        } finally {
            scanner.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}
