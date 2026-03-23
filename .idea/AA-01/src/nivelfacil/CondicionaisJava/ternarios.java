package nivelfacil.CondicionaisJava;

public class ternarios {
    public static void main(String[] args) {
        // ternario são maneiras de reduzir o código// parecido com o if else
        //variavel = {ciondicao}? valorVerdadeiro : valorFalso;
        short missoes = 1;
        String nivel = (missoes >= 10)? "Esse ninja tem mais de 10 missoes ": "esse ninja tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
