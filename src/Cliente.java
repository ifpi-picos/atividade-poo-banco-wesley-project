import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String dataNasc;

    //GET
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public String getDataNasc(){
        return dataNasc;
    }

    //SET
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    public void setCpf(String novoCpf){
        cpf = novoCpf;    
    }
    public void setEmail(String novoEmail){
        email = novoEmail;
    }
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }

    
    public void conferirDados(){
        JOptionPane.showMessageDialog(null,"Nome: " +getNome());
        JOptionPane.showMessageDialog(null,"CPF: " +getCpf());
        JOptionPane.showMessageDialog(null,"Email: " +getEmail());
    }

    /*public void pessoa(){ 
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha;
        counter += 1;
    }*/

}
