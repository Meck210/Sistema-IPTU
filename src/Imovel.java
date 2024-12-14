import java.security.PublicKey;

public class Imovel{
    private int id;
    private double areaImovel;
    private double valorVenal;
    private Cadastro proprietario;


    public Imovel (int id, double areaImovel, double valorVenal) {
        this.id = id;
        this.areaImovel = areaImovel;
        this.valorVenal = valorVenal;
    }


    public void calcularIPTU() {


    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAreaImovel() {
        return areaImovel;
    }

    public void setAreaImovel(double areaImovel) {
        this.areaImovel = areaImovel;
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public Cadastro getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cadastro proprietario) {
        this.proprietario = proprietario;
    }
}
