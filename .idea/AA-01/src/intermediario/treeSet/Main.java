package intermediario.treeSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //quase nunca se usa treeSet
        Set<String> ninjas = new TreeSet<>();
        // igual o hashmap mas coloca na ordem alfabetica, ou numerica
        // LinkedHashSet coloca na ordem de implementação
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Danzo");
        ninjas.add("Gaara");
        Set<String> ninjas2 = new LinkedHashSet<>();
        ninjas2.add("Naruto Uzumaki");
        ninjas2.add("Sasuke Uchiha");
        ninjas2.add("Sakura Haruno");
        ninjas2.add("Naruto Uzumaki");
        System.out.println(ninjas2);



        System.out.println(ninjas);
    }
}
