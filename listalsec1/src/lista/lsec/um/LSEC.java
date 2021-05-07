package lista.lsec.um;

public class LSEC<T extends Comparable<T>> {

    private LSECNode<T> prim;
    private LSECNode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoFinal(T valor) {
        LSECNode<T> novo;
        novo = new LSECNode<T>(valor);
        if (isEmpty() == true) {
            prim = novo;
            ult = novo;
            qtd++;
            ult.setProx(prim);
        } else {
            ult.setProx(novo);
            ult = novo;
            ult.setProx(prim);
            qtd++;
        }
    }

    public void inserirNoInicio(T valor) {
        LSECNode<T> novo;
        novo = new LSECNode<T>(valor);
        if (qtd == 0) {
            prim = novo;
            ult = novo;
            ult.setProx(prim);
            qtd++;
        } else {
            novo.setProx(prim);
            prim = novo;
            ult.setProx(prim);
            qtd++;
        }
    }

    public void removerInicio() {
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (qtd == 1) {
            prim = null;
            ult = null;
            qtd = 0;
            System.out.println("Remoção efetuada - 1 valor");
        } else {
            prim = prim.getProx();
            ult.setProx(prim);
            qtd--;
            System.out.println("Remoção efetuada - inicio");
        }
    }

    public void removerUltimo() {
        LSECNode<T> aux, ant;
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (qtd == 1) {
            prim = null;
            ult = null;
            qtd = 0;
            System.out.println("Remoção efetuada - 1 valor");
        } else {
            aux = prim;
            while (aux.getProx() != ult) {
                ant = aux;
                aux = aux.getProx();
            }
            ant = aux.getProx();
            aux.setProx(prim);
            qtd--;
            System.out.println("Remoção efetuada - fim");

        }
    }

    public void contador(T valor) {
        LSECNode<T> aux;
        int cont = 0;
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (qtd == 1) {
            if (prim.getInfo().compareTo(valor) == 0) {
                System.out.println("O valor aparece apenas uma vez!");
                return;
            } else {
                System.out.println("Valor não encontrado!");
            }
        } else {
            aux = prim;
            for (int i = 0; i != qtd; i++) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    cont++;

                } else {
                    aux = aux.getProx();
                }
            }

        }
        if (cont == 0) {
            System.out.println("Esse valor não aparece nenhuma vez na lista.");
        } else {
            System.out.println("Contador: " + cont);
        }

    }

    public void exibeLista() {
        LSECNode<T> aux;
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = prim;
            for (int i = 0; i != qtd; i++) {
                System.out.println(aux.getInfo() + " ");
                aux = aux.getProx();
            }

        }
    }

}
