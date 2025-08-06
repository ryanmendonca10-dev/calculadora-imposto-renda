package entities;


public class PessoaFisica extends ImpostoDeRenda {
    private double saude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, double rendaAnual, double saude) {
        super(name, rendaAnual);
        this.saude = saude;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }

    @Override
    public double calculoImposto() {
        if (getRendaAnual() < 20000) {
             return (getRendaAnual() * 15/ 100) - (getSaude() * 50 / 100);

        } else  {
           return  (getRendaAnual() * 25 / 100) - (getSaude() * 50 / 100);

        }

    }

}
