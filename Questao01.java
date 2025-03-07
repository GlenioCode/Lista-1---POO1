import java.util.Scanner; // Importando a classe Scanner
class Questao01{
	public static void main (String[]args){
		// Criando um objeto Scanner para ler a entrada do salário
		Scanner scanner = new Scanner (System.in);
		
		// Pedindo para o usuário digitar o salário
		System.out.print("Digite seu salário: ");
		double salario = scanner.nextDouble(); // Lê a o salario
		
		//Pedindo para o usuário digitar o percentual
		System.out.print("Digite o percentual: ");
		double percentual = scanner.nextDouble(); //Lê o percentual
		
		double novoSalario = salario + (salario * percentual/100);
		
		//Exibindo o novo salario
		
		System.out.println("Seu novo salário é de: " + novoSalario);
		
		
		
	}
}