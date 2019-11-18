package hsn.smanimoripemilos18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class kadidat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kadidat);
        Button nanang = findViewById(R.id.button_nanang);
        Button rais = findViewById(R.id.button_rais);
        Button luqman = findViewById(R.id.button_luqman);



        nanang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent nanang2 = new Intent(kadidat.this, calonkadidat1.class);
                startActivity(nanang2);
                finish();
            }
        });



        rais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rais2 = new Intent(kadidat.this, calonkadidat2.class);
                startActivity(rais2);
                finish();
            }
        });

        luqman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luqman2 = new Intent(kadidat.this, calonkadidat3.class);
                startActivity(luqman2);
                finish();
            }
        });




//
    }
}
