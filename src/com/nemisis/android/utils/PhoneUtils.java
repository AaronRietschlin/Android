package com.nemisis.android.utils;

import android.os.Build;

/**
 * A utility class for interacting with the device. Has such methods as
 * is[Version]OrGreater that determines if the device has a certain Android
 * version, amongst others.
 */
public class PhoneUtils {

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 2.3 (API 9).
	 */
	public static boolean isGingerBreadOrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 2.3.3 (API 10).
	 */
	public static boolean isGingerBreaMr1dOrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD_MR1;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 3.0 (API 11).
	 */
	public static boolean isHoneycombOrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 3.1 (API 12).
	 */
	public static boolean isHoneycombMr1OrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 3.2 (API 13).
	 */
	public static boolean isHoneycombMr2OrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 4.0 (API 14).
	 */
	public static boolean isIcsOrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 4.0.3 (API 15).
	 */
	public static boolean isIcsMr1OrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 4.1 (API 16).
	 */
	public static boolean isJellyBeanOrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
	}

	/**
	 * Determines if the device has a version of android that is greater than
	 * Android 4.2 (API 17).
	 */
	public static boolean isJellyBeanMr1OrGreater() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
	}
}
