package curso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExercicioMap {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String path = "c:\\temp\\int.txt";

		Map<String, Integer> plist = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] pLine = line.split(", ");
				String nome = pLine[0];
				Integer votos = Integer.parseInt(pLine[1]);
				if (plist.containsKey(nome)) {
						plist.put(nome, votos+plist.get(nome));
					}else {
						plist.put(nome, votos);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}

		for (String key : plist.keySet()) {
			System.out.println(key + " - " + plist.get(key));
		}

		sc.close();
	}
}
