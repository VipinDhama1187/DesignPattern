package com.vipin.adapter;

public class ChargingPhone {

	public static void main(String[] args) {
		Charger chargerAdapter = new ChargerAdapter();
		Iphone iphone = new Iphone();
		iphone.setCharger(chargerAdapter);
		iphone.chargeIphone("I am bit tired to charge the iPhone");
	}

}
