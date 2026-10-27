package com.example.loginscreen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        TextView message = findViewById(R.id.message);

        loginButton.setOnClickListener(view -> {
            String user = username.getText().toString().trim();
            String pass = password.getText().toString();

            if (user.isEmpty() || pass.isEmpty()) {
                message.setText("Please enter username and password.");
            } else {
                message.setText("Login button clicked successfully!");
            }
        });
    }
}
