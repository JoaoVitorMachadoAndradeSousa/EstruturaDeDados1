
package aplicaçaocliente;

import cadastro.cliente.LSESemRepetidos;
import java.util.Scanner;
public class CadastroCliente  {
    private int qtd;
    public CadastroCliente(){
     LSESemRepetidos<Cliente> clientes = new LSESemRepetidos();
    }
    public static void alteraCliente(LSESemRepetidos<Cliente> clientes, String cpf){
        Scanner in = new Scanner(System.in);
        Cliente cliente, result;
        int op;
        String fone, email;
        cliente = new Cliente(cpf,"","","");
        result = clientes.buscaObjeto(cliente);
        if(result == null){
            System.out.println("Cliente não encontrado!");
        }else{
            System.out.println("1 - para alterar o e-mail ");
            System.out.println("2 - para alterar o número de telefone");
            op = in.nextInt();
            in.nextLine();
            while(op != 1 && op != 2){
                System.out.println("Opção inválida");
                System.out.println(" 1 - para alterar o e-mail ");
                 System.out.println("2 - para alterar o número de telefone");
                  op = in.nextInt();
                  in.nextLine();
            }
            if(op == 1){
                System.out.println("Digite o novo e-mail a ser cadastrado: ");
                email = in.nextLine();
                result.setEmail(email);
                
            }else if(op == 2){
                System.out.println("Digite o novo número de telefone a ser cadastrado: ");
                fone = in.nextLine();
                result.setFone(fone);
        }
        
    }
    
        
        
    }
}

