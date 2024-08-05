package entities;

public abstract class Contribuinte {
    protected String nome;
    protected Double rendaAnual;

    public abstract double pagarImposto();
}
