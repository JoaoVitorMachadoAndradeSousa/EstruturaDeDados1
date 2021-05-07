package lista.lde.tres;

public class LDE<T extends Comparable<T>> {

    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void inserirNoFinal(T valor) {
        LDENode<T> novo, aux;
        novo = new LDENode<T>(valor);
        if (isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            qtd++;
        } else {
            aux = this.buscar(valor);
            if (aux != null) {
                System.out.println("Valor repetido!");
            } else {
                ult.setProx(novo);
                novo.setAnt(ult);
                ult = novo;
                qtd++;
                System.out.println("Inserção no final efetuada");
            }

        }
    }

    public void removerUltimo() {
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (qtd == 1) {
            this.prim = null;
            this.ult = null;
            qtd--;
        } else {
            ult = ult.getAnt();
            ult.setProx(null);
            qtd--;
            System.out.println("Remoção efetuada - fim");
        }
    }

    public void exibeLista() {
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

    private void removerPrimeiro() {
        if (isEmpty() == false) {
            if (qtd == 1) {
                prim = null;
                ult = null;
                qtd = 0;
            } else {
                prim = prim.getProx();
                prim.setAnt(null);
                qtd--;
            }
        }
    }
    

    private void inserirOrdenado(T valor) {
        LDENode<T> novo = new LDENode<T>(valor);
        LDENode<T> aux, ant;
        if (isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            qtd = 1;
        } else if (valor.compareTo(prim.getInfo()) < 0) {  //se o novo valor for menor que o primeiro
            prim.setAnt(novo);
            novo.setProx(prim);
            prim = novo;
            qtd++;
        } else if (valor.compareTo(ult.getInfo()) > 0) { //se o novo valor for maior que o ultimo
            ult.setProx(novo);
            novo.setAnt(ult);
            ult = novo;
            qtd++;
        } else {
            aux = prim.getProx();
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) > 0) { //se o aux for maior que o valor, o ponto de inserção foi encontrado
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
    private void inserirOrdenadoDecrescente(T valor) {
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

    public LDE<T> ordenarDecrescente() {
        LDE<T> novaLista = new LDE();
        LDENode<T> aux;
        while (this.isEmpty() == false) {
            aux = prim;
            this.removerPrimeiro();
            novaLista.inserirOrdenadoDecrescente(aux.getInfo());
        }
        return novaLista;
    }

    public LDE<T> ordenar() {
        LDE<T> novaLista = new LDE();
        LDENode<T> aux;
        while (this.isEmpty() == false) {
            aux = prim;
            this.removerPrimeiro();
            novaLista.inserirOrdenado(aux.getInfo());
        }
        return novaLista;
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
}
