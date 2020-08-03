package estruturadados.pilha.testes;

import estruturadados.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilha = new Pilha<>();
        for(int i=1; i<10; i++){
            pilha.empilha(i);
        }

        System.out.println(pilha.toString());
        System.out.println(pilha.tamanho());
    }
}
