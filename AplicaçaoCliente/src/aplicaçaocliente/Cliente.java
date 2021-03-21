
package aplicaçaocliente;


public class Cliente implements Comparable<Cliente>{
    private String cpf;
    private String nome;
    private String fone;
    private String email;
    public Cliente(String cpf, String nome, String fone, String email){
        this.setCpf(cpf);
        this.setNome(nome);
        this.setFone(fone);
        this.setEmail(email);
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setFone(String fone){
        this.fone = fone;
    }
    public String getFone(){
        return this.fone;
        
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public int compareTo(Cliente c) {
		return this.getCpf().compareTo(c.getCpf());
	}
    @Override
     public String toString(){
        return "CPF: " + this.getCpf() + 
                "NOME: " + this.getNome() +
                "FONE: " + this.getFone() +
                "E-MAIL: " + this.getEmail();
    }
}
