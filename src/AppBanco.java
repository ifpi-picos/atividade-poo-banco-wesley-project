import javax.swing.JOptionPane;

public class AppBanco {
    public static void main(String[] args) {
        Cliente cliente = getCliente();

        Endereco endereco = getEndereco();

        Conta conta =  gerarConta();
    }
    public static Cliente getCliente(){

        JOptionPane.showMessageDialog(null, "Vamos iniciar seu cadastro, ok?");
        Cliente cliente = new Cliente();
        String confirmaSenha = null;
        boolean valido = false;
        cliente.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        cliente.setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF: "));
        cliente.setDataNasc(JOptionPane.showInputDialog(null, "Digite sua data de nascimentowe: "));
        cliente.setEmail(JOptionPane.showInputDialog(null, "Digite seu Email: "));
        cliente.setSenha(JOptionPane.showInputDialog(null, "Digite sua senha de acesso: "));
        confirmaSenha = JOptionPane.showInputDialog(null, "Digite novamente a sua senha: ");

        if(cliente.getSenha().equals(confirmaSenha)){
            valido = true;
            JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!");
        }else{
            while (!valido){
                JOptionPane.showMessageDialog(null, "Senhas divergentes, digite novamente");
                cliente.setSenha(JOptionPane.showInputDialog(null, "Digite sua senha de acesso: "));
                confirmaSenha = JOptionPane.showInputDialog(null, "Digite novamente a sua senha: ");
                valido = cliente.getSenha().equals(confirmaSenha);
                if (cliente.getSenha().equals(confirmaSenha)){
                    JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!");
                }
            }
        }
    return cliente;
    }

    public static Endereco getEndereco(){
        Endereco endereco = new Endereco();
        endereco.setRua(JOptionPane.showInputDialog("Digite o nome da sua rua: "));
        endereco.setBairro(JOptionPane.showInputDialog("Digite o nome do seu bairro: "));
        endereco.setNCasa(Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da casa: ")));
        endereco.setRef(JOptionPane.showInputDialog("Referência: "));
        
    return endereco;
    }
    
    public static Conta gerarConta() {
        Conta conta = new Conta();
        conta.setConta(conta.getQuantContas());
        JOptionPane.showMessageDialog(null, "daremos inicio ao seu cadastro de conta");
        JOptionPane.showMessageDialog(null, "Seus dados são:\nConta: " + conta.getConta()+"\nAgencia: "+conta.getAgencia()+"");
        conta.setQuantContas((conta.getQuantContas()) + 1);
    return conta;
    }
    
    /*private static Conta validarConta(int nunConta) {
            Conta conta = null;
            if (informacoes.contasClientes.size() > 0){
                for(Conta c: contasClientes) {
                    if (c.getConta() == numConta);
                    conta = c;
                }
            }
    }*/

    /*private void login(){
        int usuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Dgite o número da conta"));
        String userSenha = JOptionPane.showInputDialog(null, "Digite sua senha");

        if (usuario: contasCliente[]){
            String name = nomesClientes[usuario+1]
            if (conta)
        }else{
            JOptionpane.showMessageDialog(null, "Usuário ou senha incorretos!");
        }

    }*/


    public static Menu menuEscolha(String[] args){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo ao ZARD BANK\n"+
        "\nComo podemos te ajudar hoje? "+
        "\n|        1 - Depositar           |\n"+
        "\n|        2 - Transferir          |"+
        "\n|        3 - Sacar               |"+
        "\n|        4 - Conferir dados      |"+
        "\n|        5 - Sair                |"));

        switch(opcao){
        case 1: conta.depositar(); break;
        case 2: conta.transferir(); break;
        case 3: conta.sacar(); break;
        case 4: conta.conferirDados(); break;
        case 5:
            JOptionPane.showMessageDialog(null, "A ZARD BANK fica feliz em ter você como cliente, esperamos você de volta");
            System.exit(opcao); break;
        default : 
            JOptionPane.showMessageDialog(null, "Hummm, algo de errado não esta certo!\nque tal digitar novamente o número referente a opção?");
        }
    }
}
