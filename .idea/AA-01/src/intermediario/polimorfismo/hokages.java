package intermediario.polimorfismo;
//TODO: INCLUIR 2 NOVOS ATRIBUTOS

public abstract class  hokages {

    //instanciar uma classe é criar um objeto
    // classes abstratas n podem ser instaciadas do msm jeito q uma interface (super class)
    //metodos abstrados podem ser abstratos tbm
//classe abstratan server para escalibilidade, e manutenção.

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    //construtores sao moldes pra dentro do proprio molde classe
    // construtores sao padroes o java por padrao entende q se vc criar uma classe vc cria automaticamente um construtor
    //construtor vazio
    //tipos no args constructor - sem argumentos
    //all args constructor - constuctor com argumentos

    void sabedoriaHokage(){};

    //metodos abstratos não podem ter corpo

    //construtor vazio sem argumentos

    void hokages(){
    }

    // construtor n leva tipo
    // constructor com argumentos

   void hokages(String nome){
        // this referencia o atributo da classe
        this.nome = nome;
    }

    void hokages(int idade){
        this.idade = idade;
    }

    void hokages(boolean vivoOuNao){
        this.vivoOuNao = vivoOuNao;
    }
    //ALL args constructor
    void hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
    // shortcut para criar construtores alt + insert
    //normalmente vc cria 2 tipos de  construtores um vazio = default(autmatico) e um all args contructor com todos argumentos.

   void hokages(double altura) {
        this.altura = altura;
    }
    void hokages(double altura, int missoes, String aldeia, double saldoBancario, boolean vivoOuNao, int idade, String nome) {
        this.altura = altura;
        this.missoes = missoes;
        this.aldeia = aldeia;
        this.saldoBancario = saldoBancario;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }

    // principal semelhanca de interface e classe abstrata: nenhuma das duas consegue criar uma classe abstrata
    // diferenca de uma interface e uma classe abstrata : Toda vez q vc cria uma interface todos os metodos da inteface
   // ele é obrigatoriamente abstrato.
    //toda vez q vc cria uma interface todos os atributos vc n pode setar dps os valores dessa variavel
 //  pq tudo é automaticamente final q significa q vc n pode setar valores e dever setar logo na interface.
  //  as variaveis da interface são estaticos.


}

    //
