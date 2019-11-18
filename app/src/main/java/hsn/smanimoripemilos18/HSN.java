package hsn.smanimoripemilos18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HSN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsn);
        Button password= (Button) findViewById(R.id.Pasword);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(HSN.this, OSIS1.class);
                startActivity(p);
                finish();
            }
        });

        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HSN.this, kadidat.class);
                startActivity(i);
            }
        });

        Button button = (Button)findViewById(R.id.poinahir);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent z = new Intent(HSN.this, poin.class);
               startActivity(z);
            }
        });

    }
}

