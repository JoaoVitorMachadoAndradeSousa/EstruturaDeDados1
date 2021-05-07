
package cadastro.cliente;


    public class LSESemRepetidos<T extends Comparable<T>> {
    private LSENode<T> inicio;
    private LSENode<T> ult;
    private int qtd;

    public void inserirValorFinal (T valor){
        LSENode<T> novo;
        novo = new LSENode (valor);
        if (qtd == 0) { // lista está vazia
           inicio = novo;
            ult = novo;
            qtd++;
        }
        else { // lista não está vazia
            
            if (this.buscaLogin(valor) == null){
                ult = novo;
                qtd++;
                System.out.println("Inserção efetuada!");
            }
            else {  // não achou!!!
               System.out.println("Valor repetido! Inserção não efetuada!");
            }
        }
       
    }
      private LSENode<T> buscaLogin (T login) { // Busca sequencial simples
        LSENode<T> aux = this.ult;
        if (qtd == 0) { // lista vazia
            return null;
        }
        else {
            aux = ult;
            while (aux != null) {
                if (aux.getInfo().compareTo(login) == 0) {
                    return aux;
                }
                else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
      }
      public T buscaObjeto(T valor){
    LSENode<T> pos;
    pos = buscaLogin(valor);
    if(pos == null){
        return null;
    }else{
        return pos.getInfo();
                
    }
      }
      public void removeNó(T nó){
          if(qtd != 0){
              LSENode<T> aux = this.inicio;
              LSENode<T> aux2 = null;
              while(aux != null){
                  if(aux.getInfo().compareTo(nó) == 0){
                      if(aux2 == null){
                          this.inicio = null;
                          this.ult = null;
                          
                      }else{
                          aux2.setProx(aux.getProx());
                      }
                      this.qtd--;
                      System.out.println("Item removido!");
                      break;
                  }
                  aux2= aux;
                  aux = aux.getProx();
              }
          }else{
              System.out.println("Cliente não cadastrado");
          }
      }
       public void exibirLista(){
        if(qtd != 0){
            LSENode<T> var = inicio;
            while(var != null){
                System.out.println(var.getInfo());
                var = var.getProx();
            }
            }else{
            System.out.println("Lista vazia!");
        }
    }
        public void exibe1Item (T valor){
        LSENode<T> aux = this.buscaLogin(valor);
        if(aux != null){
            System.out.println(aux.getInfo());
        }else{
            System.out.println("Item não existente na lista.");
        }
    }
        public LSENode<T> getInicio(){
            return this.inicio;
        }
        
        public boolean ehIgual (LSESemRepetidos<T> list){
            LSENode<T> aux1, aux2;
            if(this.qtd == list.qtd){
                aux1 = inicio;
                aux2 = list.getInicio();
                while(aux1 != null){
                    if(aux1.getInfo().compareTo(aux2.getInfo()) != 0){
                        aux1 = aux1.getProx();
                        aux2 = aux2.getProx();
                    }else{
                        return true;
                    }
                }
                return false;
            }else{
                return true;
            }
        }
        
         
}

