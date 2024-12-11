//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cadastro titular = new Cadastro();
        titular.nome = "Matheus";
        titular.cep = 49030210;
        titular.endereco = "Av maria pastora";
        Conta conta = new Conta();
        conta.setNumberIptu(10_203_108_912L);
        conta.setValoresIptu(10.000);
        conta.setValoresIptu(1.200);
        conta.setValoresIptu(500.00);


        System.out.println("titular: " + titular.nome + "\ncep do titular: " + titular.cep);
        System.out.println("Endereço titular: " + titular.endereco);
        System.out.println("Numero do iptu: " + conta.getNumberIptu());
        System.out.println("Valores do Iptu: ");
        conta.exibirValores();


    }
}