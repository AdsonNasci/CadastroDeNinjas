package nivelfacil.CondicionaisJava;

public class laçosderepeticao {
    public static void main(String[] args) {
        //repetir inifinitamente ou até atingir o parametro desejado.
        // WHILE - enquanto for verdadeira tudo aq vai acontecer

        int numeroDeClones = 0;
        int numeroMaximoDeClnes = 40;
//  + em string se chama interpolação
        while(numeroMaximoDeClnes > numeroDeClones) {
            System.out.println("O naruto fez um clone das Sombras" + numeroDeClones);
            numeroDeClones++;
        }

        for (int i = 0; i > numeroMaximoDeClnes; i++) {
                System.out.println("O naruto foi de base "+ i);
        }
    }
}

