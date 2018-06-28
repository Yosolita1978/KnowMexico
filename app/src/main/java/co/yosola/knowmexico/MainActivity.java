package co.yosola.knowmexico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button starbutton = (Button) findViewById(R.id.button_start);
        starbutton.setText(getResources().getString(R.string.start));
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
    // Inflate the menu for the icon in the Action Bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_know, menu);
        return true;
    }
}
