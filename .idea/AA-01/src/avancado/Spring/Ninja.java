package avancado.Spring;

public class Ninja {
    String nome;
    public void kyubi(){
        System.out.println("Kyubi fora do scopo statico");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void snaringan(){
        System.out.println("Sharingan dentro do scopo statico ");
    }

}


