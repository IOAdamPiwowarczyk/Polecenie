package polecenie2;

public class Klient {

	public static void main(String[] args) {
		SuperPilot pilot = new SuperPilot();
		PolecenieWlaczSwiatlo zapalSwiatlo = new PolecenieWlaczSwiatlo();
		PolecenieWylaczSwiatlo zgasSwiatlo = new PolecenieWylaczSwiatlo();
		
		pilot.ustawPolecenie(0, zapalSwiatlo, zgasSwiatlo);
		pilot.wcisnietoPrzyciskWlacz(0);
		pilot.wcisnietoPrzyciskWylacz(0);
		
		System.out.println(pilot);
		
	}
}
