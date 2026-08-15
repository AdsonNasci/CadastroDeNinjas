package dev.java10x.CadastroDeNinjas.Missoes;

public enum Level {
    Facil( "facil", 8),
    Media("media", 10),
    Dificil("dificil", 20),
    Mortal("mortal", 40),
    Kage("kage", 120);

    private String nivelNome;
    private int nivelDano;

    Level() {};
    Level(String nivelNome, int nivelDano) {
        this.nivelNome = nivelNome;
        this.nivelDano = nivelDano;
    }

    public String getNivelNome() {
        return nivelNome;
    }

    public int getNivelDano() {
        return nivelDano;
    }
}
