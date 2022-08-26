package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.salario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		salario emp = new salario();
		
		System.out.print("Nome: ");
		emp.nome =sc.nextLine();
		System.out.print("Salario Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.print("Qual percentual para aumentar o salário? ");
		double porcentagen = sc.nextDouble();
		emp.increaseSalary(porcentagen);
		System.out.println();
		System.out.println("Dados atualizados: " + emp);
		sc.close();
		
		sc.close();

	}

}
