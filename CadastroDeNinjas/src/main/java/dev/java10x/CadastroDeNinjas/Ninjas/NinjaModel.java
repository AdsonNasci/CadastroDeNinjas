package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;


//entity trasnforma uma classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro")

public class NinjaModel  {
    //necessario ter um id
    // java declara id automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //@manytoone um ninja uma unica missao
    @ManyToOne()
    @JoinColumn(name = "missoes_id")//foreing key  ou chave estrangeira
    private MissoesModel missoes;
    //Many to one um ninja tem uma unica missao


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;

    }

    public NinjaModel(String nome,int idade, String email, Long id) {
        this(nome, email, idade);
        this.id = id;
    }

    public NinjaModel(String nome, int idade, String email, long id, MissoesModel missoes) {
        this(nome, idade, email, id);
        this.missoes = missoes;
    }
}
