
//para ver si se ha hecho login con anterioridad
private SharedPreferences spref;



onCreate(){

spref = getSharedPreferences("preferences",Context.MODE_PRIVATE);

Intent intentLogin = new Intent(this, LoggyActivity.class);
Intent intentMain = new Intent(this, MainActivity.class);

  if(!Utils.getUserMailPref().isEmpty && !Utils.getUserPassPref.isEmpty()){
    startActivity(intentMain);
  }
  else {
    startActivity(intentLogin);
  }
  finishi();
}

private void getUserMailPref(){
  return spref.getString("email","");
}

private void getUserPassPref(){
  return spref.getString("pass","");
}
