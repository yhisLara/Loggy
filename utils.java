public class Utils {
  
 public static getUserMailPref(SharedPreferences preferences){return preferences.getString("email","");}
 
 public static getUserPassPref(SharedPreferences preferences){return preferences.getString("pass","");}
  
}
