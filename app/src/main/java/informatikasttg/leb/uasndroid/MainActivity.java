package informatikasttg.leb.uasndroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button menumi = (Button) findViewById(R.id.menumi);

        menumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, menumi.class);
                startActivity(myIntent);
            }
        });
        Button ranjang = (Button) findViewById(R.id.ranjang);

        ranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ranjang.class);
                startActivity(myIntent);
            }
        });
        Button ceplak = (Button) findViewById(R.id.ceplak);

        ceplak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ceplak.class);
                startActivity(myIntent);
            }
        });
        Button cibiuk = (Button) findViewById(R.id.cibiuk);

        cibiuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, cibiuk.class);
                startActivity(myIntent);
            }
        });
        Button logout = (Button) findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Login.class);
                startActivity(myIntent);
            }
        });
        Button tentang = (Button) findViewById(R.id.tentang);

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, tentang.class);
                startActivity(myIntent);
            }
            });
    }
}
