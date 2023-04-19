package model.services;

import java.text.SimpleDateFormat;

import model.entities.Cadastro;

public class FinanceiroService {

	
	
	private FuncionarioService funcionarioService;
		
	
	public FinanceiroService(FuncionarioService funcionarioService) {

		this.funcionarioService = funcionarioService;
	}

	double valorTotal=0.00;
	public double pagamento(FuncionarioService funcionarioService,double salario,int horas) {
		return valorTotal=funcionarioService.salario(salario, horas);
	}
	
	public String toString() {
		return "Salário: "+valorTotal;
	}
	
	
	
}
