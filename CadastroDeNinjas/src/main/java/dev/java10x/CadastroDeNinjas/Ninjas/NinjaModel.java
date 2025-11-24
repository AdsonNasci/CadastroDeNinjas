package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//entity trasnforma uma classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro")
//LOMBOK
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel  {
    //necessario ter um id
    // java declara id automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    //coluna deve ser unica. não pode ter itens repetidos
    @Column(unique = true)
    private String email;
    private int idade;
    //@manytoone um ninja uma unica missao
    @ManyToOne()
    @JoinColumn(name = "missoes_id")//foreing key  ou chave estrangeira
    private MissoesModel missoes;
    //Many to one um ninja tem uma unica missao

}
