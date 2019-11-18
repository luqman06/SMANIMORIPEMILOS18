package hsn.smanimoripemilos18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OSIS1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osis1);

        Button kembali1 = findViewById(R.id.kembaliosis1);
        Button lanjut1 = findViewById(R.id.lanjutosis1);

        kembali1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k1 = new Intent(OSIS1.this, HSN.class);
                startActivity(k1);
                finish();
            }
        });



        lanjut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l1 = new Intent(OSIS1.this, OSIS2.class);
                startActivity(l1);
                finish();
            }
        });

    }
}
