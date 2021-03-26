
package br.pacote.agenda;


public class LSESemRepetidosOrdenada<T extends Comparable<T>> {
    private LSENode<T> prim;
    private LSENode<T> ult;
    private int qtd;

    public LSENode<T> getPrim() {
        return prim;
    }

    public void setPrim(LSENode<T> prim) {
        this.prim = prim;
    }

    public LSENode<T> getUlt() {
        return ult;
    }

    public void setUlt(LSENode<T> ult) {
        this.ult = ult;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public void adicionaContato(T contato){
        LSENode<T> nó;
        if(qtd == 0){
            nó = new LSENode<T>(contato);
            this.setPrim(nó);
            this.setUlt(nó);
            qtd++;
            
        }else{
            nó = new LSENode<T>(contato);
            if(prim.getInfo().compareTo(contato)> 0){
                nó.setProx(prim);
                this.prim = nó;
                qtd++;
            }else if(ult.getInfo().compareTo(contato) < 0){
                ult.setProx(nó);
                this.ult = nó;
                qtd++;
            }else{
                LSENode<T> aux1 = this.prim;
                LSENode<T> aux2 = aux1.getProx();
                while(true){
                    if(aux1.getInfo().compareTo(contato) < 0){
                        aux2 = aux1;
                        aux1 = aux1.getProx();
                    }else if(aux1.getInfo().compareTo(contato)< 0){
                        aux2 = aux1;
                        aux1 = aux1.getProx();
                        
                    }else if(aux1.getInfo().compareTo(contato) == 0){
                        System.out.println("Item existente na lista.");
                        break;
                    }else{
                        nó.setProx(aux1);
                        aux2.setProx(nó);
                        qtd++;
                        System.out.println("Item inserido");
                        break;
                    }
                }
            }
        }
    }
    public void removeContato(T contato){
        if(qtd ==0){
            System.out.println("Lista vazia.");
        }else{
            if(prim.getInfo().compareTo(contato) > 0 || ult.getInfo().compareTo(contato) < 0){
                System.out.println("Contato não pertencente a lista. ");
            }else{
                if(prim.getInfo().compareTo(contato) == 0){
                    this.setPrim(prim.getProx());
                    qtd--;
                    if(prim == null){
                        prim = null;
                    }
                    System.out.println("Contato removido.");
                } else if(ult.getInfo().compareTo(contato) == 0){
                    LSENode<T> aux = this.prim;
                    while(aux.getProx() != this.ult){
                        aux = aux.getProx();
                    }
                    aux.setProx(null);
                    ult = aux;
                    qtd--;
                    System.out.println("Contato removido.");
            }else{
                    LSENode<T> ant = this.prim;
		    LSENode<T> aux = prim.getProx();
		    while(true) {
			if(aux.getInfo().compareTo(contato) == 0) {
				ant.setProx(aux.getProx());
				this.qtd--;
				break;
			}
			ant = aux;
	                aux = aux.getProx();
			if(aux.getProx().getInfo().compareTo(contato) > 0) {
			System.out.println("Contato não encontrado");
			break;
                }
            
                    
                    }
        }
    }
    
}
    }
    public void exibeContatos(){
        LSENode<T> aux = this.prim;
        while(aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
    public void exibe1Contato(T contato){
        LSENode<T> info = this.buscaItem(contato);
        if(info != null){
            System.out.println(info.getInfo());
        }else{
            System.out.println("Contato não existente");
        }
        
    }
    public LSENode<T> buscaItem(T contato) {
		LSENode<T> aux = this.prim;
		LSENode<T> prox = aux.getProx();
		while (aux != null) {
			if (aux.getInfo().compareTo(contato) == 0) {
				break;
			}
			if(prox.getInfo().compareTo(contato) > 0) {
				aux = null;
				break;
			}
			aux = aux.getProx();
		}
		return aux;
	}
    
}