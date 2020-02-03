package polecenie;

public class Klient {

	public static void main(String[] args) {
		Pilot pilot = new Pilot();
		PolecenieOtworzIZapal otworzIZapal = new PolecenieOtworzIZapal();
		PolecenieWylaczSwiatlo zgas = new PolecenieWylaczSwiatlo();
		
		pilot.ustawPolecenie(otworzIZapal);
		pilot.wcisnijPrzycisk();
		
		pilot.ustawPolecenie(zgas);
		pilot.wcisnijPrzycisk();
	}
}
