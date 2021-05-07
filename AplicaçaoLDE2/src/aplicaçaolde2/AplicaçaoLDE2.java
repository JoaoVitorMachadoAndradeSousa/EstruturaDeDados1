
package aplicaçaolde2;

import java.util.Scanner;


public class AplicaçaoLDE2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro c = new Cadastro();
        int op;
        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    c.cadastraRg();
                    break;
                case 2:
                    c.cancelarCadastro();
                    break;
                case 3:
                    c.verificaPresença();
                    break;
                case 4:
                    c.exibirPessoas();
                    break;
                case 5:
                    c.qtdPessoas();
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Ainda não implementado");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("1 -Cadastrar");
        System.out.println("2 -Cancelar cadastro");
        System.out.println("3 -Verificar presença");
        System.out.println("4 -Exibir lista");
        System.out.println("5 -Exibir a quantidade de pessoas presentes");
        System.out.println("0 -Encerrar");
    }
    }
    

