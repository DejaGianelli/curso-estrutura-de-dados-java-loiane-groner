package estruturadados.vetor.testes;

import estruturadados.vetor.Vetor;

public class Aula05 {

    public static void main(String[] args){
        try {
            Vetor vetor = new Vetor(10);
            vetor.adiciona("Elemento01");
            vetor.adiciona("Elemento02");
            vetor.adiciona("Elemento03");
            System.out.println(vetor.buscar(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
