package hsn.smanimoripemilos18;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OSIS2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osis2);


        Button kembali2 = findViewById(R.id.kembaliosis2);
        Button lanjut2 = findViewById(R.id.lanjutosis2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sirine);

        kembali2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k2 = new Intent(OSIS2.this, HSN.class);
                startActivity(k2);
                finish();
            }
        });



        lanjut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l2 = new Intent(OSIS2.this, OSIS3.class);
                startActivity(l2);
                mp2.start();
                finish();
            }
        });

    }
}
