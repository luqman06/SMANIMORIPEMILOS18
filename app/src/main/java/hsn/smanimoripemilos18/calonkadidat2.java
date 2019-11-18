package hsn.smanimoripemilos18;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calonkadidat2 extends AppCompatActivity {

    int score = 0;

    TextView scoreCounter;
    Button increaseScore, decreaseScore;

    //    Button decreaseScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calonkadidat2);
        scoreCounter = (TextView) findViewById(R.id.calon2view);
        increaseScore = (Button) findViewById(R.id.calon2button);
//        decreaseScore = (Button) findViewById(R.id.decreaseScore);

//        Load score
        SharedPreferences myscore2 = this.getSharedPreferences("Calon2", Context.MODE_PRIVATE);
        score = myscore2.getInt("score", 0);

        scoreCounter.setText("score : " + score);
        increaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;

//                save score
                SharedPreferences myScore2 = getSharedPreferences("Calon2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = myScore2.edit();
                editor.putInt("score", score);
                editor.commit();
                Intent intent = new Intent(calonkadidat2.this, paswordhsn.class);
                startActivity(intent);

                scoreCounter.setText("score : " + score);
                finish();
            }
        });
    }
}
