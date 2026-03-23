package nivelfacil.CondicionaisJava;
import  java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        //scanners entrance of data
        //in the switch cases you need to be more specific and in if and else more generalist
        //abrir o scanner
        Scanner scanner = new Scanner(System.in);
            //nome do scanner = criar novo objeto new scanner(System.in) quando vc abre uma caixa vc precisa fehcar
        System.out.println("Escolha um personagem :");
        System.out.println("1- Naruto Uzumaki ");
        System.out.println("2- Kakashi ");
        System.out.println("3- Sasuke Uchiha");
        int num = scanner.nextShort();

        System.out.println("Digite um numero de 1 a 3");
        int numeroDoUsuario = scanner.nextShort();

        switch (numeroDoUsuario){
            case 1:
                System.out.println("nivel shounin");
                break;
            case 2:
                System.out.println("nivel hokage");
                break;
            case 3:
                System.out.println("nivel shounin");
                break;
            default:
                System.out.println("digitou numeero gnrade dms te vira ai comparsa");
        }




        scanner.close();
        //fechar sempre o scanner
    }
}
