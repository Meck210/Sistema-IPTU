import java.util.ArrayList;

public class Conta {
    private Cadastro titular;
    private Long numberIptu;
    private ArrayList<Double> valoresIptu;


    public Conta(Long numberIptu, ArrayList<Double> valoresIptu) {
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

    public void exibirValor() {
        for (Double valor : valoresIptu) {
            System.out.println(valor);
        }
    }


    public void setTitular(String nome, int cep) {

    }
}
