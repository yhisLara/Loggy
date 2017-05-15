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
