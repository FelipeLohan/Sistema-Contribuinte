package entities;

public class Individual extends Contribuinte{
    private double gastoSaude;

    

    public Individual(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double pagarImposto(){
        double porcIndividual = 0;
        if(rendaAnual < 20000){
            porcIndividual = rendaAnual * 0.15;
        } else if(rendaAnual > 20000 && gastoSaude == 0){
            porcIndividual = rendaAnual * 0.25;
        } else if(rendaAnual > 20000 && gastoSaude > 0){
            porcIndividual = (rendaAnual * 0.25) - (gastoSaude / 2);
        }
            return porcIndividual;
    }

    public void status(){
        System.out.println("-----------------");
        System.out.println("TIPO: INDIVIDUAL");
        System.out.println("NOME: " + nome);
        System.out.printf("IMPOSTO: R$%.2f%n", pagarImposto());
    }
}
