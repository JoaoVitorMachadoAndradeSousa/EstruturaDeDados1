
package lista.lde.tres;

public class LDENode <T extends Comparable <T>>{
    private T info;
    private LDENode<T> ant;
    private LDENode<T> prox;
    LDENode (T valor) {
        info = valor;
    }  
    void setInfo(T valor) {
        info = valor;
    }    
    T getInfo() {
        return info;
    }    
    void setProx (LDENode<T> novoProx) {
        prox = novoProx;
    }    
    LDENode<T> getProx() {
        return prox;
    }    
    void setAnt(LDENode<T> novoAnt) {
        ant = novoAnt;
    }   
    LDENode<T> getAnt() {
        return ant;
    }
}
