package polecenie2;

public class PolecenieBrakPolecenia implements Polecenie{

	@Override
	public void wykonaj() {
		System.out.println("Brak polecenia");		
	}

}
