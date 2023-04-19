package model.entities;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Date nascimento;
	
	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, Date nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	

}
