package javacore.exemplo10primitivos;

public class ExemploWrappers {
    public static void main(String[] args) {

        Byte idadePet = -128; // de -128 até +127

        //Binário -> processa no Java com byte[]
        Byte[] pdf;
        Byte[] video;
        Byte[] imagem;

        //short
        Short populacaoEspumo = 14000; // Até ~32.000....

        //int
        // Uso recomendado de "_" underline quando precisar deixar claro o separador decimal
        int populacaoPortoAlegre = 1_492_530; // Até ~ 2mi

        //Maior tipo primitido inteiro: LONG
        Long numeroCelulasPet = 9199999999999999999L; // L: deixa claro não é um INT

        //Mais que isso: BigInteger

        // REAIS primitivos - podem ter problema de precisão em ***cálculos***

        //Float
        Float compra = 120.30F; //F: Deixar claro que é um FLOAT
        Float faturaCartao = 1990.00F;

        //Double
        Double arrecadacaoMunicipio = 2_000_000_000.01; // Pode ser usado "D"

        // Para cálculos monetários iremos usar o BigDecimal

        Boolean vaiChover = null; //false/true/nulo
        System.out.println(vaiChover);

        //NULL -> não ter referência a nenhum local da memória
    }
}

