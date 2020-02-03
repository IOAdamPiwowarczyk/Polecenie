package polecenie3;

public class PolecenieBrakPolecenia implements Polecenie{

	@Override
	public void wykonaj() {
		System.out.println("Brak polecenia");		
	}

	@Override
	public void wycofaj() {
		System.out.println("Brak polecenia do wycofania");		
	}

}
