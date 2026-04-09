package dev.java10x.CadastroDeNinjas.Missoes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesDTO {
    private long id;
    private String nome;
    private String missaoNome;
    private Niveis nivel;
    private String rank;
    //uma missao pode ter varios ninjas
    private LinkedList<NinjaModel> ninjas = new LinkedList<>();
    private Boolean status;

}
