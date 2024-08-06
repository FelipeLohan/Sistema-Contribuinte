import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Empresa;
import entities.Individual;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        List<Contribuinte> contribuintes = new ArrayList<>();
            
            do{
                System.out.println("-----SISTEMA DE IMPOSTO-----");
                System.out.println("1 - PESSOA INDIVIDUAL");
                System.out.println("2 - EMPRESA JURIDICA");
                System.out.println("3 - Sair");
                    opcao = teclado.nextInt();
                        teclado.nextLine();
                            switch (opcao) {
                                case 1:
                                    System.out.println("Nome da Pessoa: ");
                                        String nomeIndividual = teclado.nextLine();
                                    System.out.println("Renda Anual:");
                                        double rendaAnualIndividual = teclado.nextDouble();
                                            teclado.nextLine();
                                    System.out.println("Gastos com saude:");
                                        double gastoSaude = teclado.nextDouble();
                                            teclado.nextLine();
                                            contribuintes.add(new Individual(nomeIndividual, rendaAnualIndividual, gastoSaude));    
                                    break;
                                case 2:
                                    System.out.println("Nome da empresa:");
                                        String nomeEmpresa = teclado.nextLine();
                                    System.out.println("Renda Anual:");
                                        double rendaAnualEmpresa = teclado.nextDouble();
                                            teclado.nextLine();
                                    System.out.println("Numero de Funcionarios");
                                        int numeroFuncionarios = teclado.nextInt();
                                            teclado.nextLine();
                                                contribuintes.add(new Empresa(nomeEmpresa, rendaAnualEmpresa, numeroFuncionarios));
                                    break;
                                case 3:
                                    for (Contribuinte contribuinte : contribuintes) {
                                    contribuinte.status();
                                    }
                                        System.out.println("Obrigado por usar o sistema!");
                                    break;    
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }
            } while(opcao != 3);
    }
}
