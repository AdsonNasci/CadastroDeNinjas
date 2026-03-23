package intermediario.LinkedList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();

        list.add("Naruto");
        list.add("Sasuke");
        list.add("Sakura");
        list.add(1,"Kakashi");
        System.out.println(list);
        list.remove("Sakura");
        System.out.println(list);
        // introduction to collection
        // collections é uma interface papai
        //array é primitivo

    }
}
