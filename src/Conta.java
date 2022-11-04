import javax.swing.JOptionPane;

public class Conta {
    int quantContas = 1;
    int nConta; 
    int nunAgencia = 1;
    private Double saldo;

    // GET
    public Double getSaldo() {
        return saldo;
    }
    public int getConta() {
        return quantContas;
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

    public void depositar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar"));
        if(valor >= 0){
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Depósito concluído!");
        }else {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o depósito, tente novamente mais tarde!");
        }
    }

    public void sacar() {
        double valSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto você deseja sacar hoje?"));
        if (saldo > 0 && saldo <= valSaque){
            saldo = saldo - valSaque;
        }else{
            JOptionPane.showMessageDialog(null, "Não é possivel realizar o saque deste valor");
        }

    }

    public void transferir() {
        double valSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto você deseja sacar hoje?"));
        if (saldo > 0 && saldo <= valSaque){
            saldo = saldo - valSaque;
        }else{
            JOptionPane.showMessageDialog(null, "Não é possivel realizar o saque deste valor");
        }
    }
    
    
}