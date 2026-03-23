package intermediario.desafio3;


import intermediario.desafio3.uchiha;

public class mainDesafio3 {
    public static void main(String[] args) {
        uchiha Sasuke = new uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.statusMissao = "concluido";
        Sasuke.mostrarInformacoes(Sasuke.nome, Sasuke.idade, Sasuke.statusMissao, Sasuke.habilidadeEspecial);
    }

}
