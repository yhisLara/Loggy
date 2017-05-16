public class Utils {
  
 public static getUserMailPref(SharedPreferences preferences){return preferences.getString("email","");}
 
 public static getUserPassPref(SharedPreferences preferences){return preferences.getString("pass","");}
  
 public static deleteUserAndPass(SharedPreferences preferences){
  preferences.edit().remove("email").commit();
  preferences.edit().remove("pass").commit();
  return true;
 }
  
}
