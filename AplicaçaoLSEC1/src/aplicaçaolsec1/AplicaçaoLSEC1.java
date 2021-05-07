
package aplicaçaolsec1;
import java.util.Scanner;
import lista.lsec.um.LSEC;

public class AplicaçaoLSEC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    LSEC<Integer> lista = new LSEC<>();
    int op;
    do{
        System.out.println("1 – Inserir novo valor no início da lista");
        System.out.println("2 – Inserir novo valor no final da lista");
        System.out.println("3 – Remover o primeiro elemento da lista");
        System.out.println("4 – Remover o último elemento da lista");
        System.out.println("5 – Exibir a lista");
        System.out.println("6 - Contador");
        System.out.println("0 - Encerrar");
        System.out.println("==============================");
        op = in.nextInt();
        System.out.println("==============================");
        switch(op){
            case 1: System.out.println("Informe um valor para inserir no início da lista");
            int valor = in.nextInt();
            lista.inserirNoInicio(valor);
            break;
            case 2: System.out.println("Informe um valor para inserir no final da lista");
            int valor2 = in.nextInt();
            lista.inserirNoFinal(valor2);
            break;
            case 3: lista.removerInicio();
            break;
            case 4: lista.removerUltimo();
            break;
            case 5: lista.exibeLista();
            break;
            case 6: System.out.println("Informe o valor a ser procurado:");
            int valor3 = in.nextInt();
            lista.contador(valor3);
            break;
        }
        
    }while(op != 0);
    }
    
}
