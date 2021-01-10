package tmalcher.study.com.acitivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import tmalcher.study.com.R;
import tmalcher.study.com.config.ConfigFirebase;
import tmalcher.study.com.model.User;

public class SignupActivity extends AppCompatActivity {

    private EditText _Name, _Email, _Password;
    private Button _btnRegister;
    private FirebaseAuth authentication;
    private User _user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        _Name = findViewById(R.id.editTextRegisterName);
        _Email = findViewById(R.id.editTextRegisterEmail);
        _Password = findViewById(R.id.editTextRegisterPassword);
        _btnRegister = findViewById(R.id.btnRegister);

        _btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtName = _Name.getText().toString();
                String txtEmail = _Email.getText().toString();
                String txtPassword = _Password.getText().toString();

                if(txtEmail.isEmpty() || txtName.isEmpty() || txtPassword.isEmpty() ){
                    Toast.makeText(SignupActivity.this,
                            "Please, fill in all fields!",
                            Toast.LENGTH_SHORT).show();
                }else{
                    _user = new User();
                    _user.setUserName(txtName);
                    _user.setUserEmail(txtEmail);
                    _user.setUserPassword(txtPassword);
                    registerUser();
                }
            }
        });
    }

    public void registerUser() {

        authentication = ConfigFirebase.getFirebaseAuthentication();
        authentication.createUserWithEmailAndPassword(
                _user.getUserEmail(), _user.getUserPassword()
        ).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(SignupActivity.this,
                            "Sucess to register with us!",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignupActivity.this,
                            "Failed to register with us!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}