import java.util.ArrayList;
import java.util.List;

public class ImovelResidencial extends Imovel{

    public ImovelResidencial(int id, double areaImovel, double valorVenal, double aliquota) {
        super(id, areaImovel, valorVenal, aliquota);
    }


    @Override
    public double calcularIPTU() {
        return super.calcularIPTU();
    }


    @Override
    public String toString() {
        return "Imovel Residencial: " + super.toString();
    }

}
