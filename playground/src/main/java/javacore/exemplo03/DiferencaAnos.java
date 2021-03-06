package javacore.exemplo03;

import java.util.Scanner;
/*
 * Faça um método que informa dois “anos” e calcula a diferença dentre eles.
 */

public class DiferencaAnos {
    public static void main(String[] args){

        imprimir("Informe o ano de início: ");
        int anoInicio = pedirAno();

        imprimir("Informe um ano fim: ");
        int anoFim = pedirAno();

        int diferenca = diferencaAnos(anoInicio, anoFim);
//        System.out.printf("Diferença entre %d e %d = %d anos", anoInicio, anoFim, diferenca);
//        String textoFormatado = "Diferença entre " + anoInicio + " e " + anoFim + " = " + diferenca +" anos";
        String textoFormatado = String.format("Diferença entre %d e %d = %d anos", anoInicio, anoFim, diferenca);
        imprimir(textoFormatado);
    }

    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static int pedirAno(){
        int ano = new Scanner(System.in).nextInt(); //Precisaria ser "closed" ao final na realidade
        return ano;
    }

    public static int diferencaAnos(int anoInicio, int anoFim){
        //int diferenca = anoFim-anoInicio;
        //return diferenca;
        return anoFim-anoInicio;
    }

}

