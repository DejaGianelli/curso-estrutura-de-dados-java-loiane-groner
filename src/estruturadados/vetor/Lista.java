package estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            T[] elementosNovos = (T[]) new Object[tamanho*2];
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

    public boolean remove(T elemento){
        int posicao = buscar(elemento);
        return remove(posicao);
    }

    public boolean adiciona(T elemento) throws Exception {
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

    public boolean adiciona(T elemento, int posicao){
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

    public Object buscar(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int buscar(T elemento){
        for(int i=0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }


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



}
