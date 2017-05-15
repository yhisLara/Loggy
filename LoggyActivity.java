
private SharedPreferences spref;

private EditText mail;
private EditText pass;
private Switch remember;
private Button btnLog;

onCreate{

BindUI();

spref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
setCredentialIfExist();

btnlog.SetOnCLickListener(new View..){
  private void Onclick(){
    String email = mail.getText().toString();
    String password = pass.getText().toString();
      Verificar(email,password);
      goToMain();
      SavePreferences(email,password,remember);
    }
  }
}

private void BindUI(){

mail = (EditText) findViewById(R.id.editTextMail);
pass = (EditText) findViewById(R.id.editTextPass);
remember = (Switch) findViewById(R.id.SRemember);
btnLog = (Button) findViewById(R.id.btnLog);

}

private void Verificar(){

if(mail.lenght <= 0){
 Toast.makeText(this,"this fields mail can't be empty,please try again",Toast.LENGHT_SHORT).show();}
 elseif(pass.lenght <= 0){
 Toast.makeText(this,"this fields pass can't be empty, please try again", Toast.LENGHT_SHORT).show();}
 else{
  }
}

private void goToMain(){
 Intent main = new Intent(this,MainActivity.class);
 starActivity(main);
}

private void SavePreferences(email,password,remember){
  if(remember.isChecked()){
    SharedPreferences.Editor edtor = spref.edit();
    editor.putString("email",email);
    editor.putString("pass",pass);
    editor.putBoolean("swith",remember);
    editor.commit();
  }
}

private void setCredentialIfExist(){
  String email = spref.getString("email");
  String password = spref.getString("pass");
 
  if(email.lenght > 0 && pass.lenght > 0){
    mail.setText(email);
    pass.setText(pass);
    remember.setChecked(true);
  }
}
