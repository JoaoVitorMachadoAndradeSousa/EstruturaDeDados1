
package aplicaçao.lse1;
import br.unicap.ed1.LSE;
import java.util.Scanner;

public class AplicaçaoLse1 {

    public static void main(String[] args) {
     LSE<Integer>  numerosPares = new  LSE();
     LSE<Integer> numerosImpares = new LSE();
     Scanner in = new Scanner(System.in);
     int op;
     int num;
    do{
        System.out.println("Opções:");
        System.out.println("1 - Inserir um valor no final");
        System.out.println("2 - Procurar número");
        System.out.println("3 - Exibir números pares");
        System.out.println("4 - Exibir números impares");
        System.out.println("5 - Encerrar");
        System.out.println("6 - Remover um item");
        op = in.nextInt();
        switch(op){
            case 1: System.out.println("Informe o valor: ");
            num = in.nextInt();
            if(num%2==0){
               numerosPares.inserirValorFinal(num);
               
            }else{
                numerosImpares.inserirValorFinal(num);
            }
            break;
            
            case 2: System.out.println("Informe o valor a ser procurado: ");
            num = in.nextInt();
            if(num%2 ==0){
                boolean result = numerosPares.buscaSimples(num);
                if(result == false){
                    System.out.println("Valor não encontrado");
                }else{
                    System.out.println("Valor encontrado");
                }
            }else{
                numerosImpares.buscaSimples(num);
                boolean result = numerosImpares.buscaSimples(num);
                if(result == false){
                    System.out.println("Valor não encontrado");
                }else{
                    System.out.println("Valor encontrado");
                }
            }
            break;
            case 3: numerosPares.exibirLista();
            break;
            case 4: numerosImpares.exibirLista();
            break;
            case 5: System.out.println("Programa encerrado");
            break;
            case 6: numerosPares.removerUlt();
            default: System.out.println("Comando inválido, digite novamente: ");
            
        }
    }while(op != 5);
    }
    
}
    
    

