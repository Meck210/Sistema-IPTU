import java.util.ArrayList;
import java.util.List;

public class ImovelComercial extends Imovel{


    public ImovelComercial(int id, double areaImovel, double valorVenal, double aliquota) {
        super(id, areaImovel, valorVenal, aliquota);
    }


    @Override
    public double calcularIPTU() {
        return super.calcularIPTU() * 0.25;
    }


    @Override
    public String toString() {
        return "Imovel Comercial: " + super.toString();
    }

}
