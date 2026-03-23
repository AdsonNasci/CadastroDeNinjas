package nivelfacil.Arrays;

public class Array {
    public static void main(String[] args) {
//        String ninja1 = "Naruto Uzumaki";
//        String ninja2 = "Sasuke Uchiha";
//        System.out.println(ninja1);
//        System.out.println(ninja2);
        // posso colocar String ninjas[] - mas não é boa prática
        // toda vez q vc inicia um array ele é um tipo de dado não
        // prmitivo também chamados de tipos de referência.
        // ver se o String[3] {0,1,2} tem q sempre passar einn
        //é boa pratica de programacao definir um array String[] junto.

        // nivelfacil.nivelfacil.Arrays.Arrays são tipo referência são fixo ou staticos

        String [] ninjas  = new String[6];
        //O array sempre terá tamanho fixo e a listas n
        // vc pode deixar espaço vazio printa null
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kakashi  Hatake";
        //novo espaço na memoria (um objeto de memoria)
        int[] idade = new int[2];
        //inicialização de array quando não definido
        //pro tipo int recebe 0
        //pro tipo boolean passa false
        //pro tipo float returna 0.0

        idade[0] = 16;
        System.out.println(idade[1]);

        // cuidado com a entrada de elementos pois vc precisa disponibilizar memoria a mais
        System.out.println(ninjas[2]);
    }
}
