
package listase2;

import java.util.Scanner;


public class Produto {
    private String codigo;
    private String desc;
    private float preço;
    private int estoque;
    public Produto(String codigo, String desc, float preço, int estoque){
        this.setCod(codigo);
        this.setDesc(desc);
        this.setPreço(preço);
        this.setEstoque(estoque);
    }
    private void setCod(String codigo){
        this.codigo = codigo;
    }
    public String getCod(){
        return this.codigo;
    }
    private void setDesc (String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }
    private void setPreço(float preço){
        this.preço = preço;
    }
    public float getPreço (){
        return this.preço;
    }
    private void setEstoque (int estoque){
        this.estoque = estoque;
    }
    public int getEstoque (){
        return this.estoque;
    }
    public void alteraPreço(float valor){
        if(valor > 0){
            this.setPreço(preço);
            System.out.println("Preço alterado");
        }else{
            System.out.println("Preço inválido");
            System.out.println("Digite um valor acima de zero.");
        }
        
    }
    public void alteraEstoque (int estoque){
        if(estoque >= 0){
            this.setEstoque(estoque);
            System.out.println("Estoque alterado");
        }else{
            System.out.println("Quantidade inválida");
            System.out.println("Digite um valor acima de zero.");
        }
    }
    public void alteraItem(){
        Scanner in = new Scanner (System.in);
        int op, estoque;
        float preço;
        System.out.println("O que deseja alterar? 1 para preço // 2 para estoque");
        op = in.nextInt();
        while(op != 1 && op != 2){
            System.out.println("Opção inválida.");
            System.out.println("Digite novamente. 1 para alterar o preço // 2 para alterar o estoque");
            op = in.nextInt();
        }switch(op){
            case 1:
                System.out.println("Informe o novo preço do produto: ");
                preço = in.nextFloat();
                alteraPreço(preço);
                break;
            case 2:
                System.out.println("Informe a nova quantidade do estoque: ");
                estoque = in.nextInt();
                alteraEstoque(estoque);
                break;
        }
        
            
        
    }
    public int compareTo(Produto p) {
		return this.getCod().compareTo(p.getCod());
	}
    public String toString(){
        return "Código do produto: " + this.getCod() + "Descrição: " + this.getDesc() + "Preço: R$" + this.getPreço() + "Estoque: " + this.getEstoque();
    }
          
}


