package rabaty;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		return cena - cena*50/100;
		
	}

}
