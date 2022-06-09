package exemplo06lacos;

/*
 * Faça um método que recebe uma lista de notas e retorna a maior e a menor entre elas.
 */
public class ListaMaiorMenorNota {
    public static void main(String[] args) {
        double nota [] = {9.1, 8.7, 7.8, 6.9, 10, 5.8, 4.8};
        double maiorNota = 0;
        double menorNota = 9999;

        for (int i = 0; i < nota.length; i++) {
            if( maiorNota < nota[i]) {
                maiorNota = nota[i];
            }
        }
        System.out.println("A maior nota é: " + maiorNota);


        for (int i = 0; i < nota.length; i++) {
            if(nota[i] < menorNota) {
                menorNota = nota[i];
            }
        }
        System.out.println("A menor nota é: " + menorNota);

    }

}
