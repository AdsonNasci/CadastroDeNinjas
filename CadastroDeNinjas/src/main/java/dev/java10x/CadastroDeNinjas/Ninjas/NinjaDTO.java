package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    //clone das entity
    private Long id;
    private String nome;
    private String email;
    private String img_url;
    private int idade;
    private MissoesModel missoes;
    private String rank;
}
