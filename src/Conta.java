import java.util.ArrayList;

public class Conta {
    int quantContas = 1;
    int nConta; 
    int nunAgencia = 1;
    private Double saldo;

    ArrayList<Conta> contas = new ArrayList<>();

    // GET
    public Double getSaldo() {
        return saldo;
    }
    public int getConta() {
        return nConta;
    }
    public int getAgencia() {
        return nunAgencia;
    }
    public int getQuantContas() {
        return quantContas;
    }
    // SET
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void setQuantContas(int quantContas){
        this.quantContas = quantContas;
    }
    public void setAgencia(int nunAgencia){
        this.nunAgencia = nunAgencia;
    }
    public void setConta(int nConta){
        this.nConta = nConta;
    }

    // Funções
    
}