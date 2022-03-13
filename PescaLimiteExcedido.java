package git;
import java.util.Scanner;

public class PescaLimiteExcedido {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Quantidade de Peixes(em KG)");
		float pesca = scan.nextFloat();
		
		float pescaLimite = (pesca - 50);
		int multa = 4;
		float valorMulta = pescaLimite * multa;
		
		System.out.println("Você teve uma pesca de " + "KG " + pesca );
			if (pescaLimite > 0.0) {
				float totalPagar = valorMulta + pesca;
					System.out.println("Conforme regulamento de pesca do estado de São Paulo \n");
					System.out.println("Você deve pagar uma multa de: R$ " + multa + " Por quilo excedido!" + "\n" 
					+ "Multa = R$ " + valorMulta + "\n"
					+ "Totalizando: " + "R$ " + totalPagar);
			}else System.out.println("Você está dentro do estabelecido pelo regulamento de pesca do estado de São Paulo");	
		}
}
