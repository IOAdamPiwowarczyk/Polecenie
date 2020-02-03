package polecenie2;

public class PolecenieWlaczSwiatlo implements Polecenie{

	Swiatlo swiatlo = new Swiatlo();;
	@Override
	public void wykonaj() {
		this.swiatlo.wlacz();
	}

	
}
