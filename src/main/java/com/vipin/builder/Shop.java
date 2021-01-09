package com.vipin.builder;

/**
 * The Class Shop.
 */
public class Shop {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// Phone phone = new Phone("Android", 2, "Qualcom", 5.5, 3100);
		/*
		 * here order does not matter for phone parameters at all
		 */
		Phone phone = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3100).getPhone();
		System.out.println(phone);
	}

}
