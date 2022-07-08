package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Curso {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Valor que será depositado por mês: ");
		double value = sc.nextDouble();
		double sum = 0;
		System.out.println("Juros (%): ");
		double tax = sc.nextDouble();
		System.out.println("Tempo de investimento (Meses): ");
		int tempo = sc.nextInt();

		for (int i = 1; i <= tempo; i++) {

			double juros = sum * tax / 100;
			sum += value + juros;

			System.out.println(
					"Mes #" + i + "= " + String.format("%.2f", sum) + " Juros: " + String.format("%.2f", juros));
		}

		sc.close();
	}
}
