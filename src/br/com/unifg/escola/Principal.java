package br.com.unifg.escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Ol�, bem vindo � escola de cursos TecGuararapes! ");
		System.out.println("-------------------------------------------------");
		System.out.println("CURSOS DISPON�VEIS: ");
		String resposta = "N";
		populaDados(resposta);
		System.out.println();
		System.out.print("Informe seu hor�rio de disponibilidade: ");
		String horarioAluno = leitor.next();
		
		System.out.println("Voc� se interessa por algum dos nossos cursos? (S ou N)");
		resposta = leitor.next().toUpperCase();
		
		if (resposta == resposta) {
		populaDados(resposta);
		System.out.println();
		System.out.println("Qual o curso: ");
		
		int respostaCurso = leitor.nextInt();
		
		switch (respostaCurso) {
		
		case 1:
			System.out.println("Iremos prosseguir com seu cadastro...");
			System.out.println("Digite o seu nome: ");
			String nome = leitor.next();
			System.out.println("Digite o seu CPF: ");
			long cpf = leitor.nextLong();
			System.out.println("Qual seu sexo: M ou F");
			char sexo = leitor.next().charAt(0);
			Aluno aluno = new Aluno(nome, cpf, sexo);
			break;
			
		case 2:
			System.out.println("Iremos prosseguir com seu cadastro...");
			System.out.println("Digite o seu nome: ");
			String nome1 = leitor.next();
			System.out.println("Digite o seu CPF: ");
			long cpf1 = leitor.nextLong();
			System.out.println("Qual seu sexo: M ou F");
			char sexo1 = leitor.next().charAt(0);
			Aluno aluno1 = new Aluno(nome1, cpf1, sexo1);
			break;
		
		case 3: 
			System.out.println("Iremos prosseguir com seu cadastro...");
			System.out.println("Digite o seu nome: ");
			String nome2 = leitor.next();
			System.out.println("Digite o seu CPF: ");
			long cpf2 = leitor.nextLong();
			System.out.println("Qual seu sexo: M ou F");
			char sexo2 = leitor.next().charAt(0);
			Aluno aluno2 = new Aluno(nome2, cpf2, sexo2);
			break;
		case 4:
			System.out.println("Iremos prosseguir com seu cadastro...");
			System.out.println("Digite o seu nome: ");
			String nome3 = leitor.next();
			System.out.println("Digite o seu CPF: ");
			long cpf3 = leitor.nextLong();
			System.out.println("Qual seu sexo: M ou F");
			char sexo3 = leitor.next().charAt(0);
			Aluno aluno3 = new Aluno(nome3, cpf3, sexo3);
			break;
		}
		
		}
		else {
			System.out.println("VOLTE SEMPRE!");
		}
		
		
		
	}
	public static void populaDados(String resposta) {
		//Registro de Turma e Curso Tecnologia da Informa��o
		Turma turmaTI = new Turma("19:00", "01/03/2022", 9);
		Curso cursoTI = new Curso("Tecnologia da Informa��o", turmaTI);
		cursoTI.registraCurso("1 - Tecnologia da Informa��o", turmaTI);
		turmaTI.registraTurma("19:00", "01/03/2022", 9, resposta);
		//Registro de Turma e Curso Log�stica
		Turma turmaLOG = new Turma("19:00", "12/12/2023", 100);
		Curso cursoLOG = new Curso("Log�stica", turmaLOG);
		cursoLOG.registraCurso("2 - Log�stica", turmaLOG);
		turmaLOG.registraTurma("19:00", "12/12/2023", 100, resposta);
		//Registro de Turma e Curso Administra��o
		Turma turmaADM = new Turma("12:30", "12/06/2023", 8);
		Curso cursoADM = new Curso("CursoADM", turmaADM);
		cursoADM.registraCurso("3 - Admnistra��o", turmaADM);
		turmaADM.registraTurma("12:30", "12/06/2023", 8, resposta);
		//Registro de Turma e Curso F�sica
		Turma turmaFIS = new Turma("07:00", "12/06/2022", 12);
		Curso cursoFIS = new Curso("F�sica", turmaFIS);
		cursoFIS.registraCurso("4 - F�sica", turmaFIS);
		turmaFIS.registraTurma("07:00", "12/06/2022", 12, resposta);
	};
	
	
	
}
