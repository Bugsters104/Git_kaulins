import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();

		for(int i=0; i<reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int reizes;
		do {
			System.out.println("Cik reizes mest kauliņu?");
			reizes = scan.nextInt();
		} while(reizes < 1);
		scan.close();
		mestKaulinu(reizes);
	}
}