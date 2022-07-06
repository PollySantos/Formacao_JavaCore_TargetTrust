package javacore.exemplo06lacos;

/*
 *Faça um método que recebe uma lista de notas e retorna a média simples
 */

public class ListaMediaSimples {
    public static void main(String[] args) {
        double[] nota = new double[3];
        nota[0] = 9;
        nota[1] = 10;
        nota[2] = 8;

        int media = 0;
        for(int i = 0; i<nota.length; i++)
            media += nota[i];

        float total = (float)media / 3;

        System.out.println("A média é:" + total);
    }
}
