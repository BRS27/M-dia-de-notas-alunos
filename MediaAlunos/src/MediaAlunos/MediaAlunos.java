package MediaAlunos;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Digite o nome do aluno ");
		String nomeAluno = scanner.nextLine();
		
		
		System.out.println(" Digite a primeira nota entre 0 e 10: ");
		Double nota1 = scanner.nextDouble();
		
		System.out.println(" Digite a segunda nota entre 0 e 10: ");
		Double nota2 = scanner.nextDouble();
		
		
		Double media = (nota1 + nota2) / 2;
		
		System.out.println( " A média do aluno é: " + media);
		
		if (media <= 6 ) {
			System.out.println(" Aluno em recuperação");
		}
			else {System.out.println(" Aluno aprovado");
			}
		
		scanner.close();
		}	
		
	}

