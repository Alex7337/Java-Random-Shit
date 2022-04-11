import java.util.Scanner;
public class Tris {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[][] scacchiera = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		
		Tris t = new Tris();
		t.stampa(scacchiera);
		
		
		
		boolean x = false;
		int cont_mosse = 0;
		String y = "";
		
		while(x == false && cont_mosse<9) {
			if (cont_mosse % 2 == 0) {
				y = "X";
			}else y="O";
			
			System.out.println("Scegli una casella: ");
			String mossa = in.next();
			
			switch(mossa) {
				
			case "1":
				scacchiera[0][0] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
				
			case "2":
				scacchiera[0][1] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "3":
				scacchiera[0][2] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "4":
				scacchiera[1][0] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "5":
				scacchiera[1][1] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "6":
				scacchiera[1][2] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "7":
				scacchiera[2][0] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "8":
				scacchiera[2][1] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			case "9":
				scacchiera[2][1] = y;
				t.stampa(scacchiera);
				if(t.controllo(scacchiera) == true) {
					System.out.println("Ha vinto il giocatore : "+y);
					x = true;
					break;
				}
				break;
			}
			cont_mosse ++;
			
		}

	}
	
	public void stampa(String[][] scacchiera) {
		System.out.println(scacchiera[0][0] +  " | " + scacchiera[0][1] + " | "+ scacchiera[0][2]);
		System.out.println("__|___|___");
		System.out.println(scacchiera[1][0] +  " | " + scacchiera[1][1] + " | "+ scacchiera[1][2]);
		System.out.println("__|___|___");
		System.out.println(scacchiera[2][0] +  " | " + scacchiera[2][1] + " | "+ scacchiera[2][2]);

	}
	public boolean controllo(String[][] scacchiera) {
		if(scacchiera[0][0].equals(scacchiera[0][1]) && scacchiera[0][1].equals(scacchiera[0][2]) ) {
			return true;
		}
		if(scacchiera[1][0].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[1][2]) ) {
			return true;
		}
		if(scacchiera[2][0].equals(scacchiera[2][1]) && scacchiera[2][1].equals(scacchiera[2][2]) ) {
			return true;
		}
		if(scacchiera[0][0].equals(scacchiera[1][0]) && scacchiera[1][0].equals(scacchiera[2][0]) ) {
			return true;
		}
		if(scacchiera[0][1].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[2][1]) ) {
			return true;
		}
		if(scacchiera[0][2].equals(scacchiera[1][2]) && scacchiera[1][2].equals(scacchiera[2][2]) ) {
			return true;
		}
		
		if(scacchiera[0][0].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[2][2]) ) {
			return true;
		}
		if(scacchiera[0][2].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[2][0]) ) {
			return true;
		}
		
		return false;
	}
}
