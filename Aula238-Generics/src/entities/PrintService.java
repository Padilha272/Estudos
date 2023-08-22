package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintService<T> {
	
	Scanner sc = new Scanner(System.in);
	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[ ");
		 for( Object x : list) {
			System.out.print(x+" ");
		 }
		 System.out.println("]");
	}
	/*public void printValue() {
		 
		 
		 System.out.print("how many values ? ");
		 int repete = sc.nextInt();
		 for(int i = 0;i<repete;i++) {
			 System.out.print("Tipe the "+(i+1)+"st number: ");
			 int value=sc.nextInt();			 	
			 list.add(value);			 					 		
		 }		
		 System.out.print("[ ");
		 for( int x : list) {
			System.out.print(x+" ");
		 }
		 System.out.println("]");
	}*/
}
