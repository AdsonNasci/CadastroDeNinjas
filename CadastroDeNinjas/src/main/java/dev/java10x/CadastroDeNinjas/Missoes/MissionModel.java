package dev.java10x.CadastroDeNinjas.Missoes;

import  com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedList;

@Entity
@Table(name ="tb_missoes")

//putaria cria automaticamente todos construtores caralhoosss
@NoArgsConstructor
@AllArgsConstructor
//cria os getters e setters essa porra
@Data
@ToString(exclude = "missoes")

public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String missaoNome;
    @Enumerated(EnumType.STRING)
    private Level nivel;
    private String rank;

    //uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private LinkedList<NinjaModel> ninjas = new LinkedList<>();
    private Boolean status;

    @Override
    public String toString() {
        return  "nome da missao: " + missaoNome +
                "nivel: " + nivel;
    }
}
