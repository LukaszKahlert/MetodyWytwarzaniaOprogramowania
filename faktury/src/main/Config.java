package main;

import rabaty.*;

public class Config {

	private static Config instance = new Config();

	private Config() {
	}

	public static Config getInstance() {
		return instance;
	}

	public IObliczCenePoRabacie getLiczarkaRabatu()

	{
		return new ObliczCenePoRabacieProcentowym();
	}

}
