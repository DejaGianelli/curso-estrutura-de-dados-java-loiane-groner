package estruturadados.vetor.testes;

import estruturadados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args){
        try {
            Vetor vetor = new Vetor(10);
            vetor.adiciona("Elemento01");
            vetor.adiciona("Elemento02");
            vetor.adiciona("Elemento03");
            int existe = vetor.buscar("Elemento02");
            System.out.println(existe);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
