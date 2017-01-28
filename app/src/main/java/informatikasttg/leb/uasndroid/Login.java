package informatikasttg.leb.uasndroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by MIRALLAS on 1/26/2017.
 */

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if ((user.equals("admin")) && (pass.equals("admin"))) {
                    Intent myIntent = new Intent(Login.this, MainActivity.class);
                    startActivity(myIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "Username " + user + " dan Password " + pass + " Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
