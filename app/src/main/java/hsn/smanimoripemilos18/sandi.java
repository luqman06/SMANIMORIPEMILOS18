package hsn.smanimoripemilos18;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sandi extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandi);

        editText1 = (EditText) findViewById(R.id.editsandi1);
        editText2 = (EditText) findViewById(R.id.editsandi2);
        button = (Button) findViewById(R.id.buttonsandi);
        final Button Keluar = findViewById(R.id.buttonsandi2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

               Keluar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ls4 = new Intent(sandi.this, paswordhsn.class);
                        startActivity(ls4);
                        finish();
                    }
                });

                if (text1.equals("") || text1.equals("") ) {
//                    there the password
                    Toast.makeText(sandi.this, "No password entered!", Toast.LENGTH_SHORT).show();
                } else {
                    if (text1.equals(text2)){
//                        save the password
                        SharedPreferences settings = getSharedPreferences("PREFS", 0);
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putString("password", text1);
                        editor.apply();

//                        enter the app
                        Intent intent = new Intent(getApplicationContext(), sandi.class);
                        startActivity(intent);
                        finish();
                    } else {
//                        there is no match the password
                        Toast.makeText(sandi.this, "Password does't match!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
