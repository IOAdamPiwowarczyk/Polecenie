package polecenie3;

public class PolecenieStereoWylacz implements Polecenie{
	Stereo stereo = new Stereo("lokacja1");

	@Override
	public void wykonaj() {
		stereo.off();
	}

	@Override
	public void wycofaj() {
		stereo.on();
	}

}
