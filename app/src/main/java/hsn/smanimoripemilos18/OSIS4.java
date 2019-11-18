package hsn.smanimoripemilos18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OSIS4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osis4);

        Button kembali4 = findViewById(R.id.kembaliosis4);
        Button lanjut4 = findViewById(R.id.lanjutosis4);

        kembali4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(OSIS4.this, HSN.class);
                startActivity(k4);
                finish();
            }
        });



        lanjut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l4 = new Intent(OSIS4.this, sandi.class);
                startActivity(l4);
                finish();
            }
        });

    }
}
