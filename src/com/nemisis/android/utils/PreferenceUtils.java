package com.nemisis.android.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * A utility class that handles dealing with the SharedPreferences.
 */
public class PreferenceUtils {

	public static SharedPreferences prefs;

	// TODO - Change the name here.
	public static final String NAME = "preference_name";

	/**
	 * Builds the {@link #prefs} object with the name {@link #NAME}.
	 * 
	 * @param context
	 * @return
	 */
	public static SharedPreferences buildSharedPreferences(Context context) {
		if (prefs == null) {
			prefs = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
		}
		return prefs;
	}

	/**
	 * Commits the given SharedPreferences.Editor. If the device is greater than
	 * API 11, it will use {@link Editor#apply()}, otherwise it will use
	 * {@link Editor#commit()}.
	 * 
	 * @param editor
	 * @return Returns true if applied. It will only return false if
	 *         {@link Editor#commit()} fails.
	 */
	@SuppressLint("NewApi")
	public static boolean commit(SharedPreferences.Editor editor) {
		if (PhoneUtils.isGingerBreadOrGreater()) {
			editor.apply();
			return true;
		} else {
			return editor.commit();
		}
	}

}
