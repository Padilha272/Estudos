package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula_241_ex2 {
	
	public static void main(String []srgs) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
		
	}
	public static void copy(List<? extends Number> source, List<? super Number> destiny ) {
		for(Number number: source) {
			destiny.add(number);
		}		
	}
	
	public static void printList(List<?> lista) {
		for (Object item: lista) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
}







