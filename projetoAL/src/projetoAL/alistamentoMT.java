package projetoAL;

import java.util.Locale;
import java.util.Scanner;

public class alistamentoMT {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner alistamentoMT = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura; 
		System.out.println("===ALIASTAMENTO MILITAR===");
		
		System.out.println("DIGITE NOME  :");
		System.out.println("EXEMPLO:JO�O PEDRO");
		nome = alistamentoMT.nextLine();
		System.out.println("DIGITE IDADE:");
		System.out.println("EXEMPLO 22");
		idade = alistamentoMT.nextInt();
		System.out.println("DIGITE SUA ALTURA:");
		System.out.println("EXEMPLO 1.80");
		altura = alistamentoMT.nextDouble();
		System.out.printf("Seja bem vindo %s .Sua idade e  %d anos e sua altura e %.2f%n",nome,idade,altura);
		
		if (idade >= 18) {
			System.out.println("Seja qual for a forma escolhida, � preciso estar com os seguintes dados e documenta��o em m�os na hora do alistamento militar online:\r\n"
					+ "\r\n"
					+ "CPF;\r\n"
					+ "carteira de identidade ou carteira de trabalho;\r\n"
					+ "comprovante de endere�o com CEP;\r\n"
					+ "e-mail; e\r\n"
					+ "telefone.\r\n"
					+ "Ap�s preencher o formul�rio, o candidato deve imprimir seu Certificado de Alistamento Militar para comprova��o de sua inscri��o junto �s For�as Armadas.\r\n "
					+ "O acesso � feito com o n�mero do CPF e a senha criada no momento do cadastro no site de alistamento militar online.\r\n "
					+ " As mulheres e os eclesi�sticos ficam isentos do servi�o militar obrigat�rio em tempo de paz.\r\n ");
		}
		else {
			System.out.printf("Infelismente voc� ainda n�o tem 18 anos %s ent�o ainda n�o pode se alistar",nome);
		}
		
		alistamentoMT.close();
	 
	}

}
