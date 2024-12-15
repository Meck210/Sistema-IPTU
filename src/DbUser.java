import java.util.List;

public interface DbUser {

    void addCadastro(Cadastro cadastro);

    void exibirCadastro();

    List<Cadastro> getCadastros();
}