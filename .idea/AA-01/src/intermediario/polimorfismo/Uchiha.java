package intermediario.polimorfismo;

public class Uchiha extends Ninja implements sharingan, anbuinterface{
    //deve-se seguir o contrato tod vez q se implementa uma interface deve-se da um corpo para ela
    //metodo implementado pelo sharingan
    public void ativarSharingan() {
        System.out.println("O sharingan do ninja " + nome + " foi ativado!");
    }
    // instancia subscricao do metodo na supperclasse
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        //preciso do super para uma subclass pegar os atributos de um construtor de uma superclasse abstrada .
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void ninjaDeElite() {
        System.out.println(nome + "Eu sou um ninja de elite da anbu");
    }

    // anotations : sobrescreve a classe
    @Override //anotação toda ver q eu quero sobrescrever algo q já existe
    public void habilidadeEspecial() {
        System.out.println("Meu nome é" + nome + "esse é meu atk uchiha, atk de fogo e meu numero de missoes é "+ numeroDeMissoesConcluidas );
    }

    public  void inteligenciaDeCombate(){
        System.out.println("get qi");
    }
    @Override
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

    // nsem override razoes para usar : a anotação override
    // boa pratica uma convenção do java
    // evita erros de digitação ,, na overload de metodo
    public void metodoTeste(){
        System.out.println("teste na classe Uchiha ");
    }


}
