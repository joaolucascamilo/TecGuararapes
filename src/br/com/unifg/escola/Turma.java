package br.com.unifg.escola;

import java.util.ArrayList;
import java.util.Date;

public class Turma {
	public String horario;
	public String data;
	public int numMinimo;

	public Turma(String horario, String data, int numMinimo) {
		this.horario = horario;
		this.data = data;
		this.numMinimo = numMinimo;
//		registraTurma(horario, data, numMinimo);
	}

	public String getHorarioTurma() {
		return horario;
	}

	public String getDataTurma() {
		return data;
	}

	public int getNumeroMinimo() {
		return numMinimo;
	}
	
	public static void registraTurma(String horario, String data, int numMin, String resposta) {
		Turma novaTurma = new Turma(horario, data, numMin);
		ArrayList<Turma> listaTurma = new ArrayList<Turma>();
		listaTurma.add(novaTurma);
		if(resposta.equals("S")) {
		for (Turma turma : listaTurma) {
			System.out.println("Horário: " + turma.getHorarioTurma() + " Data: " + turma.getDataTurma() + " Minimo de alunos: " + turma.getNumeroMinimo());
		}
		}
	}
}
