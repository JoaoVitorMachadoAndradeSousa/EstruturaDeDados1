
package listas.duplamente.encadeadas.um;

public class LDERepetida<T extends Comparable<T>> {
    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;
    public boolean isEmpty(){
        if(qtd == 0){
            return true;
        }else{
            return false;
        }
    }
    public void inserirValorFinal(T valor){
        LDENode<T> novo;
        novo = new LDENode(valor);
        if(isEmpty() == true){
            prim = novo;
            ult = novo;
            qtd++;
        }else{
            ult.setProx(novo);
            novo.setAnt(ult);
            ult = novo;
            qtd++;
        }
        System.out.println("Inserção no final da lista efetuada!");
    }
    public void exibeLista(){
        LDENode<T> aux;
        if(isEmpty() == true){
            System.out.println("Lista vazia");
        }else{
            aux = prim;
            while(aux != null){
                System.out.println(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println();
        }
    }
    public void inserirValorInicio(T valor){
        LDENode<T> novo;
        novo = new LDENode(valor);
        if(isEmpty() == true){
            prim = novo;
            ult = novo;
            qtd++;
         }else{
            novo.setProx(prim);
            prim = novo;
            qtd++;
        }
    }
    public void removerUltimo(){
        if(isEmpty() == true){
            System.out.println("Lista vazia!");
        }else{
            if(qtd == 1){
                prim = prim.getProx();
                prim = null;
                ult = null;
                qtd--;
                System.out.println("Item removido!");
            }else{
                ult = ult.getAnt();
                ult.setProx(null);
                qtd--;
                System.out.println("Item removido!");
            }
        }
    }
    public void removerInicio(){
        if(isEmpty() == true){
            System.out.println("Lista vazia!");
        }else{
            if(qtd == 1){
                prim = null;
                ult = null;
            }else{
                 prim = prim.getProx();
                 prim.setAnt(null);
                 qtd--;
            }
            System.out.println("Item removido!");
            
        }
    }
}
