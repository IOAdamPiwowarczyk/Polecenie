package polecenie2;

public class SuperPilot {
	Polecenie[] poleceniaWlacz = new Polecenie[7];
	Polecenie[] poleceniaWylacz = new Polecenie[7];
	
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
	}
	
	public void wcisnietoPrzyciskWylacz(int nr) {
		this.poleceniaWylacz[nr].wykonaj();		
	}
	
	@Override
	 public String toString() {
	 StringBuffer stringBuff = new StringBuffer();
	 stringBuff.append("\n------ Remote Control -------\n");
	 for (int i = 0; i < poleceniaWlacz.length; i++) {
	 stringBuff.append("[slot " + i + "] " + poleceniaWlacz[i].getClass().getName()
	 + " " + poleceniaWylacz[i].getClass().getName() + "\n");
	 }
	 return stringBuff.toString();
	 }
	
	
}
