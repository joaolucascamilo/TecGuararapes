package br.com.unifg.escola;

public class Aluno {

	private String nome;
	private long cpf;
	private char sexo;
	private Curso curso;

	public Aluno(String nome, long cpf, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
