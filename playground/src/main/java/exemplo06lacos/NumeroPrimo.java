package exemplo06lacos;

import java.util.Scanner;

/*
 * recebe um número e verifica se ele é primo.
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        System.out.println("Digite um número");
        numero = valor.nextInt();

        for(int i = 1; i <= numero; i++) {
            if (numero % i == 0) ;
                contador++;
        }

            if(contador == 2) {
            System.out.println("O número " + numero + " é primo.");
            } else {
            System.out.println("O número " + numero + " não é primo.");
            }

    }
}
