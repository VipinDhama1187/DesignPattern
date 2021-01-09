package com.vipin.factory.impl;

import com.vipin.factory.Android;
import com.vipin.factory.Ios;
import com.vipin.factory.OS;
import com.vipin.factory.Windows;
import com.vipin.util.Constants;

/**
 * A factory for creating OperatingSystem objects.
 */
public class OperatingSystemFactory {

	/**
	 * Gets the single instance of OperatingSystemFactory.
	 *
	 * @param osType the os type
	 * @return single instance of OperatingSystemFactory
	 */
	public OS getInstance(String osType) {
		OS os;
		if (Constants.OPEN.equalsIgnoreCase(osType))
			os = new Android();
		else if (Constants.SECURE.equalsIgnoreCase(osType))
			os = new Ios();
		else
			os = new Windows();
		return os;
	}
}
