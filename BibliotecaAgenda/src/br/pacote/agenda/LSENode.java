
package br.pacote.agenda;


public class LSENode<T extends Comparable<T>> {
    
    private T info;
    private LSENode <T> prox;
    
    LSENode (T valor){
        info = valor;
    }
     void setInfo (T valor){
        info = valor;
    }
    void setProx (LSENode <T> novoProx){
       prox = novoProx;
    }
     public T getInfo(){
        return info;
    }
     LSENode <T> getProx(){
        return prox;
    }
}
    

