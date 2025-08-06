package app;

import entities.ImpostoDeRenda;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa_Imposto {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List <ImpostoDeRenda> list= new ArrayList<>();

        System.out.println("Digite o número de pagadores:");
        Integer N= sc.nextInt();

        for(int i=0;i<N;i++) {
            System.out.println("Pagador " + (i+1) + ":");
            System.out.println("Pessoa Física ou Jurídica (f/j): ");
            char opcao = sc.next().trim().toUpperCase().charAt(0);
            sc.nextLine();
            if (opcao == 'F') {
                System.out.println("Nome:");
                String nome = sc.nextLine();
                System.out.println("Renda Anual:");
                Double renda = sc.nextDouble();
                System.out.println("Despesas com saúde:");
                Double despesas = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, despesas));
            }
            else if (opcao == 'J') {
                System.out.println("Nome:");
                String nome = sc.nextLine();
                System.out.println("Renda Anual:");
                Double renda = sc.nextDouble();
                System.out.println("Número de Funcionários: ");
                Integer funcionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, funcionarios));
            }
            else if (opcao != 'f' && opcao != 'j') {
                System.out.println("Opcao Inválida");
                i--;
            }
        }
        System.out.println("Resultados:");
        for(ImpostoDeRenda Resultado:list) {
            System.out.println(Resultado);
        }

        double soma=0;
        for(ImpostoDeRenda Resultado:list) {
            soma += Resultado.calculoImposto();
        }
        System.out.println("Total de Impostos Pagos:");
        System.out.println(String.format("R$%.2f",soma));

    }
}
