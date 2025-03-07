import java.util.Scanner; //importando a classe Scanner
class Questao05{
	public static void main (String[]args){
		//Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		//perguntando qual o salário do usuário
		System.out.print("Digite seu salário: ");
		double salario = scanner.nextDouble(); //Lê uma linha de texto (salario)
		
		// Calculando a gratificação
		
		double gratificacao = salario * 0.05;
		
		// Calculando o imposto
		
		double imposto = salario * 0.07;
		
		// Calculando o salario final
		
		double salarioFinal = salario + gratificacao - imposto ;
		
		//Mostrando o resultado
		
		System.out.println("Seu Salário Final é de: " + salarioFinal);
		
	}
}