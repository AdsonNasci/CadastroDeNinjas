package dev.java10x.CadastroDeNinjas;
import jakarta.persistence.*;

//entity trasnforma uma classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro")

public class NinjaModel {
    //necessario ter um id
    // java declara id automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    NinjaModel() {}

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

    NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;

    }
}
