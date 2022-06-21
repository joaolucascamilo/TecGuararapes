package br.com.unifg.escola;

import java.util.ArrayList;

public class Curso {

	private String nome;
	private Turma turma;

	public Curso(String nome, Turma turma) {
		this.nome = nome;
		this.turma = turma;
//		registraCurso(nome, turma);
	}

	public String getNome() {
		return nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public static void registraCurso(String nome, Turma turma) {
		Curso novoCurso = new Curso(nome, turma);
		ArrayList<Curso> listaCurso = new ArrayList<Curso>();
		listaCurso.add(novoCurso);
		for (Curso curso2 : listaCurso) {
			System.out.println(curso2.getNome());
		}
	}

	
}
