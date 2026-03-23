package intermediario.encapsulamento;

public class Equipamentos {
    private String nome;
    private int damegeDelt;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDamegeDelt() {
        return damegeDelt;
    }

    public void setDamegeDelt(int damegeDelt) {
        this.damegeDelt = damegeDelt;
    }

    public Equipamentos(String nome, int damegeDelt) {
        this.nome = nome;
        this.damegeDelt = damegeDelt;
    }
}
