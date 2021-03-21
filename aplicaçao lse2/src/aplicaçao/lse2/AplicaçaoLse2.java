
package aplicaçao.lse2;
import br.unicap.c3.ed1.lse2versaofinal.LSE;
import java.util.Scanner;
public class AplicaçaoLse2 {

    public static void main(String[] args) {
    LSE<Produto> lista = new LSE<Produto>();
    Scanner in = new Scanner(System.in);
    int op;
    String cod, desc;
    float preço;
    int estoque;
    Produto p;
    String cod2;
        System.out.println("BEM VINDO(A)");
        do{
            System.out.println("1 – Inserir novo produto no início da lista\n" +
                               "2 – Inserir novo produto no final da lista\n" +
                               "3 – Remover o primeiro produto da lista\n" +
                               "4 – Remover o último produto da lista\n" +
                               "5 – Exibir todos os produtos da lista\n" +
                               "6 – Exibir os dados de um produto da lista\n" +
                               "7 – Alterar os dados de um produto da lista\n" +
                               "0 – Sair do programa");
            op = in.nextInt();
            in.nextLine();
            switch(op){
                case 1:
                    System.out.println("Informe o código do produto: ");
                    cod = in.nextLine();
                    System.out.print("Informe a descrição do produto: ");
		    desc = in.nextLine();
                    System.out.println("Informe o preço do produto: ");
                    preço = in.nextFloat();
                    in.nextLine();
                    while(preço <= 0){
                        System.out.println("Preço inválido, digite um valor acima de zero: ");
                        preço = in.nextFloat();
                        in.nextLine();
                    }
                    System.out.println("Informe a quantidade do estoque: ");
                    estoque = in.nextInt();
                    in.nextLine();
                    while(estoque < 0){
                        System.out.println("O estoque não pode ter uma quantidade menor que zero");
                        System.out.println("Digite novamente: ");
                        estoque = in.nextInt();
                        in.nextLine();
                   }
                   p = new Produto  (cod, desc, preço, estoque);
                   lista.inserirValorInicio(p);
                   break;
                case 2:
                    System.out.println("Informe o código do produto: ");
                    cod = in.nextLine();
                    System.out.print("Informe a descrição do produto: ");
		    desc = in.nextLine();
                    System.out.println("Informe o preço do produto: ");
                    preço = in.nextFloat();
                    in.nextLine();
                    while(preço <= 0){
                        System.out.println("Preço inválido, digite um valor acima de zero: ");
                        preço = in.nextFloat();
                        in.nextLine();
                    }
                    System.out.println("Informe a quantidade do estoque: ");
                    estoque = in.nextInt();
                    in.nextLine();
                    while(estoque < 0){
                        System.out.println("O estoque não pode ter uma quantidade menor que zero");
                        System.out.println("Digite novamente: ");
                        estoque = in.nextInt();
                        in.nextLine();
                   }
                   p = new Produto(cod, desc, preço, estoque);
                   lista.inserirValorFinal(p);
                   break;
                case 3:
                    lista.removerPrim();
                    break;
                case 4:
                    lista.removerUlt();
                    break;
                case 5:
                    lista.exibirLista();
                    break;
                case 6:
                    System.out.println("Informe o código do produto: ");
                    cod2= in.nextLine();
                    p = new Produto(cod2, "", 0.2231F,0);
                    lista.exibe1Item(p);
                    break;
                case 7:
                    System.out.println("Informe o código do produto: ");
                    cod2 = in.nextLine();
                    p =  new Produto (cod2, "", 0.2231F,0);
                    p = lista.buscaObjeto(p);
                    if(p == null){
                        System.out.println("Produto não cadastrado");
                    }else{
                         p.alteraItem();
                    }
                    break;
                case 0:
                           System.out.println("Programa encerrado.");
                default:
                    System.out.println("Opção inválida, digite novamente ");
            }
        }while ( op != 0);
    
    }
    
}
