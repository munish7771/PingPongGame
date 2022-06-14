package hk.ust.cse.comp107x.alpha;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    SharedPreferences prefs;
    String dataName = "heha";
    String intName = "huha";
    int defaultInt = 0;
    public static int hiScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefs = getSharedPreferences(dataName,MODE_PRIVATE);
        hiScore = prefs.getInt(intName,defaultInt);
        Button classic,ninja;
        classic = (Button)findViewById(R.id.button1);
        ninja = (Button)findViewById(R.id.button2);
        TextView HI = (TextView)findViewById(R.id.hi);
        HI.setText("HI:" + hiScore);
        classic.setOnClickListener(this);
        ninja.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case  R.id.button1:
                Intent i;
                i = new Intent(this,ClassicActivity.class);
                startActivity(i);
                break;
            case R.id.button2:
                Intent j;
                j = new Intent(this,NinjaActivity.class);
                startActivity(j);
                break;
        }

    }
}
