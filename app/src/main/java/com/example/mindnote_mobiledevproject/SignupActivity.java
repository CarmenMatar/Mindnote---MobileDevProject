package com.example.mindnote_mobiledevproject;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class SignupActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    TextInputLayout Fname;
    TextInputLayout Lname;
    TextInputEditText Email;
    TextInputEditText Password;

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Fname = findViewById(R.id.Firstname);
        Lname = findViewById(R.id.Lastname);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);

        loginButton = findViewById(R.id.LoginSignup);

        loginButton.setOnClickListener(view -> {
            createAccount(Email.getText().toString(),Password.getText().toString());
        });

    }

    private void createAccount(String email, String password) {
        // [START create_user_with_email]

        if(TextUtils.isEmpty(email)){
            Email.setError("Email cannot be empty!");
            Email.requestFocus();
        } else if (TextUtils.isEmpty(password)){
            Password.setError("Password cannot be empty!");
            Password.requestFocus();

        }else {
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI(user);
                                startActivity(new Intent(SignupActivity.this, MainActivity.class));
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(SignupActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                updateUI(null);
                            }
                        }
                    });
        }
        // [END create_user_with_email]
    }

    private void updateUI(FirebaseUser user) {

    }
}