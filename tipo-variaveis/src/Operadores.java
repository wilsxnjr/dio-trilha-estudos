public class Operadores {
    public static void main(String[] args) {

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        //Operador ternario

        int a = 5;
        int b = 6;

        String resultado = (a==b) ? "verdadeiro" : "falso";
        System.out.println(resultado);

    }
}
