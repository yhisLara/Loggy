
//para ver si se ha hecho login con anterioridad
private SharedPreferences spref;



onCreate(){

spref = getSharedPreferences("preferences",Context.MODE_PRIVATE);

Intent intentLogin = new Intent(this, LoggyActivity.class);
Intent intentMain = new Intent(this, MainActivity.class);

  if(!TextUtils.isEmpty(Utils.getUserMailPref(spref)) && !TextUtils.isEmpty(Utils.getUserPassPref(spref)){
    startActivity(intentMain);
  }
  else {
    startActivity(intentLogin);
  }
  finishi();
}
