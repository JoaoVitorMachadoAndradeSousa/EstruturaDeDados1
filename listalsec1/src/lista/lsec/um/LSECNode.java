
package lista.lsec.um;

public class LSECNode<T extends Comparable<T>> {
    private T info;
    private LSECNode<T> prox;
    
    LSECNode (T valor) {
        info = valor;
    }
    void setInfo(T valor) {
        info = valor;
    }
    void setProx (LSECNode<T> novoProx) {
        prox = novoProx;
    }
    T getInfo() {
        return info;
    }
    LSECNode<T> getProx() {
        return prox;
    }
}
