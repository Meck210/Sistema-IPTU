public class Cadastro extends Pessoa {
   private int cep;
   private String endereco;
   private int numberEndereco;



   public Cadastro(String nome, int idade, int cep, String email, String endereco, int numberEndereco) {
       super(nome, idade, email);
       this.cep = cep;
       this.endereco = endereco;
       this.numberEndereco = numberEndereco;
   }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumberEndereco() {
        return numberEndereco;
    }

    public void setNumberEndereco(int numberEndereco) {
        this.numberEndereco = numberEndereco;
    }


}
