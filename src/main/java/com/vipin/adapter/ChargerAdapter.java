package com.vipin.adapter;

import com.vipin.samsung.SamsungCharger;

/**
 * The Class ChargerAdapter.
 */
public class ChargerAdapter implements Charger {

	/** The samsung charger. */
	private SamsungCharger samsungCharger = new SamsungCharger();


	/**
	 * Charge.
	 *
	 * @param charge the charge
	 */
	@Override
	public void charge(String charge) {
		samsungCharger.charge(charge);

	}

}
