package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionDTO {
    private long id;
    private String nome;
    private String missaoNome;
    private Level nivel;
    private String rank;
    //uma missao pode ter varios ninjas
    private LinkedList<NinjaModel> ninjas = new LinkedList<>();
    private Boolean status;

}
