package estruturadados.vetor.testes;

import estruturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args){
        try {
            Vetor vetor = new Vetor(10);
            vetor.adiciona("B");
            vetor.adiciona("G");
            vetor.adiciona("D");
            vetor.adiciona("E");
            vetor.adiciona("F");
            vetor.remove(1);
            vetor.remove("F");
            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
