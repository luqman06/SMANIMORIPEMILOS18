package hsn.smanimoripemilos18;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class poin extends AppCompatActivity {
    TextView scoreCounter3, scoreCounter1,scoreCounter2;
    int score2 = 0;
    int score3 = 0;
    int score1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poin);
        scoreCounter2=findViewById(R.id.poinrais);
        scoreCounter3=findViewById(R.id.luqmanpoin);
        scoreCounter1=findViewById(R.id.poinnanang);




        SharedPreferences myscore2 = getSharedPreferences("Calon2", MODE_PRIVATE);
//        score = myscore3.getInt("score", 0) ;
        score2 = myscore2.getInt("score", 0);
        scoreCounter2.setText(" " + score2);

        SharedPreferences myscore3 = getSharedPreferences("Calon3", MODE_PRIVATE);
        score3=myscore3.getInt("score", 0);
        scoreCounter3.setText(" " + score3);

        SharedPreferences myscore1 = getSharedPreferences("Calon1", MODE_PRIVATE);
        score1=myscore1.getInt("score",0);
        scoreCounter1.setText(" "+ score1);
//        scoreCounter3.setText("", score3);


//        int scoreCounter = myscore3.getInt("score", 0);
//       scoreCounter.setText(myscore3.getInt("score", + score));


//        final SharedPreferences mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    }
//    public int save(){
//        SharedPreferences myscore3 = getSharedPreferences("Calon2", MODE_PRIVATE);
//        return myscore3.getInt("score", 0);
//    }
}
