package co.yosola.knowmexico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

        //Set all the to-do places in the ArrayList
        ArrayList<Place> todoPlaces = new ArrayList<Place>();

        todoPlaces.add(placesofMexico.getPlacebyIndex(0));
        todoPlaces.add(placesofMexico.getPlacebyIndex(1));
        todoPlaces.add(placesofMexico.getPlacebyIndex(2));
        todoPlaces.add(placesofMexico.getPlacebyIndex(3));
        todoPlaces.add(placesofMexico.getPlacebyIndex(4));
        todoPlaces.add(placesofMexico.getPlacebyIndex(5));
        todoPlaces.add(placesofMexico.getPlacebyIndex(6));
        todoPlaces.add(placesofMexico.getPlacebyIndex(7));
        todoPlaces.add(placesofMexico.getPlacebyIndex(8));
        todoPlaces.add(placesofMexico.getPlacebyIndex(9));

        PlaceAdapter todoAdapter = new PlaceAdapter(getContext(), todoPlaces);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(todoAdapter);


        return  rootView;
    }

}
