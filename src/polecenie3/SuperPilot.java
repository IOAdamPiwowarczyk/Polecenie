package polecenie3;

public class SuperPilot {
	Polecenie[] poleceniaWlacz = new Polecenie[7];
	Polecenie[] poleceniaWylacz = new Polecenie[7];
	Polecenie polecenieWycofaj = new PolecenieBrakPolecenia();
	
	public SuperPilot() {
		for(int i = 0; i < poleceniaWlacz.length; i++) {
			poleceniaWlacz[i] = new PolecenieBrakPolecenia();
			poleceniaWylacz[i] = new PolecenieBrakPolecenia();
		}
	}
	
	public void ustawPolecenie(int nr, Polecenie polecenieWlacz, Polecenie polecenieWylacz) {
		this.poleceniaWlacz[nr] = polecenieWlacz;
		this.poleceniaWylacz[nr] = polecenieWylacz;
	}
	
	public void wcisnietoPrzyciskWlacz(int nr) {
		this.poleceniaWlacz[nr].wykonaj();
		this.polecenieWycofaj = this.poleceniaWlacz[nr];
	}
	
	public void wcisnietoPrzyciskWylacz(int nr) {
		this.poleceniaWylacz[nr].wykonaj();		
		this.polecenieWycofaj = this.poleceniaWylacz[nr];
	}
	
	public void wcisnietoPrzyciskWycofaj() {
		this.polecenieWycofaj.wycofaj();
	}
	
	public String toString() {StringBuffer stringBuff = new StringBuffer();
	stringBuff.append("\n------ Remote Control -------\n");
	for (int i = 0; i < poleceniaWlacz.length; i++) {
	stringBuff.append("[slot " + i + "] " + poleceniaWlacz[i].getClass().getName()
	+ " " + poleceniaWylacz[i].getClass().getName() + "\n");}
	stringBuff.append("[undo] " + poleceniaWylacz.getClass().getName() + "\n");
	return stringBuff.toString();
	}
	
	
	
}
