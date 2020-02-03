package polecenie;

public class PolecenieWlaczSwiatlo implements Polecenie{

	Swiatlo swiatlo = new Swiatlo();;
	@Override
	public void wykonaj() {
		this.swiatlo.wylacz();
	}

	
}
