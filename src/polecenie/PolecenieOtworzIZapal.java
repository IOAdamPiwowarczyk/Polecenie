package polecenie;

public class PolecenieOtworzIZapal implements Polecenie{
	DrzwiGarazu drzwiGarazu = new DrzwiGarazu();
	Swiatlo swiatlo = new Swiatlo();

	@Override
	public void wykonaj() {
		this.drzwiGarazu.otworz();
		this.swiatlo.wlacz();
	}
	

}
