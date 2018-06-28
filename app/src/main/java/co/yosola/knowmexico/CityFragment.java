package co.yosola.knowmexico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {

    // Initiating the TextView and the ImageView of the fragment
    TextView currentTemp, currentCondition;
    ImageView icon_weather;

    public CityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View cityView = inflater.inflate(R.layout.fragment_city, container, false);
        // Inflate the menu for the icon of the fragment
        setHasOptionsMenu(true);

        // Finding the views in the current fragment
        currentTemp = cityView.findViewById(R.id.current_temperature);

        currentCondition = cityView.findViewById(R.id.condition_field);

        icon_weather = cityView.findViewById(R.id.icon_weather);

        // Calling the helper function
        findWeather();

        return cityView;

    }

    // Create and connect the menu.xml file with the menu in the Tablayout of the fragment
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_city, menu);
    }

    // Helper fuction to call the OpenWeather API with the help of Volley
    public void findWeather(){

        // Making the basic request to the url
        String url = "http://api.openweathermap.org/data/2.5/weather?q=Mexico%20City,mx&appid=e726b17a71ae9f8804ac5eb95fa34175&units=metric";
        JsonObjectRequest json = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                // Manipulating the JSON Object to find the values that the fragment needs
                try{
                    JSONObject mainJson = response.getJSONObject("main");
                    JSONArray arrayWeather = response.getJSONArray("weather");
                    JSONObject objectWeather = arrayWeather.getJSONObject(0);
                    String temp = String.valueOf(mainJson.getDouble("temp"));
                    String condition = objectWeather.getString("description");
                    // Converting this string to maintaining design
                    String conditionTitle = toTitleCase(condition);
                    String icon = objectWeather.getString("icon");


                    Double temp_int = Double.parseDouble(temp);
                    long temp_centi = Math.round(temp_int);

                    // Setting the values of the views to show
                    currentTemp.setText(String.valueOf(temp_centi + "c"));
                    currentCondition.setText(conditionTitle);

                    // Using Picasso to show the current icon weather
                    Picasso.get().load("http://openweathermap.org/img/w/" + icon + ".png")
                            .fit().into(icon_weather);

                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        // You have to had this final request according to the Volley documentation

        RequestQueue queue = Volley.newRequestQueue(getActivity().getApplicationContext());
        queue.add(json);

    }

    // Helper function to convert a string in Camel Case, to maintaining the design layout
    public static String toTitleCase(String str) {

        if (str == null) {
            return null;
        }

        boolean space = true;
        StringBuilder builder = new StringBuilder(str);
        final int len = builder.length();

        for (int i = 0; i < len; ++i) {
            char c = builder.charAt(i);
            if (space) {
                if (!Character.isWhitespace(c)) {
                    // Convert to title case and switch out of whitespace mode.
                    builder.setCharAt(i, Character.toTitleCase(c));
                    space = false;
                }
            } else if (Character.isWhitespace(c)) {
                space = true;
            } else {
                builder.setCharAt(i, Character.toLowerCase(c));
            }
        }

        return builder.toString();
    }
}
