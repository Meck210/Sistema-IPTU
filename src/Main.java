import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static PersonDbUser dbUser = new PersonDbUser();

    public static void main(String[] args) {


        int opc;

        while (true) {
            System.out.println("--------------SISTEMA DE IPTU---------------");
            System.out.println("-----------Digite a Opcao do Sistema IPTU--------------");
            System.out.println("----------------------------------------------------------------");
            System.out.println("1 - Fazer Cadastro");
            System.out.println("2 - Calcular IPTU");
            System.out.println("3 - Mostrar Usuarios Cadastrados");
            System.out.println("4 - Sair");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    cadastroUser();
                    break;
                case 2:
                    dbUser.exibirCadastro();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        }
    }

    public static void cadastroUser() {
        System.out.println("Digite o NOME do usuario: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o CEP: ");
        int cep = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe seu EMAIL: ");
        String email = sc.nextLine();
        System.out.println("Digite o ENDEREÇO: ");
        String endereco = sc.nextLine();
        System.out.println("Digite o NUMERO DO ENDEREÇO: ");
        int numberEndereco = sc.nextInt();
        sc.nextLine();

        Cadastro novoCadastro = new Cadastro(nome, idade, cep, email, endereco, numberEndereco);
        dbUser.addCadastro(novoCadastro);
        System.out.println("Cadastro realizo");
    }
}
