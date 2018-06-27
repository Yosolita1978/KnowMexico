package co.yosola.knowmexico;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SinglePlaceActivity extends AppCompatActivity {

    //The global values I will need, including context for the activity

    final Context context = this;
    Place currentPlace;


    //Start the allplaces list
    private AllPlacesList allplacesofMexico = AllPlacesList.getAllPlaces(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_place);

        //Grab the position of the current place with the intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int value = extras.getInt("indexPlaceSelected");
        String typePlaces = extras.getString("TypePlaceSelected");


        ArrayList<Place> placesbyType = new ArrayList<Place>();
        if(typePlaces.equals("todo")){
            placesbyType = allplacesofMexico.getAllToDoPlaces();
        } else if(typePlaces.equals("toeat")){
            placesbyType = allplacesofMexico.getAllToEatPlaces();
        } else {
            placesbyType = allplacesofMexico.getAllToDrinkPlaces();
        }

        currentPlace = placesbyType.get(value);


        //Change the tittle in the ActionBar for navigation
        String namelayout = currentPlace.getPlaceName();
        getSupportActionBar().setTitle(namelayout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //SetUp the name of the current Place
        TextView currentPlaceNameView = findViewById(R.id.single_place_name);
        currentPlaceNameView.setText(currentPlace.getPlaceName());

        //SetUp the long description of the current Place
        TextView shortDescriptionView = findViewById(R.id.single_place_desc);
        shortDescriptionView.setText(currentPlace.getPlaceLongDescription());

        //SetUp the image of the current place
        ImageView currentImage = findViewById(R.id.single_place_img);
        currentImage.setImageDrawable(currentPlace.getImageResource());

        //SetUp the button with the Address to google maps
        Button addressbutton = findViewById(R.id.single_place_google);
        final String currentPlaceAddress = currentPlace.getPlaceAddress();

        // Invoke googlemaps upon button click
        addressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + currentPlaceAddress);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        //SetUp the button with the url
        Button urlbutton = findViewById(R.id.single_place_url);
        final String currentPlaceurl = currentPlace.getPlaceUrl();

        // Invoke url upon button click
        urlbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentPlaceurl));
                startActivity(intent);
            }
        });


    }

}
