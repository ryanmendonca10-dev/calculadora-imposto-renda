package entities;

public abstract class ImpostoDeRenda {
    private String nome;
    private double rendaAnual;

    public ImpostoDeRenda() {
    }

    public ImpostoDeRenda(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual= rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double calculoImposto();

    public String toString() {
        return  nome
                +": "
                + String.format("R$%.2f",calculoImposto());


    }

}

