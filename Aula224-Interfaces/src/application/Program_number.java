package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.services.EvenService;
import model.services.OddService;

public class Program_number {

	public static void main(String[] args) throws IOException {
		EvenService even = new EvenService();
		OddService odd = new OddService();
		Scanner sc = new Scanner(System.in);
		String path ="c:\\temp\\in2.txt";
		BufferedReader br = new BufferedReader( new FileReader(path));
		List<Integer> lista = new ArrayList<>();
		String line = br.readLine();
		
		while (line != null) {
		    line = line.trim();  // Remova espaços em branco antes e depois da linha
		    
		    if (!line.isEmpty()) {  // Verifique se a linha não está vazia após a remoção de espaços
		        System.out.println(line);
		        lista.add(Integer.parseInt(line));
		    }
		    
		    line = br.readLine();
		}

		System.out.println();
		for(int item : lista){
			System.out.println(item);
		}
		
		for (int item : lista) {
		    System.out.println("Item in List: " + item);
		}

			
		
		System.out.println();
		System.out.println(even.value(lista));
		System.out.println(odd.value(lista));
		
	}

}
