
package br.agenda.management;


public class Contato implements Comparable<Contato> {
    private String nome;
    private String telefone;
    private String email;
    public Contato(String nome,String telefone, String email){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public int compareTo(Contato contato){
        return this.getNome().compareTo(contato.getNome());
    }

    @Override
    public String toString(){
       return "Nome: " + this.getNome() + "\n" +  
                "Telefone: " + this.getTelefone() + "\n" + 
                "E-mail: " + this.getEmail();
        
    }
    }

