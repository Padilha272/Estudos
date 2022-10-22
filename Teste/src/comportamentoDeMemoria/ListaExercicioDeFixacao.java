package comportamentoDeMemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class ListaExercicioDeFixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		System.out.println("Quantos funcionários?");
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			Funcionario funcionario = new Funcionario(0,"",0);
			System.out.println("\nFuncionario #"+(i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Funcionario já existe");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			/*for(Funcionario testando:list) {
				while(testando.getId()==id){
					System.out.println("Funcionario já existe");
					System.out.print("Id: ");
					id = sc.nextInt();					
				}				
			}*/
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			funcionario = new Funcionario(id,nome,salario);
			list.add(funcionario);
				
		}
		
		System.out.print("Digite o id do funcionario que terá aumento: ");
		int idEscolhido = sc.nextInt();
		Funcionario pos = list.stream().filter(x->x.getId()==idEscolhido).findFirst().orElse(null);
		
		if(pos!=null) {
			System.out.println("Digite o percentual de aumento: ");
			double aumento=sc.nextDouble();
			pos.aumento(aumento);
		}
		else {
			System.out.println("Funcionario não encontrado =(");
		}
		/*int resp=0;
		for(Funcionario obj : list) {			
			if(obj.getId()==idEscolhido) {			
				resp=1;
			}		
		}
		if(resp==1) {
			System.out.println("Funcionario encontrado!");
			System.out.println("Digite o percentual de aumento: ");
			double aumento=sc.nextDouble();
			for(Funcionario obj : list) {			
				if(obj.getId()==idEscolhido) {
					obj.aumento(aumento);					
				}		
			}
		}else {
			System.out.println("Funcionario não encontrado =(");
		}*/
		System.out.println("\nLista de funcionarios: ");
		for(Funcionario obj : list) {
			System.out.println(obj.toString());
		}

	}
	
	public static boolean hasId(List<Funcionario> list,int id) {
		Funcionario emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return emp !=null;
	}
	
	

}









