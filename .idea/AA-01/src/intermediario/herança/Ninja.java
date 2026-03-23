package intermediario.herança;

public class Ninja {
    // tudo no java é objeto POO
    // todos objeto no java é feito de classes
    // 2 tipos de metodos void e return

    String nome;
    String aldeia;
    int idade;

    //metodo publico para ser global
    // funcao publica retorno ou void metodo()  ou funcao(){}
    //metodo string = obrigatoriamente tem q retornar string
    public String boasVindasMeuNomeEh(){

        return "Oi, Eu sou um ninja!";
    }//                             tipo parametro
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage-idade;
    }

}
