
package lista.lde.quatro;

public class LDE<T extends Comparable<T>> {
    private  LDENode<T> prim;
    private  LDENode<T> ult;
    private int qtd;
    public boolean isEmpty() {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }

    }
    private LDENode<T> buscar(T valor) {
        LDENode<T> aux;
        if (qtd == 0) { // lista vazia
            return null;
        } else {
            aux = prim;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }
    public void inserirOrdenadoDecrescente(T valor) {
        LDENode<T> novo = new LDENode<T>(valor);
        LDENode<T> aux, ant;
        if (isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            qtd = 1;
        } else if (valor.compareTo(prim.getInfo()) > 0) {  
            prim.setAnt(novo);
            novo.setProx(prim);
            prim = novo;
            qtd++;
        } else if (valor.compareTo(ult.getInfo()) < 0) { 
            ult.setProx(novo);
            novo.setAnt(ult);
            ult = novo;
            qtd++;
        } else {
            aux = prim.getProx();
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) > 0) { 
                    ant = aux.getAnt();
                    ant.setProx(novo);
                    novo.setAnt(ant);
                    novo.setProx(aux);
                    aux.setAnt(novo);
                    qtd++;
                    return;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }
    public void remover (T valor){
        LDENode<T> novo = new LDENode(valor);
        if(isEmpty() == true){
            System.out.println("Lista vazia!");
        }else if(qtd == 1){
            if(prim.getInfo().compareTo(valor) == 0){
                this.prim = null;
                this.ult = null;
                qtd--;
            }else{
                System.out.println("Valor não encontrado!");
            }
        }else{ //qtd da lista != de 1
            novo = buscar(valor);
            if(novo != null){
            if(this.prim.getInfo().compareTo(valor) == 0){
                this.prim = prim.getProx();
                prim.setAnt(null);
                qtd--;
                System.out.println("Valor removido - primeiro");
            }else if(this.ult.getInfo().compareTo(valor) == 0){
                ult = ult.getAnt();
                ult.setProx(null);
                qtd--;
                System.out.println("Valor removido - ultimo");
            }else{
                novo.getAnt().setProx(novo.getProx());  //pegando o nó anterior ao novo e setando o próximo dele
                novo.getProx().setAnt(novo.getProx());
                this.qtd--;
                System.out.println("Valor removido! - meio");
            }
            
        }else{
                System.out.println("Valor não encontrado!");
            }
    }
}
    public void exibeListaDecrescente() {
        LDENode<T> aux;
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = prim;
            while (aux != null) {
                System.out.println(aux.getInfo() + " "); // exibe o valor de aux
                aux = aux.getProx(); // aux passa pro próximo nó enquanto não for null
            }
        }
    }
    public void exibeListaCrescente(){
        LDENode<T> aux;
        if(isEmpty() == true){
            System.out.println("Lista vazia!");
        }else{
            aux = ult;
            while(aux != null){
                System.out.println(aux.getInfo() + " ");
                aux = aux.getAnt();
                
            }
        }
    }
    public void exibe1Item(T valor){
        LDENode<T> info = buscar(valor);
        if(info != null){
            System.out.println("Resultado --> " + info.getInfo());
        }else{
            System.out.println("Valor não encontrado!");
        }
    }
    
}
