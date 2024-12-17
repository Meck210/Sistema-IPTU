import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static DbUser dbUser = new PersonDbUser();

    private static ImovelResidencial addResi;
    private static ImovelComercial addCom;


    public static void main(String[] args) {
        mockCadastro();

        System.out.println("--------------------------------------------------------------");

        int opc;

        while (true) {
            System.out.println("--------------SISTEMA DE IPTU---------------");
            System.out.println("-----------Digite a Opcao do Sistema IPTU--------------");
            System.out.println("----------------------------------------------------------------");
            System.out.println("1 - Fazer Cadastro");
            System.out.println("2 - Mostrar Usuarios Cadastrados");
            System.out.println("3 - OPCÇOES DE IPTU");
            System.out.println("4 - Exibir Usuario e IPTU a ser pago");
            System.out.println("0 - Sair");

            try {
                opc = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Digite um numero valido!!");
                sc.nextLine();
                continue;
            }


            switch (opc) {
                case 1:
                    cadastroUser();
                    break;
                case 2:
                    dbUser.exibirCadastro();
                    exibirIptu();
                    break;
                case 3:
                    showIPTU();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        }
    }

    public static void cadastroUser() {
        int idade = 0;

        System.out.println("Digite o NOME do usuario: ");
        String nome = sc.nextLine().toLowerCase();

        while (true) {
            try {
                System.out.println("Informe sua idade: ");
                sc.nextInt();
                if (idade < 0) {
                    System.out.println("Idade invalida, nao pode ser negativa!!!");
                } else {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada Invalida, digite um numero inteiro para idade!!");
                sc.nextLine();
            }
        }

        sc.nextLine();
        System.out.println("Digite o CEP: ");
        int cep = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe seu EMAIL: ");
        String email = sc.nextLine().toLowerCase();
        System.out.println("Digite o ENDEREÇO: ");
        String endereco = sc.nextLine().toLowerCase();
        System.out.println("Digite o NUMERO DO ENDEREÇO: ");
        int numberEndereco = sc.nextInt();
        sc.nextLine();

        Cadastro novoCadastro = new Cadastro(nome, idade, cep, email, endereco, numberEndereco);
        dbUser.addCadastro(novoCadastro);
        System.out.println("Cadastro realizo");
    }

    public static void mockCadastro() {
        dbUser.addCadastro(new Cadastro("claudia", 49, 49030210, "claudiaregi1200@gmail.com", "av maria pastora", 260));
    }

    public static void showIPTU() {
        int choice;


        do {
            System.out.println("=======OPCOES DE IPTU========");
            System.out.println("1 - IPTU RESIDENCIAL");
            System.out.println("2 - IPTU COMERCIAL");
            System.out.println("0 - SAIR");


            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Informe o valor do m2: ");
                    double m2Res = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o valor Venal do imovel: ");
                    double valorVenalRes = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Informe a Aliquota do Estado ");
                    double aliquotaRes = sc.nextDouble();
                    sc.nextLine();

                    addResi = new ImovelResidencial(1, m2Res, valorVenalRes, aliquotaRes);
                    addResi.calcularIPTU();

                    break;
                case 2:
                    if (addCom != null) {
                        System.out.println("IPTU do Imóvel Comercial calculado com sucesso: R$ " + addCom.calcularIPTU());
                    } else {
                        System.out.println("Imóvel Comercial ainda não foi cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("SAINDOOO");
                    return;
                default:
                    System.out.println("Invalido digite um numero da opcao!!");
            }
        } while (true);
    }

    public static void exibirIptu() {

        if (addResi != null) {
            System.out.println("Imovel Residencial");
            System.out.println(addResi);
            System.out.println("Valor IPTU " + addResi.calcularIPTU());
        }
        else {
            System.out.println("valor nao cadastrado");
        }
    }
}
