package com.vipin.builder;

/**
 * The Class PhoneBuilder.
 */
public class PhoneBuilder {
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
	 * Sets the os.
	 *
	 * @param os the os
	 * @return the phone builder
	 */
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	/**
	 * Sets the ram.
	 *
	 * @param ram the ram
	 * @return the phone builder
	 */
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	/**
	 * Sets the processor.
	 *
	 * @param processor the processor
	 * @return the phone builder
	 */
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	/**
	 * Sets the screen size.
	 *
	 * @param screenSize the screen size
	 * @return the phone builder
	 */
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	/**
	 * Sets the battery.
	 *
	 * @param battery the battery
	 * @return the phone builder
	 */
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public Phone getPhone() {
		return new Phone(this.os, this.ram, this.processor, this.screenSize, this.battery);
	}

}
