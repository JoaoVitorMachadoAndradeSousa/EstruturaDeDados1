
package aula1.estrutura.de.dados;
import br.unicap.c3.ed1.LSE;
import java.util.Scanner;
public class Aula1EstruturaDeDados {

   
    public static void main(String[] args) {
    LSE<Integer> numeros = new LSE();
    Scanner in = new Scanner(System.in);
    int op;
    int num;
    do{
        System.out.println("Opções:");
        System.out.println("1 - Inserir um valor no início (antes do primeiro)");
        System.out.println("2 - Exibir a lista");
        System.out.println("0 - Encerrar");
        op = in.nextInt();
        switch(op){
            case 1: System.out.println("Informe o valor: ");
            num = in.nextInt();
            numeros.inserirValorInicio(num);
            break;
            case 2: numeros.exibirLista();
            break;
            case 0: System.out.println("Programa encerrado");
            break;
            default: System.out.println("Comando inválido, digite novamente: ");
            
        }
    }while(op != 0);
    }
    
}
