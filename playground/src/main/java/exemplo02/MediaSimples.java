package exemplo02;

/**
 * Faça um método que recebe duas notas e calcula a média simples
 */

public class MediaSimples {

    public static void main(String[] args){
        double media = mediaSimples(8, 5);
        System.out.println("Média: " + media);
    }

    public static double mediaSimples(int valorA, int valorB){
        double media = (valorA + valorB) / 2d;

        return media;

    }
}
