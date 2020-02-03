package polecenie2;

public class Pilot {

	Polecenie polecenie;
	
	public void ustawPolecenie(Polecenie polecenie) {
		this.polecenie = polecenie;
	}
	
	public void wcisnijPrzycisk() {
		polecenie.wykonaj();
	}
}
