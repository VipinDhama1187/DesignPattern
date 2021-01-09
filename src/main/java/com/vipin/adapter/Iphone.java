package com.vipin.adapter;

/**
 * The Class iPhone.
 * iPhone will get charge via iPhone charger but we don't have iPhone changer
 * but we have SamSung charger So we need an adapter which can take input from SamSung charger and 
 * charge the iPhone
 * Create a charger interface
 */
public class Iphone {
	
	/** The charger. */
	private Charger charger;
	
	
	/**
	 * Gets the charger.
	 *
	 * @return the charger
	 */
	public Charger getCharger() {
		return charger;
	}


	/**
	 * Sets the charger.
	 *
	 * @param charger the new charger
	 */
	public void setCharger(Charger charger) {
		this.charger = charger;
	}


	/**
	 * Charge.
	 *
	 * @param charge the charge
	 */
	public void chargeIphone(String charge) {
		charger.charge(charge);
	}
}
