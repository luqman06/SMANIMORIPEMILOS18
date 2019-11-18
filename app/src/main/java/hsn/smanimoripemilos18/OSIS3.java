package hsn.smanimoripemilos18;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OSIS3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osis3);

        Button kembali3 = findViewById(R.id.kembaliosis3);
        Button lanjut3 = findViewById(R.id.lanjutosis3);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sirine);


        kembali3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k3 = new Intent(OSIS3.this, HSN.class);
                startActivity(k3);
                mp3.start();
                finish();

            }
        });



        lanjut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l3 = new Intent(OSIS3.this, OSIS4.class);
                startActivity(l3);
                finish();
            }
        });

    }
}
