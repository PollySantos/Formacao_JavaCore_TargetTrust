package javacore.exercicioextra.primeirasemana;

import java.util.Locale;

/*
 +Faça um método que recebe uma String e imprime ela em Maiúsculas e também em Minúsculas.
Entrada: "Pimenta nos Olhos dos Outros é Refresco"
PIMENTA nos olhos dos outros é refresco
 */
public class MaiusculaeMinuscula {
    public static void main(String[] args) {
        String frase = "Pimenta nos Olhos dos Outros é Refresco";

        String fraseMaiuscula = frase.toUpperCase();
        String fraseMinuscula = frase.toLowerCase();

        System.out.println(fraseMinuscula);
        System.out.println(fraseMaiuscula);

    }
}
