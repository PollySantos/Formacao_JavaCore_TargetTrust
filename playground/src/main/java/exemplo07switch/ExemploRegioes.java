package exemplo07switch;

/*
Considerando as áreas de DDD do RS:
51 - Região Metropolitana de Porto Alegre.
53 - Pelotas e Região.
54 - Caxias do Sul e Região.
55 - Santa Maria e Região.
Outros - Região não identificada
Crie um método que recebe o código inteiro da área e imprima a região do estado.
*/
public class ExemploRegioes {

    public static void main(String[] args) {

        String ddd = "54";
        imprimeRegiao(ddd);

    }

    public static void imprimeRegiao(String ddd){

        switch (ddd){
            case "51":
                System.out.println("Região Metropolitana de Porto Alegre.");
                break;
            case "53":
                System.out.println("Pelotas e Região.");
                break;
            case "54":
                System.out.println("Caxias do Sul e Região.");
                break;
            case "55":
                System.out.println("Santa Maria e Região.");
                break;
            default:
                System.out.println("Região não identificada.");
        }

    }
}