package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


//entity trasnforma uma classe em uma entidade do db
@Entity
@Table(name = "tb_model")
//LOMBOK
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString()
public class NinjaModel {
    //necessario ter um id
    // java declara id automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    //coluna deve ser unica. não pode ter itens repetidos
    @Column(unique = true)
    private String email;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "idade")
    private int idade;
    @Column(name = "rank")
    private String rank;
    //@manytoone um ninja uma unica missao
    @ManyToOne()
    @JoinColumn(name = "missoes_id")//foreing key  ou chave estrangeira
    private MissionModel missoes;
    //Many to one um ninja tem uma unica missao

}
