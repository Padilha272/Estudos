package model.services;

import java.util.List;

public class OddService implements NumberService{

	@Override
	public Object value(List<?> list) {
		int odd_number=0;
		for(Object item : list) {
			if(item instanceof Integer) {
				int number = (Integer)item;
				if(number%2!=0) {
					odd_number+=1;
				}
			}
		}
		return odd_number;
	}

	

	
	

}
