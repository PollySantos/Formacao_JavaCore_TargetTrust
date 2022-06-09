package exemplo06lacos;

/*
 * Crie um método que recebe o código inteiro da área e retorna qual é o estado correspondente.
 */

import java.util.Scanner;

public class RetornaEstado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o DDD referente ao seu Estado: ");
        int numero = entrada.nextInt();
        switch (numero) {
            case 48:
                System.out.println("Santa Catarina");
                break;
            case 49:
                System.out.println("Santa catarina");
                break;
            case 51:
                System.out.println("Rio Grande do Sul");
                break;
            case 58:
                System.out.println("Rio Grande do Sul");
                break;
            case 45:
                System.out.println("Paraná");
                break;
            case 46:
                System.out.println("Paraná");
                break;
            default:
                System.out.println("Região não encontrada!");
        }
    }
}
