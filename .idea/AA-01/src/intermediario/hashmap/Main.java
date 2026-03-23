package intermediario.hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new LinkedList<>();
//        ninjas.add("Naruto Uzumaki");
//        ninjas.add("Sasuke Uchiha");
//        ninjas.add("Sakura Haruno");
//        ninjas.add("Naruto Uzumaki");
        // o set ignorar items duplidos


        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        System.out.println(ninjasSet);

        System.out.println(ninjasSet);
        // não da pra dar remove pois n tem ordenação
        // a n ser q seja pelo nome do item capaz q n funcione com classes
        // não se importa com a ordem pois ele muda





    }
}
