package intermediario.stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Naruto");
        stack.push("Sasuke");
        System.out.println(stack.peek());
        stack.pop();
        stack.push("Kakashi");
        stack.size();


        String[] novoArray = new  String[10];//staticos e tem tamanho fixo
        //err


        //lista : é mais lenta que o array
        List<String> novoList = new ArrayList<String>();

        //Stacks são listas ordenadas last in - first out
        Stack<String> novoStack = new Stack<>();
        stack.push("Naruto");
        stack.push("Sasuke");
        System.out.println(stack);
        stack.pop();
        stack.push("Kakashi");

    }
}
