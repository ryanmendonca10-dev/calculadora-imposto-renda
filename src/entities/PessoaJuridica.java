package entities;

public class PessoaJuridica  extends ImpostoDeRenda {
    private int numeroDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, double rendaAnual, int numeroDeFuncionarios) {
        super(name, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double calculoImposto() {
        if (getNumeroDeFuncionarios() <= 10) {
            double resultado= (getRendaAnual() * 16/100);
            return resultado;
        }else {
            double resultado= (getRendaAnual() * 14/100);
            return resultado;
        }

    }
}
