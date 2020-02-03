package polecenie3;

public class PolecenieWlaczSwiatlo implements Polecenie{

	Swiatlo swiatlo = new Swiatlo();;
	@Override
	public void wykonaj() {
		this.swiatlo.wlacz();
	}
	@Override
	public void wycofaj() {
		this.swiatlo.wylacz();
	}

	
}
