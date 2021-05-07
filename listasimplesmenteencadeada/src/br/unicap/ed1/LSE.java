
package br.unicap.ed1;



    public class LSE <T> {
    private LSENode <T> prim;
    private LSENode<T> ult;
    private int qtd;
     private void setPrim(LSENode<T> prim){
        this.prim = prim;
    }
    private void setUlt(LSENode<T> ult){
        this.ult = ult;
    }
    public void inserirValorFinal (T valor){
     LSENode<T> novo;
     novo = new LSENode (valor);
     if(this.qtd == 0){
         prim = novo;
         ult = novo;
         qtd++;
         
     }else{
         if(buscaSimples(valor) == false){
         ult.setProx(novo);
         ult = novo;
         qtd++;
         System.out.println("Inserção efetuada");
     }else{
        System.out.println("Item já existente");
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
    public boolean buscaSimples (T obj){
        if(qtd == 0){
            return false;
        }else{
            LSENode<T> aux = prim;
            while(aux != null){
                if(obj.equals(aux.getInfo())){
                    return true;
                }
                aux = aux.getProx();
            }
            return false;
        }
            }
    public void removerUlt(){
        if(this.qtd != 0){
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

}
