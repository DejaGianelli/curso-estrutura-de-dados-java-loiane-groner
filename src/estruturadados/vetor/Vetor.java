package estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            String[] elementosNovos = new String[tamanho*2];
            for(int i=0; i<tamanho; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public boolean remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i=posicao+1; i <= tamanho-1; i++){
            elementos[i-1] = elementos[i];
            if(i == tamanho-1){
                elementos[i] = null;
            }
        }
        tamanho--;
        return true;
    }

    public boolean remove(String elemento){
        int posicao = buscar(elemento);
        return remove(posicao);
    }

    public boolean adiciona(String elemento) throws Exception {
        aumentaCapacidade();
        if(tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho(){
        return tamanho;
    }

    public boolean adiciona(String elemento, int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentaCapacidade();
        for(int i=tamanho-1; i >= posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public String buscar(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int buscar(String elemento){
        for(int i=0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    /*public boolean buscar(String elemento){
        for(int i=0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }*/

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < tamanho-1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }
        if(tamanho > 0){
            s.append(elementos[tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }

    /*public void adiciona(String elemento) throws Exception {
        if(tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
            return;
        }
        throw new Exception("Vetor já está cheio, não é possível adicionar novo valor.");
    }*/

    /*public void adiciona(String elemento){
        for(int i=0; i < elementos.length; i++){
            if(elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }*/


}
