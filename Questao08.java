class Questao08{
	public static void main (String[]args){
/*Quais os valores armazenados em SOMA, NOME e TUDO, supondo-se que NUM, X, COR, DIA, TESTE 
e TESTE2 valem, respectivamente, 5, 2, "AZUL", "TERÇA", FALSE e TRUE? 
NOME = DIA 
SOMA = (NUM^2/X) + (X + 1) 
TUDO = !((TESTE || TESTE2) && (X != NUM))*/

//Definindo as Variaveis
int NUM = 5;
int x = 2;
String COR = "Azul";
String DIA = "terça";
boolean TESTE = false;
boolean TESTE2 = true;

//Calculando as variáveis
String NOME = DIA;
double SOMA = ((NUM * NUM) / x) + ( x +1);
boolean TUDO = !((TESTE || TESTE2) && (x != NUM));

//Exibindo resultados
		System.out.println("NOME = " + NOME);
        System.out.println("SOMA = " + SOMA);
        System.out.println("TUDO = " + TUDO);
	}
}