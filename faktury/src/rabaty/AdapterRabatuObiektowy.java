package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterRabatuObiektowy implements IObliczCenePoRabacie {
	LosowyRabat lr = new LosowyRabat();
	
	@Override
	public double obliczCenePoRabacie (double cena){
		return cena - lr.losujRabat();
	}
	
		

}
