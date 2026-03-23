package intermediario.encapsulamento;

public enum Dificuldade {
    D("nivel facil", 2),C,B,A,S;
//enun com parametros privados
    private String descrissao;
    private int nivel;

    //constzinha
    Dificuldade(){};
    Dificuldade(String descrissao,int nivel){}

}
