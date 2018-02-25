package rabaty;

public class ObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		
		return cena-1;
	}

}
