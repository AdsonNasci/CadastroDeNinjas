package intermediario.polimorfismo;

public class main2 {
    public static void main(String[] args) {
        //q djabo é isso aq parceiro n lembro de ter visto essa mistura do kansu n Uchiha.Uzumaki e eu conseguia ter acessso a ambos
        //as variaveis e metodos das duas classes mas só quando o Uzumaki estava dentro da classe uchiha
        // interfaces e herança multipla  ==  interfacecs são como contratos vc pode assinar ou não as supperclasses tem q assinar obrigatoriamente
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia = "aldeia da folha";
        Kakashi.idade = 48;
        Kakashi.boasVindas();
        Kakashi.ativarSharingan();
        Kakashi.HokageAtivo();

        Uchiha Madara = new Uchiha("Madara Uchiha", "aldeia da folha", 45,240, nivelNinja.KAGE);
        Madara.habilidadeEspecial();
        Madara.estrategiaDeBatalhaNinja();
        //metodos sobrecarregados overload de metodos... a diferença deles são os parametros.
        Madara.inteligenciaDeCombate(180);


        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "aldeia da folha";
        Naruto.habilidadeEspecial();
        // um atributo da interface implementada na classe ninja e extendida para classe uzumaki
        // a interface funciona como um contratos emq vc pode vir e pegar oq quiser mas tem q ser declarada e criada um body
        Naruto.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha("Itachi Uchiha","aldeia da folha",22);
        itachi.ninjaDeElite();

        //classe abstrata ninja vai servir toda subclasses mas se eu crio um contrutor na superclasse eu tenho q instanciar na subclasse



        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "aldeia da folha";
        Sasuke.nomedoninja();
        Sasuke.ativarSharingan();
        Sasuke.habilidadeEspecial();

        //@overload de metodos e construtores : refatorar usando sobrecarga conceito usado para refatorar
        // vish
        // @Override como funciona essa jossa .. polimorfismo
        //  Não necessariamente precisa sobrescrever seus metodos com o override
        //


/*
        Senju Hashirama = new Senju();
        Hashirama.sabedoriaHokage();

        hokages Tobirama = new hokages("Tobirama Senju ");
        System.out.println(Tobirama.nome);

        hokages Hiruzen = new hokages("Hiruzen Sarutobi", 50, false);
        System.out.println(Hiruzen);

        hokages Minato = new hokages("Minato Namikaze", 32, false);
 */


    }
}
