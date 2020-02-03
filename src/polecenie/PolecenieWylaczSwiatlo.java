package polecenie;

public class PolecenieWylaczSwiatlo implements Polecenie{

	Swiatlo swiatlo = new Swiatlo();;
	@Override
	public void wykonaj() {
		this.swiatlo.wylacz();
	}

	
}
