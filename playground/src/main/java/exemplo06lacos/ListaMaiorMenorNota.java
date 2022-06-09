package exemplo01.exemplo06lacos;

/*
 * Faça um método que recebe uma lista de notas e retorna a maior e a menor entre elas.
 */
public class ListaMaiorMenorNota {
    public static void main(String[] args) {
        int nota [] = {9, 8, 7, 6, 10, 5, 4};
        int maiorNota = 0;
        int menorNota = 0;

        for (int i = 0; i < nota.length; i++) {
            if( maiorNota < nota[i]) {
                maiorNota = nota[i];
            }
        }
        System.out.println("A maior nota é: " + maiorNota);


        for (int i = 0; i > nota.length; i++) {
            if( menorNota > nota[i]) {
                menorNota = nota[i];
            }
        }
        System.out.println("A menor nota é: " + menorNota);

    }

}
