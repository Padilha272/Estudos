package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		OnlinePaymentService payment = new PaypalService();
		
		System.out.println("Numero do contrato");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Data: ");
		Date data = sdf.parse(sc.nextLine());
		System.out.println("Valor total: ");
		double total = sc.nextDouble();
		Contract  contrato = new Contract(numero,data,total);
		System.out.println("Pacelas: ");
		Integer parcelas = sc.nextInt();
		PaypalService service = new PaypalService();
		ContractService cs = new ContractService(service);
		System.out.println(contrato);
		cs.processContract(contrato, parcelas);
		System.out.println(contrato.getInstallments());
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Valor total:");
		double valor = sc.nextDouble();
		System.out.println("Número de parcelas: ");
		Integer parcelas = sc.nextInt();
		double taxa1 = (valor/parcelas) + payment.interest(valor/parcelas, parcelas);
		double taxa2 = taxa1 + payment.paymentFee(taxa1);
		System.out.println("Taxa 1 : "+taxa1);
		System.out.println("Taxa 2 : "+taxa2);*/


	}

}
