package javacore.exercicioextra.primeirasemana;

/*
 * Split: Faça um método que recebe uma String e retorna cada palavra da sentença em uma linha.
Entrada: "A pressa é a inimiga da perfeição."
Saída: "A
pressa
é
a
inimiga
da
perfeição."
 */

public class SeparaSplit {

    public static void main(String[] args) {
        String nome = "A pressa é inimiga da perfeição.";

        String[] separacao = nome.split(" ");

        System.out.println(separacao[0]);
        System.out.println(separacao[1]);
        System.out.println(separacao[2]);
        System.out.println(separacao[3]);
        System.out.println(separacao[4]);
        System.out.println(separacao[5]);

    }

}