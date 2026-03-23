package intermediario.encapsulamento;

public abstract class Ninja {
    private String nome;
    private int idade;
    private String aldeia;
    private int numeroDeMissoes;
    private final double altura = 2.10;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public int getIdade() {
        return idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public double getAltura() {
        return altura;
    }

    //entrega valores
    public String getNome(){
        return nome;
    }


}
