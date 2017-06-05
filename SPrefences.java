package ir.alirezanazari.app.handler;


import android.content.Context;
import android.content.SharedPreferences;

public class SPrefences {

    Context context ;
    SharedPreferences preferences;

    public SPrefences(Context c , String name ) {

        context = c;
        preferences = this.context.getSharedPreferences(name , Context.MODE_PRIVATE);

    }

    // string data
    public void putData(String key , String value){

        this.preferences.edit().putString(key , value).commit();
    }

    public String getData(String key , String defValue){

        return this.preferences.getString(key , defValue);
    }


    // int data
    public void putInt(String key , int value){

        this.preferences.edit().putInt(key , value).commit();
    }

    public int getInt(String key , int defValue){

        return this.preferences.getInt(key , defValue);
    }

    //bool data
    public void putBool(String key , boolean value){

        this.preferences.edit().putBoolean(key , value).commit();
    }

    public boolean getBool(String key , boolean defValue){

        return this.preferences.getBoolean(key , defValue);
    }

    //long data
    public void putLong(String key , long value){

        this.preferences.edit().putLong(key , value).commit();
    }

    public long getLong(String key , long defValue){

        return this.preferences.getLong(key , defValue);
    }
}
