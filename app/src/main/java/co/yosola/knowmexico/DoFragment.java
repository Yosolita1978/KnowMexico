package co.yosola.knowmexico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        ArrayList<Place> todoPlaces = new ArrayList<Place>();
        todoPlaces = placesofMexico.getAllToDoPlaces();

        PlaceAdapter todoAdapter = new PlaceAdapter(getContext(), todoPlaces);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(todoAdapter);


        return  rootView;
    }

}
