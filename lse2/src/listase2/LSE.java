
package listase2;


public class LSE<T extends Comparable<T>> {
    private LSENode<T> prim;
    private LSENode<T> ult;
    private int qtd;
    private void setPrim(LSENode<T> prim){
        this.prim = prim;
    }
    private void setUlt(LSENode<T> ult){
        this.ult = ult;
    }
    public void inserirValorInicio (T valor){
     LSENode<T> novo;
     novo = new LSENode (valor);
     if(this.qtd == 0){
         prim = novo;
         ult = novo;
         qtd++;
         
     }else{
        if(this.buscar(valor) == null){
             novo.setProx(prim);
         prim = novo;
         qtd++;
         System.out.println("Inserção efetuada!");
         }else{
             System.out.println("Valor repetido! Inserção não efetuada!");
     }
    }
    }
    public void inserirValorFinal (T valor){
        LSENode<T> novo;
        novo = new LSENode (valor);
        if (qtd == 0) { // lista está vazia
            prim = novo;
            ult = novo;
            qtd++;
        }
        else { // lista não está vazia
            
            if (this.buscar(valor) == null) { // achou!
                ult.setProx(novo);
                ult = novo;
                qtd++;
                System.out.println("Inserção efetuada!");
            }
            else {  // não achou!!!
               System.out.println("Valor repetido! Inserção não efetuada!");
            }
        }
       
    }
    
    
    public void exibirLista(){
        if(qtd != 0){
            LSENode<T> var = prim;
            while(var != null){
                System.out.println(var.getInfo());
                var = var.getProx();
            }
            }else{
            System.out.println("Lista vazia!");
        }
    }
    private LSENode<T> buscar (T valor) { // Busca sequencial simples
        LSENode<T> aux = this.prim;
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
    public void removerPrim(){
        if(this.qtd == 0){
            if(this.qtd == 1){
                this.setPrim(null);
                this.setUlt(null);
            }else{
                this.setPrim(prim.getProx());
                
            }
            System.out.println("Item removido!");
            this.qtd--;
        }else{
            System.out.println("Não há itens para remoção.");
        }
    }
    public void removerUlt(){
        if(this.qtd == 0){
            if(this.qtd == 1){
                this.setPrim(null);
                this.setUlt(null);
            }else{
                LSENode<T> aux = this.prim;
                LSENode<T> aux2 = null;
                while(aux.getProx() != null){
                    aux2 = aux;
                    aux = aux.getProx();
                }
                this.setUlt(aux2);
                this.ult.setProx(null);
            }
            System.out.println("Item removido!");
            this.qtd--;
        }else{
            System.out.println("Não há itens para remoção.");
        }
    }
    public void exibe1Item (T valor){
        LSENode<T> aux = this.buscar(valor);
        if(aux != null){
            System.out.println(aux.getInfo());
        }else{
            System.out.println("Item não existente na lista.");
        }
    }
}

