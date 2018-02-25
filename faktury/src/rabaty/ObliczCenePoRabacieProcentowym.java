package rabaty;

import main.Config;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

	
	double procentRabatu = Config.getInstance().getProcentRabatu();
	
	@Override
	public double obliczCenePoRabacie(double cena) {
		return cena - cena*this.procentRabatu/100;
		
	}

}
