package intermediario.polimorfismo;
// multiplas heranças // basta um implements para infinitas interfaces
public class Hatake extends Ninja implements sharingan, anbuinterface,Hokageinterface{
    public void boasVindas(){
        System.out.println(nome+" : Eu sou um hatake");
    }
    public void HokageAtivo(){
        System.out.println("eu sou um hokage");
    }

    public void ninjaDeElite() {
        System.out.println(nome + "Eu sou um ninja de elite da anbu");
    }

    public void ativarSharingan(){
        System.out.println("Sharingan ativado com sucesso");
    }


}
