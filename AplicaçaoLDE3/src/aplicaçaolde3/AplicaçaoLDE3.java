
package aplicaçaolde3;
import java.util.Scanner;
import lista.lde.tres.LDE;
public class AplicaçaoLDE3 {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        LDE<Integer> numeros = new LDE();
        int op, n;
        do{
            menu();
            op = in.nextInt();
            System.out.println("-----------------------");
            switch(op){
                case 1: System.out.println("Informe o número:");
                        n = in.nextInt();
                        numeros.inserirNoFinal(n);
                        break;
                case 2: numeros.exibeLista();
                        break;
                case 3: numeros.removerUltimo();
                        break;
                case 4: numeros = numeros.ordenar();
                        break;
                case 5: numeros = numeros.ordenarDecrescente();
                        break;
                case 0: System.out.println("Programa encerrado");
                        break;
                default: System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }
    
    public static void menu (){
        System.out.println("Menu de opções:");
        System.out.println("1-Inserir número no final da lista.");
        System.out.println("2-Exibir lista.");
        System.out.println("3-Remover o número do final da lista. ");
        System.out.println("4-Ordenar");
        System.out.println("5-Ordenar em decrescente");
        System.out.println("0-Sair do programa.");
        System.out.println("Escolha uma opção:");
    }   
}
    
    

