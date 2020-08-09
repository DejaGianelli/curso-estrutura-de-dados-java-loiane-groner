package estruturadados.pilha.testes;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty()); //true
        stack.push(1);
        stack.push(2);
        System.out.println(stack.isEmpty()); //false
        System.out.println(stack.size()); //2
        System.out.println(stack.peek()); //2
        System.out.println(stack.pop());
        System.out.println(stack.toString());


    }
}
