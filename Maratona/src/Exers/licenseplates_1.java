package Exers;
import java.util.Scanner;

public class licenseplates_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] placaCodes = new int[7];
		String[] placaStrCodes = null;
		while (teclado.hasNext()) {
			placaStrCodes = teclado.nextLine().split(" ");
			//System.out.println(Arrays.toString(placaStrCodes));
			for (int i = 0; i < placaStrCodes.length; i++) {
				placaCodes[i] = Integer.parseInt(placaStrCodes[i]);
			}
			boolean valid = false;
			if (Character.isAlphabetic(placaCodes[0]) && 
				Character.isAlphabetic(placaCodes[1]) &&
				Character.isAlphabetic(placaCodes[2])) {
				if (Character.isDigit(placaCodes[3]) && 
					Character.isDigit(placaCodes[5]) &&
					Character.isDigit(placaCodes[6])) {
					if (Character.isAlphabetic(placaCodes[4])) {
						System.out.println("MERCOSUL");
						valid = true;
					}  
					if (Character.isDigit(placaCodes[4])) {
						System.out.println("ANTIGA");
						valid = true;
					}  
				}
			}
			if (!valid) {
				System.out.println("ERRO");
			}
		}
	}
}
