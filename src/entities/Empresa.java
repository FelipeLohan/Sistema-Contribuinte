package entities;

public class Empresa extends Contribuinte{

    private int numeroFuncionarios;

    

    public Empresa(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double pagarImposto(){
        double porcEmpresa = 0;
        if(numeroFuncionarios > 10){
            porcEmpresa = rendaAnual * 0.14;
             
        } else{
            porcEmpresa = rendaAnual * 0.16;
        }
            return porcEmpresa;
    }

    public void status(){
        System.out.println("-----------------");
        System.out.println("TIPO: EMPRESA");
        System.out.println("NOME: " + nome);
        System.out.printf("IMPOSTO: R$%.2f%n", pagarImposto());
    }
}
