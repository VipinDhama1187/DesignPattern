package com.vipin;

import com.vipin.factory.OS;
import com.vipin.factory.impl.OperatingSystemFactory;

/**
 * The Class FactoryMain.
 */
public class FactoryMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		OperatingSystemFactory factory = new OperatingSystemFactory();
		OS obj = factory.getInstance("open");
		obj.spec();
	}
}
