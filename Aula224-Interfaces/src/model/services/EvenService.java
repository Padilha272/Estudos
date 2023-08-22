package model.services;

import java.util.List;

public class EvenService implements NumberService {

	@Override
	public Object value(List<?> list) {
		int even_numbers = 0;
		for (Object item : list) {
			if(item instanceof Integer) {
				int number = (Integer)item;
				if (number % 2 == 0) {
					even_numbers += 1;
				}
			}
			
		}
		return even_numbers;
	}

}
