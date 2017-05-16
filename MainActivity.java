private SharedPreferences spref;

private EditText email;
private EditText pass;
private Switch remember;
private Button btnLogin;

onCreate {

  BindUI();
  //recuperar las spref

}


private void BindUI(){
// referencias
email = (EditText) findViewById(R.id.editTextEmail);
pass = (EditText) findViewById(R.id.editTextPass);
rememeber = (Switch) findViewById(R.id.SRemember);
btnLOgin = (Button) findViewById(R.id.btnLog);
}

private void logOut(){
  Intent logout = new Intent(this,LoggyActivity.class);
  logout.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TAKS);
  startActivity(logout);
}
public boolean onCreateOptionsMenu(Menu menu){
  getInflater().inflate(R.menu.menu_main, menu);
  return true;
}

public boolean onOptionsItemSelected(MenuItem item){
  switch (item.getItemId()){
    case R.id.item1:
      logOut();
      return true;
    case R.id.item2:
      logOut();
      Utils.deleteUserAndPass(spref);
      return true;
    default:
      return super.onOptionsItemSelected(item);  
  }
}
