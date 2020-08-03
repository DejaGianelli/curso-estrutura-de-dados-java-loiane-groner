package estruturadados.vetor.testes;

import estruturadados.vetor.Lista;
import estruturadados.vetor.VetorObjetos;

public class Aula11 {

    public static void main(String[] args){
        try {

            Lista<String> vetorStrings = new Lista(2);
            vetorStrings.adiciona("String");
            vetorStrings.adiciona("String2");

            Lista<Integer> vetorInteiros = new Lista(2);
            vetorInteiros.adiciona(1);
            vetorInteiros.adiciona(2);

            Lista<Contato> vetorContatos = new Lista(2);
            vetorContatos.adiciona(new Contato("Deja", "deja@email.com.br"));
            vetorContatos.adiciona(new Contato("Gianelli", "gianelli@email.com.br"));

            System.out.println(vetorInteiros.toString());
            System.out.println(vetorStrings.toString());
            System.out.println(vetorContatos.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
