import java.util.ArrayList;

public class Conta {
    private Cadastro titular;
    private Long numberIptu;
    private double valoresIptu;


    public Conta(Long numberIptu, double valoresIptu) {
        this.numberIptu = numberIptu;
        this.valoresIptu = valoresIptu;

        }

    public Cadastro getTitular() {
        return titular;
    }

    public void setTitular(Cadastro titular) {
        this.titular = titular;
    }

    public Long getNumberIPTU() {
        return numberIptu;
    }

    public void setNumberIPTU(Long numberIPTU) {
        this.numberIptu = numberIPTU;
    }

}



