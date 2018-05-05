package id.ac.unej.ilkom.dsc.tesmata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Index extends AppCompatActivity {
    private Button main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        main = (Button) findViewById(R.id.btnMain);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Index.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
