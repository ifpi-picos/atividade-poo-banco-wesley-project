import javax.swing.JOptionPane;
import java.lang.Integer;

public class AppBanco {
    public static void main(String[] args) {
        Cliente cliente = getCliente();

        Endereco endereco = getEndereco();

        Conta conta =  gerarConta();

        AppBanco menu = menuEscolha(args);
    }
    public static Cliente getCliente(){

        JOptionPane.showMessageDialog(null, "Vamos iniciar seu cadastro, ok?");
        Cliente cliente = new Cliente();
        String confirmaSenha = null;
        boolean valido = false;
        cliente.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        cliente.setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF: "));
        cliente.setDataNasc(JOptionPane.showInputDialog(null, "Digite sua data de nascimento: "));
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
        endereco.setNCasa(Integer.parseInt(JOptionPane.showInputDialog("Digite o n?? da casa: ")));
        endereco.setRef(JOptionPane.showInputDialog("Refer??ncia: "));
        
    return endereco;
    }
    
    public static Conta gerarConta() {
        Conta conta = new Conta();
        conta.setConta(conta.getQuantContas());
        conta.setSaldo(0.0);
        JOptionPane.showMessageDialog(null, "Daremos inicio ao seu cadastro de conta");
        JOptionPane.showMessageDialog(null, "Seus dados s??o:\n\nN??mero da Conta: " + conta.getConta()+"\nAgencia: "+conta.getAgencia()+
        "\nSaldo: R$ "+conta.getSaldo());
        conta.contas.add(conta);
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
        int usuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Dgite o n??mero da conta"));
        String userSenha = JOptionPane.showInputDialog(null, "Digite sua senha");

        if (usuario: contasCliente[]){
            String name = nomesClientes[usuario+1]
            if (conta)
        }else{
            JOptionpane.showMessageDialog(null, "Usu??rio ou senha incorretos!");
        }

    }*/

    public static AppBanco menuEscolha(String[] args){
        Conta acoes = new Conta();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo ao ZARD BANK\n"+
        "\nComo podemos te ajudar hoje? "+
        "\n|        1 - Depositar           |\n"+
        "\n|        2 - Transferir          |"+
        "\n|        3 - Sacar               |"+
        "\n|        4 - Ver saldo           |"+
        "\n|        5 - Sair                |"));

        switch(opcao){
        case 1: 
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar"));
            if(valor >= 0){
                acoes.setSaldo(acoes.getSaldo() + valor);
                JOptionPane.showMessageDialog(null, "Dep??sito conclu??do!");
            }else {
                JOptionPane.showMessageDialog(null, "N??o foi possivel realizar o dep??sito, tente novamente mais tarde!");
            }
            break;
        case 2:     
            int contaRemetente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a conta de destino"));
            if (contaRemetente : acoes.contas<>){
                double valorTransf = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da transferencia?"));
                if (acoes.getSaldo() > 0 && acoes.getSaldo() <= valorTransf){
                    acoes.setSaldo(acoes.getSaldo()-valorTransf);
                }else{
                    JOptionPane.showMessageDialog(null, "N??o ?? possivel realizar a transferencia deste valor");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Conta n??o encontrada");
            }
            break;
        case 3: 
            double valSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto voc?? deseja sacar hoje?"));
            if (acoes.getSaldo() > 0 && acoes.getSaldo() <= valSaque){
                acoes.setSaldo(acoes.getSaldo()- valSaque);
                JOptionPane.showMessageDialog(null, "Voc?? sacou R$ "+valSaque+", Lembre-se, cuidar das finan??as faz bem para o bolso!");
            }else{
                JOptionPane.showMessageDialog(null, "N??o ?? possivel realizar o saque deste valor");
            }
            break;
        case 4: 
            int case4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seu saldo em conta ??: R$ "+acoes.getSaldo()+
            "\nGostaria de retornar ao Menu de op????es ou encerrar o atendimento?"+
            "\nDigite o n??mero referente a op????o de seu interesse:\n"+
            "\n1 - Retornar ao Menu\n2 - Encerrar o atendimento"));
            if (case4 == 1){
                return menuEscolha(args);
            }else if(case4 == 2){
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos servi??os");;
            }else {
                JOptionPane.showMessageDialog(null, "Op????o inv??lida, Retornaremos para o menu de escolhas");
                return menuEscolha(args);
            } 
            break;
        case 5:
            JOptionPane.showMessageDialog(null, "A ZARD BANK fica feliz em ter voc?? como cliente, esperamos voc?? de volta");
            System.exit(opcao); break;
        default : 
            JOptionPane.showMessageDialog(null, "Hummm, algo de errado n??o esta certo!\nque tal digitar novamente o n??mero referente a op????o?");
            return menuEscolha(args);
        
        }
    }
