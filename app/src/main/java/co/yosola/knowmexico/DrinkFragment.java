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
public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_do, container, false);

        //Start the allPlaces instance
        AllPlacesList placesofMexico = AllPlacesList.getAllPlaces(getContext());
        ArrayList<Place> todrinkPlaces = new ArrayList<Place>();
        todrinkPlaces = placesofMexico.getAllToDrinkPlaces();

        PlaceAdapter todoAdapter = new PlaceAdapter(getContext(), todrinkPlaces);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(todoAdapter);

        return  rootView;
    }

}
