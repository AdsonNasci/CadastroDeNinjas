package avancado.Spring;

public class Main {
    static int idade = 10;

    static void main(String[]   args) {
        System.out.println(idade);
        Ninja ninja = new Ninja();
        ninja.setNome("Ninja 1");
        ninja.kyubi();
        // nao precisa iniciar um obj
        Ninja.snaringan();
    }
}
