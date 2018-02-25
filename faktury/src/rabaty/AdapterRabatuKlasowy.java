package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterRabatuKlasowy extends LosowyRabat implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		
		return cena-this.losujRabat();
	}

}
