
package br.unicap.c3.ed1;


public class LSE <T> {
    private LSENode <T> prim;
    private LSENode<T> ult;
    private int qtd;
    public void inserirValorInicio (int valor){
     LSENode<T> novo;
     novo = new LSENode (valor);
     if(this.qtd == 0){
         prim = novo;
         ult = novo;
         qtd++;
         
     }else{
         novo.setProx(prim);
         prim = novo;
         qtd++;
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
}

