package co.yosola.knowmexico;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DoFragment extends Fragment {


    public DoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_do, container, false);

        //Start the allPlaces instance
        AllPlacesList placesofMexico = AllPlacesList.getAllPlaces(getContext());

        //Start the to-do places Array
        ArrayList<Place> todoPlaces = new ArrayList<Place>();
        todoPlaces = placesofMexico.getAllToDoPlaces();

        //Start the Placeadapter and the ListView
        PlaceAdapter todoAdapter = new PlaceAdapter(getContext(), todoPlaces);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Using bundle to send two extras with the intent
                Intent intent = new Intent(getActivity(), SinglePlaceActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("indexPlaceSelected", position);
                extras.putString("TypePlaceSelected", "todo");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        listView.setAdapter(todoAdapter);

        return  rootView;
    }

}
