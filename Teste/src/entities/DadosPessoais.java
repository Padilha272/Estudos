package entities;

import java.util.Scanner;

public class DadosPessoais {
	private double altura;
	private char genero;
	
	public DadosPessoais(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	Scanner sc = new Scanner(System.in);
	public void dados() {
		System.out.print("Quantas pessoas serão registradas?");
		int n = sc.nextInt();
		DadosPessoais vetor[]= new DadosPessoais[n];
		double menor=0, maior=0;
		double mediaMulheres=0;
		int numeroHomens=0,numeroMulheres=0;
		for(int i = 0;i<vetor.length;i++) {
			vetor[i]=new DadosPessoais(0, 'a');
			System.out.print("Digite a altura da "+(i+1)+"a pessoa:");
			vetor[i].setAltura(sc.nextDouble());
			System.out.print("Digite o genero da "+(i+1)+"a pessoa:");
			vetor[i].setGenero(sc.next().charAt(0));
		}
		menor=vetor[0].getAltura();
		for(int i = 0;i<vetor.length;i++) {
			if(vetor[i].getAltura()>maior) {
				maior=vetor[i].getAltura();
			}
			if(vetor[i].getAltura()<menor) {
				menor=vetor[i].getAltura();
			}
			if(vetor[i].genero=='f') {
				mediaMulheres+=vetor[i].getAltura();
				numeroMulheres+=1;
			}
			if(vetor[i].genero=='m') {
				numeroHomens+=1;
			}
		}
		System.out.print("Menor altura: "+menor+"\n");
		System.out.print("Maior altura: "+maior+"\n");
		System.out.printf("Media da altura das mulheres: %.2f\n",(mediaMulheres/numeroMulheres));
		System.out.println("Numero de homens: "+numeroHomens+"\n");
		
		
	}
	
	
	
	
	
	
}
