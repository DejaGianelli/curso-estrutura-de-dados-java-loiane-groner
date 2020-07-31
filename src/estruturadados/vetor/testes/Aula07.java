package estruturadados.vetor.testes;

import estruturadados.vetor.Vetor;

public class Aula07 {

    public static void main(String[] args){
        try {
            Vetor vetor = new Vetor(10);
            vetor.adiciona("Elemento00");
            vetor.adiciona("Elemento02");
            vetor.adiciona("Elemento03");
            vetor.adiciona("Elemento01", 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
