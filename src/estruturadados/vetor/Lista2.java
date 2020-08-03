package estruturadados.vetor;

import estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2() {
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }

    @Override
    public boolean adiciona(T elemento, int posicao) {
        return super.adiciona(elemento, posicao);
    }

    @Override
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }
}
