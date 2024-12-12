import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<>();

        int opc = 0;

        while (opc != 3) {
            System.out.println("--------------SISTEMA DE IPTU---------------");
            System.out.println("-----------Digite a Opcao do Sistema IPTU--------------");
            System.out.println("Digite a opcao: ");
            System.out.println("1 - Fazer Cadastro");
            System.out.println("2 -Ver iptus ");
            System.out.println("3 -Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    cadastroUser();
                    break;
                case 2:
                    verIPTU();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        }
    }
    public static void cadastroUser() {
        System.out.println("Digite o NOME do usuario: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CEP: ");
        int cep = sc.nextLine();
        System.out.println("Digite o ENDEREÇO: ");
        String endereco = sc.nextLine();
        System.out.println("Digite o NUMERO DO ENDEREÇO: ");

    }
}
