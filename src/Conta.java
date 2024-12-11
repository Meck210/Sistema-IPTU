import java.util.ArrayList;

public class Conta {
    Cadastro titular;
    Long numberIptu;
    ArrayList<Double> valoresIptu = new ArrayList<Double>();



    void setNumberIptu(Long numberIptu) {
        this.numberIptu = numberIptu;
    }

    void setValoresIptu(Double valoresIptu){
        this.valoresIptu.add(valoresIptu);
    }

    void exibirValores(){
        for (double valorIptu : valoresIptu){
            System.out.println(valorIptu);
        }
    }

    Long getNumberIptu() {
        return this.numberIptu;
    }



}
