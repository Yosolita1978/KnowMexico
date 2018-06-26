package co.yosola.knowmexico;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cristina on 6/26/18.
 */

public class PlaceAdapter extends ArrayAdapter {

    public PlaceAdapter(Context context, ArrayList<Place> place) {
        super(context, 0, place);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_places, parent, false);
        }

        // Set up the current place
        Place currentPlace = (Place) getItem(position);

        TextView nameplaceTextView = listItemView.findViewById(R.id.place_name);
        nameplaceTextView.setText(currentPlace.getPlaceName());

        TextView descriptionTextView = listItemView.findViewById(R.id.place_description);
        descriptionTextView.setText(currentPlace.getPlaceShortDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        // Set the ImageView to the image resource specified in the current Word
        imageView.setImageDrawable(currentPlace.getImageResource());

        return listItemView;
    }
}
