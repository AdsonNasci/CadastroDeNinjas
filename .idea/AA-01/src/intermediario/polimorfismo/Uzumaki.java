package intermediario.polimorfismo;

public class Uzumaki extends Ninja implements NinjaInterface{

    Bijus bijus;
    Uzumaki(){}
    Uzumaki(Bijus bijus){
        this.bijus = bijus;
    }

    @Override  // sobrescrever
    public void tacarUmaShuriken() {
        System.out.println("o ninja "+ nome + " tacou uma shurinken");
    }

    //n é necessario fazer override pq é abstrato crazyy

    public void estrategiaDeBatalhaNinja() {
        System.out.println("essa é minha estrategia de batalha");
    }
}
