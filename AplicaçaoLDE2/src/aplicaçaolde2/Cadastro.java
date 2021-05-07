
package aplicaçaolde2;
import java.util.Scanner;
import pacote.lde2.LDE;

public class Cadastro {
    private final LDE<Pessoa> pessoas;
    public Cadastro(){
        pessoas = new LDE<>();
    }
    public void cadastraRg(){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o RG da pessoa:");
        String rg = in.nextLine();
        System.out.println("Informe o nome da pessoa: ");
        String nome = in.nextLine();
        Pessoa pessoa = new Pessoa(rg, nome);
        pessoas.inserirValorFinal(pessoa);
    }
    public void cancelarCadastro(){
        pessoas.removerUltimo();
    }
    public void exibirPessoas(){
        pessoas.exibeLista();
    }
    public void verificaPresença(){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o RG da pessoa: ");
        String rg = in.nextLine();
        Pessoa procuraRg = new Pessoa (rg);
        pessoas.buscaItem(procuraRg);
    }
    public void qtdPessoas(){
        System.out.println("Pessoas presentes: " + pessoas.getQtd());
    }
    public void removeComBusca(){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o RG da pessoa a ser removida: ");
        String rg = in.nextLine();
        Pessoa removeRg = new Pessoa(rg);
        pessoas.remover(removeRg);
    }
}
