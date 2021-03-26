
package br.agenda.management;
import br.pacote.agenda.LSESemRepetidosOrdenada;

import java.util.Scanner;

public class Agenda {
    private LSESemRepetidosOrdenada<Contato> contatos;
    public Agenda(){
        contatos = new LSESemRepetidosOrdenada<Contato>();
        
    }
    public void adicionaContato(){
        Scanner in = new Scanner (System.in);
        String nome, telefone, email;
        System.out.println("Informe o nome do contato: ");
         nome = in.nextLine();
         System.out.println("Informe o número de telefone do contato: ");
         telefone = in.nextLine();
         System.out.println("Informe o e-mail do contato: ");
         email = in.nextLine();
         Contato contato = new Contato(nome,telefone,email);
         contatos.adicionaContato(contato);
         
    }
    public void removeContato(){
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.println("Informe o nome do contato a ser removido: ");
        nome = in.nextLine();
        Contato nomeContato = new Contato (nome,"","");
        contatos.removeContato(nomeContato);
    }
    public void exibe1Contato(){
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.println("Informe o nome do contato a ser exibido: ");
        nome = in.nextLine();
        Contato exibeContato = new Contato(nome,"","");
        contatos.exibe1Contato(exibeContato);
    }
    public void exibirContatos(){
        contatos.exibeContatos();
    }
    /*
    public void alteraContato(Contato telefone, Contato mail){
        Scanner in = new Scanner(System.in);
        String nome, fone, email;
        int op;
        System.out.println("Digite o nome do contato para alteração de dados: ");
        nome = in.nextLine();
        Contato contato = new Contato(nome,"","");
        if(contatos.buscaItem(contato) != null){
            System.out.println("1- Alterar número de telefone do contato");
             System.out.println("2 - Alterar e-mail do contato");
             System.out.println("3 - Voltar ao menu");
             op = in.nextInt();
             switch(op){
                 case 1:
                     System.out.println("Informe o número de telefone do contato: ");
                     fone = in.nextLine();
                     telefone.setTelefone(fone);
                     System.out.println("Número de telefone do contato alterado.");
                     break;
                 case 2:
                     System.out.println("Informe o e-mail do contato:");
                     email = in.nextLine();
                     mail.setEmail(email);
                     System.out.println("E-mail do contato alterado");
                     break;
                 case 3:
                     System.out.println("Voltando ao menu...");
                     break;
                 default: 
                     System.out.println("Opção inválida.");
                     break;
             }
        }else{
            System.out.println("Contato não encontrado/ cadastrado!");
        }
    }
*/
    public void alterarContato(){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do contato a ser alterado: ");
        String nome = in.nextLine();
        Contato c = new Contato(nome,"","");
        if(c != null){
            int op;
            System.out.println("1 - Alterar telefone do contato");
            System.out.println("2 - Alterar email do contato");
            System.out.println("3 - Voltar ao menu");
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.println("Informe o número de telefone do contato: ");
                    String fone = in.nextLine();
                    in.nextLine();
                    Contato foneEdit = new Contato("",fone,"");
                    foneEdit.setTelefone(fone);
                    break;
                case 2: 
                    System.out.println("Informe o email do contato alterado.");
                    String mail = in.nextLine();
                    in.nextLine();
                    Contato mailEdit = new Contato("","",mail);
                    mailEdit.setTelefone(mail);
                    break;
                case 3:
                    System.out.println("Voltando ao menu...");
                    break;
                default:
                    System.out.println("Comando inválido");
                     
               
            }
        }
    }
    
}
