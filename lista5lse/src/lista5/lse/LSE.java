package lista5.lse;

public class LSE<T extends Comparable<T>> {

    private LSENode<T> prim;
    private LSENode<T> ult;
    private int qtd;

    public void inserirValorFinal(T valor) {
        LSENode<T> novo;
        novo = new LSENode(valor);
        if (qtd == 0) { // lista está vazia
            prim = novo;
            ult = novo;
            qtd++;
        } else { // lista não está vazia
            if (novo.getInfo().compareTo(valor) == 0) { // achou!
                ult.setProx(novo);
                ult = novo;
                qtd++;
                System.out.println("Inserção efetuada!");
            } else {  // não achou!!!
                System.out.println("Valor repetido! Inserção não efetuada!");
            }
        }

    }

    public void removeValorRepetido(T valor) {
        LSENode<T> aux, ant = null;
        if (qtd == 0) {
            System.out.println("Lista vazia!");
        } else {
            aux = prim;
            if (qtd == 1) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    prim = null;
                    ult = null;
                    qtd--;
                    System.out.println("Removido!");
                } else {
                    System.out.println("Valor não encontrado!");
                }
            } else {
                if (prim.getInfo().compareTo(valor) == 0) {
                    prim = prim.getProx();
                    qtd--;
                    System.out.println("Removido!");
                } else {
                    aux = prim;
                    while (aux != null) {
                        if (aux.getInfo().compareTo(valor) == 0) {
                            ant.setProx(aux.getProx());
                            qtd--;
                            System.out.println("Removido!");
                        } else {
                            ant = aux;
                            aux = aux.getProx();
                        }
                    }
                    System.out.println("Valor não encontrado!");
                }
            }
        }

    }

    public void removeValorNaoOrdenado(T valor) {
        LSENode<T> aux, ant = null;
        int cont = 0;
        if (qtd == 0) {
            System.out.println("Lista vazia");
        }else if(qtd == 1){
            if(prim.getInfo().compareTo(valor) == 0){
                prim = null;
                ult = null;
                qtd = cont;
                System.out.println("Valor removido");
            }else{
                System.out.println("erro");
            }
    }else if(valor == prim.getInfo() && valor == ult.getInfo()){
        prim = null;
        ult = null;
        cont = qtd;
        qtd = 0;
        
    }else{
        if(cont != 0){
            System.out.println("Foram removidos: " + cont);
        }else if(prim == null){
            ult = null;
        }else{
            ant = prim;
            aux = prim.getProx();
            while(aux != null){
                if(aux.getInfo().compareTo(valor) == 0){
                    ant.setProx(aux.getProx());
                    qtd--;
                    cont++;
                    aux = aux.getProx();
                    if(aux == null){
                        ult = ant;
                        System.out.println("Foram removidos" + cont);
                        return;
                    }
                }else if(aux.getInfo().compareTo(valor) >0){
                    break;
                }else{
                    ant = aux;
                    aux = aux.getProx();
                }
                
            }
            if(aux == null){
                System.out.println("Valor inexistente");
            }else{
                System.out.println("Foram removidos: " + cont);
            }
        }
    }
    }
    public void remover(T valor) {  // remover um valor procurado
        LSENode<T> aux, anterior = null;
        int cont = 0;
        if (qtd == 0) {
            System.out.println("Lista vazia!");
        } else if (qtd == 1) {
            if (prim.getInfo().compareTo(valor) == 0) {
                prim = null;
                ult = null;
                qtd = 0;
                System.out.println("Remoção efetuada!");
            } else {
                System.out.println("Valor não encontrado!");
            }
        } else if (valor == prim.getInfo() && valor == ult.getInfo()) {
            prim = null;
            ult = null;
            cont = qtd;
            qtd = 0;
        } else {
            while (prim != null && prim.getInfo().compareTo(valor) == 0) {
                // remoção no início de uma lista com mais de um elemento
                prim = prim.getProx();
                qtd--;
                cont++;
            }
            if (cont != 0) {
                System.out.println("Foram removidos " + cont + " elementos.");
            } else if (prim == null) {
                ult = null;
            } else { // caso geral
                anterior = prim;
                aux = prim.getProx();
                while (aux != null) {
                    if (aux.getInfo().compareTo(valor) == 0) {
                        anterior.setProx(aux.getProx());
                        qtd--;
                        cont++;
                        aux = aux.getProx();
                        if (aux == null) {
                            ult = anterior;
                            System.out.println("Foram removidos " + cont + " elementos.");
                            return;
                        }
                    } else if (aux.getInfo().compareTo(valor) > 0) {
                        break;
                    } else {
                        anterior = aux;
                        aux = aux.getProx();
                    }
                }
                if (aux == null) {
                    System.out.println("Valor não encontrado!");
                } else {
                    System.out.println("Foram removidos " + cont + " elementos.");
                }
            }
        }
    }

    public void exibirLista() {
        LSENode<T> aux;
        if (qtd == 0) {
            System.out.println("Lista vazia!!");
        } else {
            aux = prim;
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println();
        }
    }
    public void removeN(T valor){
        LSENode<T> aux, ant = null;
        int cont = 0;
        aux = prim.getProx();
        if(qtd == 0){
            System.out.println("Lista vazia");
             } else if(qtd == 1){ // caso geral
                ant = prim;
                aux = prim.getProx();
                while (aux != null) {
                    if (aux.getInfo().compareTo(valor) == 0) {
                        ant.setProx(aux.getProx());
                        qtd--;
                        cont++;
                        aux = aux.getProx();
                        if (aux == null) {
                            ult = ant;
                            System.out.println("Foram removidos " + cont + " elementos.");
                            return;
                        }
                    } else if (aux.getInfo().compareTo(valor) > 0) {
                        break;
                    } else {
                        ant= aux;
                        aux = aux.getProx();
                    }
                }
                if (aux == null) {
                    System.out.println("Valor não encontrado!");
                } else {
                    System.out.println("Foram removidos " + cont + " elementos.");
                }
            }
        }
    public void removeRepetido(T valor){
        LSENode<T> aux;
        LSENode<T> ant;
        ant = null;
        int cont = 0;
        if(qtd == 0){
            System.out.println("Lista vazia");
        }else{
            ant = prim;
            aux = prim.getProx();
        }
        
    }
        }
    

