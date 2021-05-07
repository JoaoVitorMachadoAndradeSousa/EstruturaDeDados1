package aplicaçaolde4;

import java.util.Scanner;
import lista.lde.quatro.LDE;

public class AplicaçaoLDE4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDE<Integer> numeros = new LDE();
        int op, n;
        do {
            menu();
            op = in.nextInt();
            System.out.println("-----------------------");
            switch (op) {
                case 1:
                    System.out.println("Informe o número:");
                    n = in.nextInt();
                    numeros.inserirOrdenadoDecrescente(n);
                    break;
                case 2:
                    System.out.println("Informe o número para remoção:");
                    n = in.nextInt();
                    numeros.remover(n);
                    break;
                case 3:
                    numeros.exibeListaDecrescente();
                    break;
                case 4:
                    numeros.exibeListaCrescente();
                    break;
                case 5:
                    System.out.println("Informe o item para exibição: ");
                    n = in.nextInt();
                    numeros.exibe1Item(n);
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("Menu de opções:");
        System.out.println("1-Inserir número no final da lista.");
        System.out.println("2-Remover com busca");
        System.out.println("3-Exibir lista -> decrescente ");
        System.out.println("4-Exibir lista -> crescente");
        System.out.println("5-Exibir um item");
        System.out.println("0-Sair do programa.");
        System.out.println("Escolha uma opção:");
    }
}


