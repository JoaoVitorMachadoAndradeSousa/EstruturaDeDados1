
package pacote.lde2;

public class LDE <T extends Comparable<T>>{
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
        novo = new LDENode<T>(valor);
        if(isEmpty() == true){
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            System.out.println("Item inserido no final da lista");
        }else{
            if(this.prim.getInfo().compareTo(valor) == 0){
                System.out.println("Item existente!");
            }else{
                ult.setProx(novo);
                novo.setAnt(ult);
                ult = novo;
                qtd++;
                System.out.println("Item inserido no final da lista");
            }
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
    private LDENode<T> buscar (T valor){
        LDENode<T> aux;
        if (qtd == 0) { // lista vazia
            return null;
        }
        else {
            aux = prim;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                }
                else {
                    aux = aux.getProx();
                }
            }
            return null;
        }                  
    }
    public void remover (T valor){
        LDENode<T> aux, ant, prox;
        if(isEmpty() == true){
            System.out.println("Lista vazia");
        }else if(qtd == 1){
            if(valor.compareTo(prim.getInfo()) == 0){
                prim = null;
                ult = null;
                qtd--;
                System.out.println("Valor removido");
            }else{
                System.out.println("Valor nao encontrado");
            }
        }else{
            aux = buscar(valor);
            if(aux == null){
                System.out.println("Valor nao encontrado");
            }else{
                if(aux == prim){
                    prim = prim.getProx();
                    prim.setAnt(null);
                }else if(aux == ult){
                    ult = ult.getAnt();
                    ult.setProx(null);
                }else{
                    ant = aux.getAnt(); //nó anterior a aux
                    prox = aux.getProx(); //proximo nó de aux
                    ant.setProx(prox);
                    prox.setAnt(ant);
                }
                qtd--;
                System.out.println("Elemento removido");
            }
        }
    }
    public void buscaItem(T valor){
       LDENode<T> info = this.buscar(valor);
       if(info == null){
           System.out.println("Item não existente");
       }else{
           System.out.println("ITEM ENCONTRADO!");
           System.out.println(info.getInfo());
       }
    }
    public void tamanhoLista(){
        System.out.println(qtd);
    }
    public int getQtd(){
        return this.qtd;
    }
    }

