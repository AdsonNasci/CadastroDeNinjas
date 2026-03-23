package intermediario.herança;

import java.util.ArrayList;
import java.util.List;

public class main1 {
    public static void main(String[] args) {

        //Criar ninja Sasuke uchiha
        //iniciar o onjeto agr vc pode acessar atributos do objeto
        // se uma classe é um objeto a interface é uma janela(pega a classe pega um atributo de outra)
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "aldeia da folha";

        String chamandoMetodo = Sasuke.boasVindasMeuNomeEh();
        System.out.println(chamandoMetodo);
        //chamada de metodo com parametro
        int quantoFaltaParaVirarHokage = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Você tem " + Sasuke.idade + " entao falta " + quantoFaltaParaVirarHokage + " anos para vc se tornar um hokage. ");

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "aldeia da folha";
        Naruto.idade = 17;
        Naruto.modoSabio();
        Naruto.ShakaraMaior();

        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "aldeia da folha";
        Sakura.poderDeCura();

        Hyuga Hinata = new Hyuga();

        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "aldeia da folha";
        Hinata.ativarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "aldeia da folha";
        Boruto.idade = 9;
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();
        // tudo q os uzumaki tem acesso ou q o os HyugaUzumaki tem acesso.. n temos acesso aos do Hyuga


        //   orientação ao objeto java, swift(mobile), dart , kotlin.
        /*Pilar da intermediario.herança: Usar caracteristicas de uma classe mãe em outra classe filha para assim poupar codigo e
         *agilização de trabalho.
         *Pilar Polimorfismo: Criar uma função única que pode ser utilizada em diferentes classes com diferentes caracteristicas
         *
         *
         *
         */
        List<String> ninjaList= new ArrayList<>();

        ninjaList.add("Sasuke Uchiha");
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Sakura Haruno");

        System.out.println("Ninja lista: " + ninjaList);
        ninjaList.remove("Sasuke Uchiha");
        System.out.println("Ninja lista: " + ninjaList);

        ninjaList.set(1,"Adson Nascimento");
        System.out.println(ninjaList);
        System.out.println(ninjaList.size());



    }
}
