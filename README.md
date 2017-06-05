# SharedPreferences
ShredPreferences helper class (Android - java)

<b>java class for android programming and use easily form shared preferences in your code.<b>

# Usage

        // new the class (param 1 is : context , param 2 : preferences name)
        preferences = new SPrefences(this , app.prefrences.SETTING);

        //get data from preference
        isAutoLoad    = preferences.getInt (KEY , DEF_VALUE);
        name          = preferences.getData(app.prefrences.NAME      , "");
        isLighting    = preferences.getBool(app.prefrences.LIGHTING  , false);

        //set data to prefrences
        preferences.putInt(KEY , VALUE);
        preferences.putData(app.prefrences.NOTIFICATION , "0");
        preferences.putData(app.prefrences.ONLINE_STATE , true);
