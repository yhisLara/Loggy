
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
 Toast.makeText(this,"this fields mail can't be empty,please try again",Toast.LENGHT_SHORT).show();
  return false;
}
 elseif(pass.lenght <= 0){
 Toast.makeText(this,"this fields pass can't be empty, please try again", Toast.LENGHT_SHORT).show();
   return false;
 }
 else{
   return true;
  }
}

private void goToMain(){
 Intent main = new Intent(this,MainActivity.class);
 //flags para cerrar activity y no regresar a la anterior
 main.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
 starActivity(main);
}

private void SavePreferences(email,password,remember){
  if(remember.isChecked()){
    SharedPreferences.Editor edtor = spref.edit();
    editor.putString("email",email);
    editor.putString("pass",pass);
    editor.commit();
    editor.apply();
  }
}

private void setCredentialIfExist(){
  String email = Utils.getUserMailPref(spref);
  String password = Utils.getUserPassPref(spref);
 
  if(email.lenght > 0 && pass.lenght > 0){
    mail.setText(email);
    pass.setText(pass);
    remember.setChecked(true);
  }
}
