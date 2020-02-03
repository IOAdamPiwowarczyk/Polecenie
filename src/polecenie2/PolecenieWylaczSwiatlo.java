package polecenie2;

public class PolecenieWylaczSwiatlo implements Polecenie{

	Swiatlo swiatlo = new Swiatlo();;
	@Override
	public void wykonaj() {
		this.swiatlo.wylacz();
	}

	
}
