package co.yosola.knowmexico;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
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

        currentTemp = cityView.findViewById(R.id.current_temperature);

        currentCondition = cityView.findViewById(R.id.condition_field);

        icon_weather = cityView.findViewById(R.id.icon_weather);

        findWeather();

        return cityView;

    }

    public void findWeather(){

        String url = "http://api.openweathermap.org/data/2.5/weather?q=Mexico%20City,mx&appid=e726b17a71ae9f8804ac5eb95fa34175&units=metric";
        JsonObjectRequest json = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try{
                    JSONObject mainJson = response.getJSONObject("main");
                    JSONArray arrayWeather = response.getJSONArray("weather");
                    JSONObject objectWeather = arrayWeather.getJSONObject(0);
                    String temp = String.valueOf(mainJson.getDouble("temp"));
                    String condition = objectWeather.getString("description");
                    String icon = objectWeather.getString("icon");


                    Double temp_int = Double.parseDouble(temp);
                    long temp_centi = Math.round(temp_int);

                    currentTemp.setText(String.valueOf(temp_centi + "C"));
                    currentCondition.setText(condition);

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

        RequestQueue queue = Volley.newRequestQueue(getActivity().getApplicationContext());
        queue.add(json);

    }
}
