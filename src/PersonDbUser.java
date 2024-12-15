import java.util.ArrayList;
import java.util.List;

public class PersonDbUser implements DbUser{
    private List<Cadastro> cadastros = new ArrayList<>();

    public void addCadastro(Cadastro cadastro) {
        cadastros.add(cadastro);
    }

    public void exibirCadastro() {
        if (cadastros.isEmpty()) {
            System.out.println("cadastro nao encontrado!!");
        } else {
            for (Cadastro cadastro : cadastros) {
                System.out.println("Nome: " + cadastro.getNome());
                System.out.println("Idade: " + cadastro.getIdade());
                System.out.println("Cep: " + cadastro.getCep());
                System.out.println("Endereço: " + cadastro.getEndereco() + " Numero: " + cadastro.getNumberEndereco());
            }
        }
    }

    @Override
    public List<Cadastro> getCadastros() {
        return cadastros;
    }
}
