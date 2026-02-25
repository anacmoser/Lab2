import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o número 1: ");
		// variável
		int numero = sc.nextInt();
		
		// constante
		System.out.println("Digite o número 2: ");
		final int VALOR_FIXO = sc.nextInt();
		
		// cálculo
		int resultado = numero + VALOR_FIXO;
		
		// saída de dados
		System.out.println("Número: " + numero);
		System.out.println("Valor Fixo: " + VALOR_FIXO);
		System.out.println("Resultado: " + resultado);
	}
}
