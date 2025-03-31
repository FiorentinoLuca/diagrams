
public class Giocatore {
	
	/* Attributi */
	private String nominativo = "Guest_" + (conteggioDiGiocatori + 1);
	private String nickname = nominativo;
	private Dado dado = new Dado(1, 6);
	static private int conteggioDiGiocatori = 0;
	
	/* Costruttore */
	
	public Giocatore(String nominativo_attuale, String nickname_attuale) {
		
		conteggioDiGiocatori++;
		
		if (nominativo_attuale != null) {
			nominativo = nominativo_attuale;
		}
		
		if (nickname_attuale != null) {
			nickname = nickname_attuale;
		}
		
	}
	
	/* Metodi */
	
	public void stampa() {
		System.out.println("nominativo: " + nominativo + "nickname: " + getNickname());
	}

	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Dado getDado() {
		return dado;
	}

	public void setDado(Dado dado) {
		this.dado = dado;
	}
	
}
