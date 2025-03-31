
public class Starter {

	public static void main(String[] args) {
		
		Giocatore g1 = new Giocatore("Mario", "MarioGamer123");
		Giocatore g2 = new Giocatore(null, null);
		
		Partita_A_Dadi p1 = Partita_A_Dadi.iniziaPartita(g1, g2, 2, g1.getDado());
		
		System.out.println(p1);
		p1 = null;
		
		g2.setDado(null);
		g2.setDado(new Dado(0, 10));
		g2.setNickname("S1mple");
		
		p1 = Partita_A_Dadi.iniziaPartita(g1, g2, 10, g2.getDado());
		System.out.println(p1);
		p1 = null;

		Giocatore g3 = new Giocatore();
		p1 = Partita_A_Dadi.iniziaPartita(g3, g2, 5, g2.getDado());
		System.out.println(p1);
		p1 = null;
		
		System.out.println("Programma terminato correttamente");

	}

}
