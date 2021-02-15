package com.h5180054.selim_asik.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.h5180054.selim_asik.Utils.Constants;

public class PrefUtil {
    private  static SharedPreferences getPrefs(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
    public static void setOyuncuAdi(Context context,String deger)
    {
        getPrefs(context).edit().putString(Constants.PREF_USER_NAME_PARAMETER,deger).apply();
    }
    public static String getOyuncuAdi(Context context)
    {
        return getPrefs(context).getString(Constants.PREF_USER_NAME_PARAMETER,"");
    }

}
