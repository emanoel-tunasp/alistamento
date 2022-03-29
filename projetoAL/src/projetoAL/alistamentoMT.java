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
		System.out.println("EXEMPLO:JOÃO PEDRO");
		nome = alistamentoMT.nextLine();
		System.out.println("DIGITE IDADE:");
		System.out.println("EXEMPLO 22");
		idade = alistamentoMT.nextInt();
		System.out.println("DIGITE SUA ALTURA:");
		System.out.println("EXEMPLO 1.80");
		altura = alistamentoMT.nextDouble();
		System.out.printf("Seja bem vindo %s .Sua idade e  %d anos e sua altura e %.2f%n",nome,idade,altura);
		
		if (idade >= 18) {
			System.out.println("Seja qual for a forma escolhida, é preciso estar com os seguintes dados e documentação em mãos na hora do alistamento militar online:\r\n"
					+ "\r\n"
					+ "CPF;\r\n"
					+ "carteira de identidade ou carteira de trabalho;\r\n"
					+ "comprovante de endereço com CEP;\r\n"
					+ "e-mail; e\r\n"
					+ "telefone.\r\n"
					+ "Após preencher o formulário, o candidato deve imprimir seu Certificado de Alistamento Militar para comprovação de sua inscrição junto às Forças Armadas.\r\n "
					+ "O acesso é feito com o número do CPF e a senha criada no momento do cadastro no site de alistamento militar online.\r\n "
					+ " As mulheres e os eclesiásticos ficam isentos do serviço militar obrigatório em tempo de paz.\r\n ");
		}
		else {
			System.out.printf("Infelismente você ainda não tem 18 anos %s então ainda não pode se alistar",nome);
		}
		
		alistamentoMT.close();
	 
	}

}
