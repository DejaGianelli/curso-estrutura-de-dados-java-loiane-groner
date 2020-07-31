package estruturadados.vetor.testes;

import estruturadados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args){
        try {
            Vetor vetor = new Vetor(5);
            vetor.adiciona("Elemento01");
            vetor.adiciona("Elemento02");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
