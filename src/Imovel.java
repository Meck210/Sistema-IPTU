public class Imovel{
    private int id;
    private double areaImovel;
    private double valorVenal;
    private double aliquota;
    private Cadastro proprietario;


    public Imovel (int id, double areaImovel, double valorVenal, double aliquota) {
        this.id = id;
        this.areaImovel = areaImovel;
        this.valorVenal = valorVenal;
        this.aliquota = aliquota;
    }


    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
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

    public double calcularIPTU() {
        return (areaImovel * valorVenal) / aliquota / 100;
    }

    @Override
    public String
    toString() {
        return "Imovel{" +
                "id=" + id +
                ", areaImovel=" + areaImovel +
                ", valorVenal=" + valorVenal +
                ", aliquota=" + aliquota +
                ", proprietario=" + proprietario +
                '}';
    }
}
