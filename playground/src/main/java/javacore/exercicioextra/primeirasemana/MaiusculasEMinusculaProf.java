package javacore.exercicioextra.primeirasemana;

public class MaiusculasEMinusculaProf {
    public static void main(String[] args) {
        String[] partes = "Olá mundo do java".split(" ");

        String ultimaParte = partes[partes.length-1];
        System.out.println(ultimaParte);
    }
}
