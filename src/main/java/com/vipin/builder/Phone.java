package com.vipin.builder;

/**
 * The Class Phone.
 */
public class Phone {
	
	/** The os. */
	private String os;
	
	/** The ram. */
	private int ram;
	
	/** The processor. */
	private String processor;
	
	/** The screen size. */
	private double screenSize;
	
	/** The battery. */
	private int battery;

	/**
	 * Instantiates a new phone.
	 *
	 * @param os the os
	 * @param ram the ram
	 * @param processor the processor
	 * @param screenSize the screen size
	 * @param battery the battery
	 */
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}

}
