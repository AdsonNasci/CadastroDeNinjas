package intermediario.polimorfismo;
// isso é uma superclasse uma classe mae que da origema a outras classes
// sub classes são as classes filhas
// temos problemas a criar construtores em super classes

public abstract class  Ninja implements EstrategiaDeBatalhaNinja{

    //n da pra criar objetos a partir de uma classe abstrada
    // todos as classes q surgirem a partir dessa classe deve ter seus metodos obrigatoriamente
    //TODO: Incluir novos 2 atributos(num de missoes concluidas e rank)
    // TODO: RANKS: GENNIN, CHUNNIN,JOUNNIN, HOKAGE.

    int idade;
    String nome;
    String aldeia;
    int numeroDeMissoesConcluidas;
    nivelNinja rank;

    //pega visao nos contrutores quando for colocar novos elementos vc precisa fazer a sobrecarga do construtor //
    //TODA VEZ Q VC INICIALIZA UM CONSTRUTOR ELE SE TORNA IMUTAVELLLL POR CAUSA DAS DIVERSAS CLASSES DEPENDENTE DELE.
    //metodo geral TODOS OS NINJAS VÃO TER


    //primeiro metodo
    //metodo final
    final void tacarKunaii(){
        System.out.printf("tacando kunnai beta");
    }
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }



    public Ninja() {
    }
    //TODO: SOBRECARGA DO CONSTRUTOR CHAMANDO UM NOVO CONSTRUTOR

    // repeticao de mt codigo n é escalavel papai
    // vc precisa referencia o construtor na classe mae anyways

    //overload de classe
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank ){
        this(nome,aldeia,idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é" + nome + "e esse é meu atk especial!");
    }

    //metodo abstrato
    public void  nomedoninja(){
        System.out.println("meu nome é"+ nome);
    }
    // instacia da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("essa é minha estrategia de batalha brooo");
    }
    //sobre carga de metodo = inteligencia de combate
    public  void inteligenciaDeCombate(){
        System.out.println("essa é minha inteligencia de combate ");
    }
    // sobrecarga e passando parametro, usar o msm nome de metodo
    public  void inteligenciaDeCombate(int qi){
        if(qi > 150) {
            System.out.println("Seu Qi é " + qi + " e um genio");
        }
        else if(qi >= 130) {
            System.out.println("vc é um ninja promissor");
        }else{
            System.out.println("vc precisa treinar mais ");
        }
    }

    //metodo sem override

    public void metodoTeste(){
        System.out.println("teste na classe ninja ");
    }

    @Override
    public String toString(){
        return nome;
    }
}










