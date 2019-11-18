package hsn.smanimoripemilos18;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class paswordhsn extends AppCompatActivity {
    EditText editText;

    Button button;

    String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paswordhsn);

        SharedPreferences settings = getSharedPreferences("PREFS", 0);
        password = settings.getString("password", "");


        editText = (EditText) findViewById(R.id.editTextpa2paswordhsn);
        button = (Button) findViewById(R.id.buttonpaswordhsn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                if (text.equals(password)){
//                    enter the app
                    Intent intent = new Intent(getApplicationContext(), HSN.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(paswordhsn.this, "Wrong password!", Toast.LENGTH_SHORT);

                }

            }
        });

        Button button = findViewById(R.id.poinahirsandi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(paswordhsn.this, poin.class);
                startActivity(z);
            }
        });



//        SharedPreferences
    }


}
