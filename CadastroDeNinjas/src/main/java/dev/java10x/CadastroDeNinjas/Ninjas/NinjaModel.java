package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import dev.java10x.CadastroDeNinjas.Missoes.Niveis;
import jakarta.persistence.*;
import java.util.List;

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
    private List<MissoesModel>  missoes;

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

    public NinjaModel(String nome, String email, int idade, List missoes) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

    public NinjaModel(String nome, Long id , List missoes, int idade,String email) {
        this(nome, email, idade, missoes);
        this.id = id;
    }
}
