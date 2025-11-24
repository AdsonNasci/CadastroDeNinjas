package dev.java10x.CadastroDeNinjas.Missoes;

public class MissoesModel {

    private String missaoNome;
    private Niveis nivel;

    MissoesModel(){}

    public MissoesModel(String missaoNome, Niveis nivel) {
        this.missaoNome = missaoNome;
        this.nivel = nivel;
    }

    public String getMissaoNome() {
        return missaoNome;
    }

    public void setMissaoNome(String missaoNome) {
        this.missaoNome = missaoNome;
    }

    public Niveis getNivel() {
        return nivel;
    }

    public void setNivel(Niveis nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return  "nome da missao: " + missaoNome +
                "nivel: " + nivel;
    }
}
