package entidades;

public class salario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double netSalary() {
		return salarioBruto - imposto;
	}
	
	public void increaseSalary(double porcentagen) {
		salarioBruto += salarioBruto * porcentagen / 100.0; 
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSalary());
		}
}
