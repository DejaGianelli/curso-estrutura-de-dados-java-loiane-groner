package estruturadados.vetor.testes;

import estruturadados.vetor.Vetor;

public class Aula08 {

    public static void main(String[] args){
        try {
            Vetor vetor = new Vetor(1);
            vetor.adiciona("Elemento00");
            vetor.adiciona("Elemento02");
            vetor.adiciona("Elemento03");
            vetor.adiciona("Elemento01", 1);
            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
