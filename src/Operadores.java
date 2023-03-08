public class Operadores {
    public static void main(String[] args) {
        String contatenacao = "?";

        contatenacao = 1+1+1+1+"1";

        System.out.println(contatenacao);

        contatenacao = 1+"1"+1+1;

        System.out.println(contatenacao);

        contatenacao = 1+"1"+1+"1";

        System.out.println(contatenacao);

        contatenacao = "1"+(1+1+1);

        System.out.println(contatenacao);

    }
}
