package nivelfacil.TiposDeDados;

public class danosNaoPrimitivos {
    public static void main(String[] args) {
        /*oq significa uma classe e um metodo.
        dados não primitivos.
        dados não primitivos- podem receber metodos. String, Array, Class, enum;
        */
        //criar um ninja e atribuir metodos a ele. metodos são caracteristicas q colocamos dentro das nossas variaveis

        String nome = "Naruto";//aspas duplas e pra char simples
        String nomeToUpperCase = nome.toUpperCase(); // coloca tudo em capslock
        System.out.println("esse texto tá em caixa alta :"+nomeToUpperCase);
        System.out.println("esse texto tá normal : "+nome);

        String aldeia = "Aldeia da Folha";
        String alderiaLowerCase = aldeia.toLowerCase();
        System.out.println(alderiaLowerCase);

    }
}
