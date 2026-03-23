package nivelfacil.CondicionaisJava;

public class condicionaisSimples {
    public static void main(String[] args) {
        String nome = "Naruto";
        int idade = 16;
        boolean  hokage = false;
        short missoes = 25;
        String rank;
        // passar o ninja de nivel de acordo com o numero de missoes.

        if(missoes == 10 && idade > 15){
            System.out.println("chounin");
        }
        else if(missoes > 20 ){
            System.out.println("jounin");
        }else {
            System.out.println("genin");
        }

    }
}
