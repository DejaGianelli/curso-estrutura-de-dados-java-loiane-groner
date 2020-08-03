package estruturadados.base;

import java.lang.reflect.Array;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
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

    protected boolean adiciona(T elemento, int posicao){
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

    protected boolean adiciona(T elemento) throws Exception {
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
