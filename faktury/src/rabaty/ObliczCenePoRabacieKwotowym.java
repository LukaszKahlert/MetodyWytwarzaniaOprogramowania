package rabaty;
import main.Config;

public class ObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {

	double kwotaRabatu = Config.getInstance().getKwotaRabatu();
	@Override
	public double obliczCenePoRabacie(double cena) {
		
		return cena-1;
	}

}
