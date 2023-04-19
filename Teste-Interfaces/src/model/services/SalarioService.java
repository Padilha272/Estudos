package model.services;

public class SalarioService implements FuncionarioService {

	private static final double HORA_EXTRA=50.00;
	
	
	@Override
	public double salario(double valor,int horas) {
		if(horas<=8) {
			return valor;
		}
		else {
			return valor + (horas-8)*HORA_EXTRA;
		}
	}

	
	
}
