package estruturadados.vetor.testes;

import estruturadados.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args){
        try {
            Contato contato = new Contato("Loiane", "contato@email.com");
            VetorObjetos vetor = new VetorObjetos(10);
            vetor.adiciona("B");
            vetor.adiciona(3);
            vetor.adiciona(4D);
            vetor.adiciona("E");
            vetor.adiciona(new Contato("Loiane", "contato@email.com"));
            vetor.remove(0);
            vetor.remove(4D);
            if( vetor.buscar(contato) >= 0 ){
                System.out.println("Elemento existe no vetor");
            }else{
                System.out.println("Elemento não existe no vetor");
            }
            System.out.println("Tamanho = " + vetor.tamanho());
            System.out.println(vetor.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
