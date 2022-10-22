package comportamentoDeMemoria;

public class ForEachEx {

	public static void main(String[] args) {
		
		String vect[] = new String[] {"maria","bob","alex"};
		int a=0;
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}

		System.out.println("---------------------");
		for(String obj : vect) {
			a++;
			
			
			if(obj=="alex"){
				System.out.println(a);			
				
			
			}
	}
		}
}
