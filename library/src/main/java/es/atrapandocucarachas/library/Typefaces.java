package es.atrapandocucarachas.library;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.Hashtable;

/**
 * @author Alejandro Platas Mallo
 * @version 1.00
 * @since 12/5/16
 */

public class Typefaces {
    private static final String TAG = Typefaces.class.getSimpleName();
    private static final Hashtable<String, Typeface> cache = new Hashtable<>();

    public static Typeface get(Context c, String assetPath) {
        synchronized (cache) {
            if (!cache.containsKey(assetPath)) {
                try {
                    Typeface t = Typeface.createFromAsset(c.getAssets(), assetPath);
                    cache.put(assetPath, t);
                    Log.i(TAG, "Loaded'" + assetPath);
                } catch (Exception e) {
                    Log.e(TAG, "Could not get typeface'" + assetPath
                            + "' because " + e.getMessage());
                    return null;
                }
            }
        }
        return cache.get(assetPath);
    }
}
