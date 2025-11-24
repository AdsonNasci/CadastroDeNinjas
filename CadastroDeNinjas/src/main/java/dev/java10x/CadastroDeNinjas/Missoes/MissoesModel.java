package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.LinkedList;

@Entity
@Table(name ="tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String missaoNome;
    private Niveis nivel;
    //uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private LinkedList<NinjaModel> ninjas = new LinkedList<>();
    private boolean status;

    MissoesModel(){}

    public MissoesModel(String missaoNome, Niveis nivel) {
        this.missaoNome = missaoNome;
        this.nivel = nivel;
    }
    public MissoesModel(long id, String missaoNome, Niveis nivel) {
        this(missaoNome, nivel);
        this.id = id;
    }
    public MissoesModel(long id, String missaoNome, Niveis nivel, LinkedList<NinjaModel> ninjas, boolean status) {
        this(id, missaoNome, nivel);
        this.ninjas = ninjas;
        this.status = status;
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
