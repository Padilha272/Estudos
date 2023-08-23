package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Homework {

	public static void main(String[] args) {
		String path = "c:\\Temp\\in5.txt";
		Map<String, Integer> urn = new HashMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while (line != null) {
				line = line.trim();
				if (!line.isEmpty()) {
					String[] slice = line.split(",");
					String name = slice[0];
					Integer votes = Integer.parseInt(slice[1]);

					if (urn.containsKey(name)) {
						urn.put(name, urn.get(name) + votes);
					} else {
						urn.put(name, votes);
					}

				}

				line = br.readLine();
			}
			for (String key : urn.keySet()) {
				System.out.println(key + " : " + urn.get(key));
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
