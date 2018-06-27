package co.yosola.knowmexico;

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

        Button starbutton = (Button)findViewById(R.id.button_start);
        starbutton.setText("Start Your Visit");
        starbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tourIntent = new Intent(getApplicationContext(), TourActivity.class);
                startActivity(tourIntent);

                //Finish View once the Question is called.
                finish();
            }
        });
    }
}
