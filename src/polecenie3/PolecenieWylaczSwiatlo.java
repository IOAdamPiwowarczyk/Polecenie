package polecenie3;

public class PolecenieWylaczSwiatlo implements Polecenie{

	Swiatlo swiatlo = new Swiatlo();;
	@Override
	public void wykonaj() {
		this.swiatlo.wylacz();
	}
	@Override
	public void wycofaj() {
		this.swiatlo.wlacz();
	}

	
}
