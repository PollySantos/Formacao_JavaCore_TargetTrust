package javacore.exemplo04ifelse;

import java.util.Scanner;

/**
  * Faça um método que verifica se um número é par.
  * Se par, retornar "true", senão, "false".
  */

public class NumeroPar {

    public static void main(String[] args){

//     boolean par3 = isPar(3);
//     System.out.println("3 é par? "+par3);

        int numero = pedirNumero();
        boolean numeroEhPar = isPar(numero);
        System.out.println(numero + " é par? " + numeroEhPar);
    }

    public static int pedirNumero(){
        int numero = new Scanner(System.in).nextInt();
        return numero;
    }

    public static boolean isPar(int numero){
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
            }
    }
}

