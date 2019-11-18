package hsn.smanimoripemilos18;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calonkadidat3 extends AppCompatActivity {

    int score = 0;

    TextView scoreCounter;
    Button increaseScore, decreaseScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calonkadidat3);

        scoreCounter = (TextView) findViewById(R.id.luqmanview);
//        scoreCounter = (TextView) findViewById(R.id.luqmanpoin);
        increaseScore = (Button) findViewById(R.id.luqmantombol);
//        decreaseScore = (Button) findViewById(R.id.decreaseScore);

//        Load score
        SharedPreferences myscore3 = this.getSharedPreferences("Calon3", Context.MODE_PRIVATE);
        score = myscore3.getInt("score", 0);

        scoreCounter.setText("score : " + score);
        increaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;

//                save score
                SharedPreferences myScore3 = getSharedPreferences("Calon3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = myScore3.edit();
                editor.putInt("score", score);
                editor.commit();
                Intent intent = new Intent(calonkadidat3.this, paswordhsn.class);
                startActivity(intent);

                scoreCounter.setText("score : " + score);
                finish();
            }
        });
    }
}
