package entities;

public abstract class Contribuinte {
    protected String nome;
    protected Double pagamentoAnual;

    public abstract double contribuir();
}
