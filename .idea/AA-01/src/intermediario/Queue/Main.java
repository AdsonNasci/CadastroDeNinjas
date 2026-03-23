package intermediario.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Filo first in first out// hat n tail concepts
        Queue<String> novoQueue = new LinkedList<>();
        //add
        novoQueue.add("Naruto");
        novoQueue.add("Sasuke");
        novoQueue.add("Sakura");
        novoQueue.add("Kakashi");
        novoQueue.add("Sarutobi");

        System.out.println("FILA: "+novoQueue);
        //remove
        novoQueue.poll();
        //see the first one
        System.out.println(novoQueue.peek());


    }
}
