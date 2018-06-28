package co.yosola.knowmexico;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_do, container, false);
        // Inflate the menu for the icon of the fragment
        setHasOptionsMenu(true);

        //Start the allPlaces instance
        AllPlacesList placesofMexico = AllPlacesList.getAllPlaces(getContext());

        //Start the to-eat Array
        ArrayList<Place> toeatPlaces = new ArrayList<Place>();
        toeatPlaces = placesofMexico.getAllToEatPlaces();

        //Start the Placeadapter and the ListView
        PlaceAdapter todoAdapter = new PlaceAdapter(getContext(), toeatPlaces);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Using bundle to send two extras with the intent
                Intent intent = new Intent(getActivity(), SinglePlaceActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("indexPlaceSelected", position);
                extras.putString("TypePlaceSelected", "toeat");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        listView.setAdapter(todoAdapter);

        return rootView;
    }

    // Create and connect the menu.xml file with the menu in the Tablayout of the fragment
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_toeat, menu);
    }
}
