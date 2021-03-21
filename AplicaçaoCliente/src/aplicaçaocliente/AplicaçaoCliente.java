
package aplicaçaocliente;
import static aplicaçaocliente.CadastroCliente.alteraCliente;
import cadastro.cliente.LSESemRepetidos;
import java.util.Scanner;

public class AplicaçaoCliente {

    public static void main(String[] args) {
   LSESemRepetidos<Cliente> clientes = new LSESemRepetidos();
   Scanner in = new Scanner(System.in);
   int op;
   String cpf, email, nome, fone;
   do{
       System.out.println("BEM VINDO");
       System.out.println("1 – Cadastrar um novo cliente ");
       System.out.println("2 – Remover um cliente");
       System.out.println("3 – Alterar os dados de um cliente");
       System.out.println("4 – Consultar os dados de um cliente");
       System.out.println("5 – Exibir os dados de todos os clientes");
       System.out.println("6 - Encerrar programa");
       op = in.nextInt();
       switch(op){
           case 1: System.out.println("Informe o CPF do cliente: ");
           cpf = in.nextLine();
           in.nextLine();
               System.out.println("Informe o nome do cliente: ");
               nome = in.nextLine();
               System.out.println("Informe o e-mail do cliente: ");
               email = in.nextLine();
               
               System.out.println("Informe o número de telefone do cliente: ");
               fone = in.nextLine();
               
               Cliente c = new Cliente(cpf,nome,fone,email);
               clientes.inserirValorFinal(c);
               break;
           case 2: System.out.println("Informe o CPF do cliente a ser removido: ");
           cpf = in.nextLine();
           in.nextLine();
            c = new Cliente(cpf,"","","");
            clientes.removeNó(c);
            break;
           case 3: System.out.println("Informe o CPF do cliente para alteração de dados: ");
           cpf = in.nextLine();
           in.nextLine();
           alteraCliente(clientes,cpf);
           break;
           case 4: System.out.println("Informe o CPF do cliente a ser consultado: ");
           cpf = in.nextLine();
           in.nextLine();
           c = new Cliente (cpf,"","","");
           clientes.exibe1Item(c);
           break;
           case 5: System.out.println("LISTA DE TODOS OS CLIENTES CADASTRADOS");
           clientes.exibirLista();
           break;
           case 6: System.out.println("Até a próxima!");
           break;
           default: System.out.println("Opção inválida, digite novamente: ");
           break;
       }
       
   }while (op != 6);
    }
    
}
