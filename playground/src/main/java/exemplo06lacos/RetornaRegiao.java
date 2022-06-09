package exemplo06lacos;

/*
 * Crie um método que recebe o código inteiro da área e retorna a região do estado.
 */

import java.util.Scanner;

public class RetornaRegiao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o DDD referente à sua região: ");
        int numero = entrada.nextInt();
        switch (numero) {
            case 51:
                System.out.println("Região Metropolitana de Porto Alegre!");
                break;
            case 53:
                System.out.println("Pelotas e Região!");
                break;
            case 54:
                System.out.println("Caxias do Sul e Região!");
                break;
            case 55:
                System.out.println("Santa Maria e Região!");
                break;
            default:
                System.out.println("Região não encontrada!");
        }
    }
}
