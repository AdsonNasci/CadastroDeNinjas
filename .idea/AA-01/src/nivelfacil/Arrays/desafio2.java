package nivelfacil.Arrays;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short option;
        int i  = 0;
        String[] ninja = new String[3];

        do {
            System.out.println("Para adicionar um ninja digite 1\nPara listar um ninja digite 2\nPara deletar o ninja digite 3\nPara sair do MENU digite 4");
            option = scanner.nextShort();
            /*o buffer n permite scan um nextshort e dps um nextline após a leitura de um numero  o garbage collector passa a data mas
             deixa o \n de fora assim quando vc ler uma nextline o scan vai ler oq tava no buffer e vai pular a linha imediatamentee
             por isso não sei se é uma boa pratica de programacao usar um nextline so para limpar o buffer antes da entrada do next int
             quando são nextline seguidos n é necessario*/
            scanner.nextLine();
            switch (option) {
                case 1:
                    if(i < ninja.length){
                        System.out.println("Digite o nome do ninja para o cadastro : ");
                        String nome = scanner.nextLine();
                        ninja[i] = nome;
                        i++;
                    }else {
                        System.out.println("Numero maximo da lista alcançado");
                    }
                    break;
                case 2:
                    if(i == 0){
                        System.out.println("Nenhum ninja cadastrado");
                    }else {
                        for (String s : ninja) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Digite a posicão do ninja na lista ");
                    short num = scanner.nextShort();
                    ninja[num] = null;
                    break;
                case 4:
                    System.out.println("Programa finalizado com sucesso.");
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }
        }while (option != 4);

        scanner.close();
    }
}
