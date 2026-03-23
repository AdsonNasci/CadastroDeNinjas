package intermediario.desafio6;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> ninjaslist = new LinkedList<>();

        ninjaslist.add(new Ninja("Naruto", 18, "konoha"));
        ninjaslist.add(new Ninja("Sasuke", 18, "konoha"));
        ninjaslist.add(new Ninja("Sakura", 17, "konoha"));
        ninjaslist.add(new Ninja("Kakashi", 32, "konoha"));
        ninjaslist.add(new Ninja("Madara", 212, "konoha"));
        ninjaslist.add(new Ninja("Tsunade", 53, "konoha"));
        ninjaslist.add(new Ninja("Tobirama", 37, "konoha"));

        ninjaslist.add(0, (new Ninja("Boruto", 37, "konoha")));

        ninjaslist.remove(0);
        System.out.println(ninjaslist);
        Scanner scanner = new Scanner(System.in);
        String seacher = scanner.nextLine();

        // just use .get();
        for(Ninja ninja : ninjaslist) {
            if (ninja.getNome().equals(seacher)){
                System.out.println(ninja);
            }
        }
        scanner.close();



        // como pesquisar essa merda ...
    }
}
