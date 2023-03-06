public class MinhaClasse {
    public static void main(String[] args) {

        //VARIAVEIS

        int ano = 2021; //aqui podemos alterar a variavel em decorrencia no codigo
        ano = 2022; //assim como feito aqui

        final String BR = "Brasil"; //final quer dizer que a variavel não pode ser alterada em momento algum no codigo...
        //BR = "Aqui não cnoseguimos alterar";//Como vemos aqui da erro na variavel BR porq não conseguimos alterar

        System.out.println(BR);

        String meuNome = "Ronnie";

        int anoDeFabricacao = 2022;

        boolean verdade = true; //ou podemos usar false

        int soma = somarDoisNumeros(2, 4);

        System.out.println(soma);

        String nome = "Ronnie";
        String sobreNome = "de Souza";

        String nomeCompleto = nomeCompleto(nome,sobreNome);

        System.out.println("Resultado do metodo foi: " + nomeCompleto);

    }

    //METODOS

    //Estrutura
    // TipoDeRetorno NomeObjetivoInfinitivo Parametro()

    public static int somarDoisNumeros(int numero1 , int numero2) {
        int soma = numero1 + numero2;
        return soma;
    }

    public static String nomeCompleto(String primeiroNome, String sobreNome) {
        return primeiroNome.concat(" ").concat(sobreNome);
    }

}
