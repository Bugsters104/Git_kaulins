import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		Random rand = new Random();
		int skaitlis, lielakais=0;
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita :"+skaitlis);
			if(lielakais<skaitlis) {
				lielakais = skaitlis;
			}
		}
		System.out.println("Lielākais skaitlis metienu reizē ir "+lielakais);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int reizes;
		do {
			System.out.println("Cik reizes mest kauliņu?");
			reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);	
		scan.close();
	}
}