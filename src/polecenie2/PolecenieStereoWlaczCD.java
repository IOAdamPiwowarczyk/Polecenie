package polecenie2;

public class PolecenieStereoWlaczCD implements Polecenie{
	Stereo stereo = new Stereo("lokacja1");

	@Override
	public void wykonaj() {
		stereo.on();
	}

}
