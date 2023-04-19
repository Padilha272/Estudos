package model.services;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private OnlinePaymentService service;
	private Contract contract;
	
		
	public ContractService() {

	}

	public ContractService(OnlinePaymentService service) {
		this.service = service;
	}

	public OnlinePaymentService getService() {
		return service;
	}

	public void setService(OnlinePaymentService service) {
		this.service = service;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	
	public void processContract(Contract contract, Integer months) {
		
		double parcela = contract.getTotalValue()/months;
		for(int i=1;i<=months;i++) {
			double taxa1 = parcela + service.interest(parcela, i);
			//parcela=taxa1;
			double taxa2 = taxa1 + service.paymentFee(taxa1);
			
			
			Date dueDate = addMonths(contract.getDate(),i);
			contract.getInstallments().add(new Installment(dueDate,taxa2));
			System.out.println("Data: "+sdf.format(dueDate));
			System.out.println("Taxa1: "+taxa1);
			System.out.println("Taxa2: "+taxa2);
								
		}		
								
	}
	
	private Date addMonths(Date data, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
	
	
}
