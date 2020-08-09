package estruturadados.pilha.testes;

import estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilha = new Pilha<>();
        for(int i=1; i<10; i++){ // 1 to 9
            pilha.empilha(i);
        }
        System.out.println(pilha.topo());
        System.out.println(pilha.toString());
    }
}
