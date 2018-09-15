package iics.sasot.seanmichael.sasotseanmichaelplab1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linear = (Button) findViewById(R.id.linear);
        Button relative = (Button) findViewById(R.id.relative);
        Button constraint = (Button) findViewById(R.id.constraint);

        linear.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
                Intent linear = new Intent(getApplicationContext(), LinearActivity.class);
                startActivity(linear);
            }
        });

        relative.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relative = new Intent(getApplicationContext(), RelativeActivity.class);
                startActivity(relative);
            }
        });

        constraint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent constraint = new Intent(getApplicationContext(), ConstraintActivity.class);
                startActivity(constraint);
            }
        });
    }
}
