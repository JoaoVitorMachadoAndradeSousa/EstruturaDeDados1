
package aplicaçaolde1;
import java.util.Scanner;
import listas.duplamente.encadeadas.um.LDERepetida;

public class AplicaçaoLDE1 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    LDERepetida<Integer> lista = new LDERepetida<>();
    int op;
    do{
        System.out.println("1 – Inserir novo valor no início da lista");
        System.out.println("2 – Inserir novo valor no final da lista");
        System.out.println("3 – Remover o primeiro elemento da lista");
        System.out.println("4 – Remover o último elemento da lista");
        System.out.println("5 – Exibir a lista");
        System.out.println("0 - Encerrar");
        op = in.nextInt();
        switch(op){
            case 1: System.out.println("Informe um valor para inserir no início da lista");
            int valor = in.nextInt();
            lista.inserirValorInicio(valor);
            break;
            case 2: System.out.println("Informe um valor para inserir no final da lista");
            int valor2 = in.nextInt();
            lista.inserirValorFinal(valor2);
            break;
            case 3: lista.removerInicio();
            break;
            case 4: lista.removerUltimo();
            break;
            case 5: lista.exibeLista();
            break;
        }
        
    }while(op != 0);
    }
    
}
