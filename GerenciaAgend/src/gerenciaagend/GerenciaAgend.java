
package gerenciaagend;
import br.agenda.management.Agenda;
import java.util.Scanner;
public class GerenciaAgend {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    Agenda agenda = new Agenda();
    int op;
        System.out.println("===========BEM VINDO A SUA AGENDA=============");
        do{
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover um contato");
            System.out.println("3 - Exibir lista de contatos");
            System.out.println("4 - Exibir apenas UM contato");
            System.out.println("5 - Alterar contato");
            System.out.println("6 - Encerrar agenda");
            op = in.nextInt();
            switch(op){
                case 1:
                    agenda.adicionaContato();
                    break;
                case 2:
                    agenda.removeContato();
                    break;
                case 3:
                    agenda.exibirContatos();
                    break;
                case 4:
                    agenda.exibe1Contato();
                    break;
                case 5:
                    agenda.alterarContato();
                    break;
                case 6:
                    System.out.println("AGENDA ENCERRADA");
                    break;
                default :
                    System.out.println("Comando inválido, digite novamente");
            }
        }while(op !=6);
    }
    
}
