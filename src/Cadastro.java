public class Cadastro { private int id;
   private String nome;
   private int cep;
   private String endereco;
   private int numberEndereco;


   public Cadastro(String nome, int cep, String endereco, int numberEndereco) {
       this.id = id;
       this.nome = nome;
       this.cep = cep;
       this.endereco = endereco;
       this.numberEndereco = numberEndereco;
   }

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
