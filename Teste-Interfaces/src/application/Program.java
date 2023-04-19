package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Cadastro;
import model.entities.Departamento;
import model.entities.Pessoa;
import model.services.FinanceiroService;
import model.services.FuncionarioService;
import model.services.SalarioService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastro de funcionário");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Cpf: ");
		String cpf =  sc.nextLine();
		System.out.print("Nascimento: ");
		Date data =sdf.parse(sc.nextLine());
		System.out.print("Departamento : ");
		String nomeDepartamento = sc.nextLine();
		System.out.print("Código: ");
		String codigo = sc.nextLine();
		System.out.print("Numero Cadastral: ");
		String numeroCadastro = sc.nextLine();
		Cadastro cadastro = new Cadastro(numeroCadastro,new Pessoa(nome,cpf,data), new Departamento(nomeDepartamento,codigo));
		System.out.println("Salário: ");
		double salario = sc.nextDouble();
		System.out.println("Horas trabalhadas: ");
		int horas =sc.nextInt();
		
		SalarioService funcionario = new SalarioService();
		FinanceiroService financeiro = new FinanceiroService(funcionario);
		financeiro.pagamento(funcionario, salario, horas);
		
		System.out.println(cadastro);
		
		System.out.println(financeiro);
		
		
		
	}

}
