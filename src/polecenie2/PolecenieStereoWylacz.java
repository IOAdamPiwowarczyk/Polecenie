package polecenie2;

public class PolecenieStereoWylacz implements Polecenie{
	Stereo stereo = new Stereo("lokacja1");

	@Override
	public void wykonaj() {
		stereo.off();
	}

}
