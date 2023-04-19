package model.entities;

import java.text.SimpleDateFormat;

public class Cadastro {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String numeroCadastro;
	private Pessoa pessoa;
	private Departamento departamento;
	
	public Cadastro() {

	}

	public Cadastro(String numeroCadastro, Pessoa pessoa, Departamento departamento) {
		this.numeroCadastro = numeroCadastro;
		this.pessoa = pessoa;
		this.departamento = departamento;
	}

	public String getNumeroCadastro() {
		return numeroCadastro;
	}

	public void setNumeroCadastro(String numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	
	
	
	
	
	@Override
	public String toString() {
		return "Cadastro #" + numeroCadastro + "\nNome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf()
				+ "\nData de nascimento: "+sdf.format(pessoa.getNascimento()) +"\nDepartamento: "+departamento.getNome() 
				+ "\nCódigo: "+departamento.getCodigo();
	}
	
	
	
	
}
