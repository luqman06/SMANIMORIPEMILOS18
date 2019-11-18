package hsn.smanimoripemilos18;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calonkadidat1 extends AppCompatActivity {

    int score = 0;

    TextView scoreCounter;
    Button increaseScore, decreaseScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calonkadidat1);
//
        scoreCounter = (TextView) findViewById(R.id.calon1view);
        increaseScore = (Button) findViewById(R.id.calon1button);
//        decreaseScore = (Button) findViewById(R.id.decreaseScore);

//        Load score
        SharedPreferences myscore1 = this.getSharedPreferences("Calon1", Context.MODE_PRIVATE);
        score = myscore1.getInt("score", 0);

        scoreCounter.setText("score : " + score);
        increaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;


//                save score
                SharedPreferences myScore1 = getSharedPreferences("Calon1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = myScore1.edit();
                editor.putInt("score", score);
                editor.commit();
                Intent intent = new Intent(calonkadidat1.this, paswordhsn.class);
                startActivity(intent);

                scoreCounter.setText("score : " + score);
                finish();
            }
        });
    }
}
