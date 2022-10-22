package entities;

import java.util.Scanner;

public class Estudante {
	private String nome;
	private double nota1;
	private double nota2;
	
	public Estudante (String nome, double nota1,double nota2) {
		this.nome=nome;
		this.nota1=nota1;
		this.nota2=nota2;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	Scanner sc = new Scanner(System.in);
	public void aprovados() {
		System.out.println("Quantos alunos serão registrados ?");
		int n = sc.nextInt();
		Estudante vetor[]= new Estudante[n];
		for(int i = 0 ; i<vetor.length;i++) {
			sc.nextLine();
			vetor[i]= new Estudante("",0,0);
			System.out.println("Digite o nome, primeira nota e segunda nota do "+(i+1)+" aluno:");
			vetor[i].setNome(sc.nextLine());
			vetor[i].setNota1(sc.nextDouble());
			vetor[i].setNota2(sc.nextDouble());
		}
		System.out.println("Alunos Aprovados: ");
		for(int i = 0 ; i<vetor.length;i++) {
			if((vetor[i].getNota1()+vetor[i].getNota2())/2 >=6) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		
		
	}

	
	
	
	
	
	
	
	
}
